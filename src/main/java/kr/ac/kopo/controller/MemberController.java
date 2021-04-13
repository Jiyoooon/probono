package kr.ac.kopo.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.dto.Login;
import kr.ac.kopo.dto.Member;
import kr.ac.kopo.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	/*
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Locale locale, Model model, @RequestParam("id") String id, @RequestParam("pwd") String pwd, HttpSession session) {
		
		Member member = memberService.findMemberByIdAndPassword(id, pwd);
		
		if(member != null) {
			System.out.println("로그인 서공!");
			session.setAttribute("member", member);
		}else {
			System.out.println("로그인 실패");
			model.addAttribute("msg", "로그인 또는 비밀번호 오류");
		}
		return "index";
	}
*/
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> login2(Locale locale, Login login, HttpSession session) {
		Member member = memberService.findMemberByIdAndPassword(login.getId(), login.getPwd());
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(member != null) {
			System.out.println("로그인 서공!");
			map.put("result", "success");
			session.setAttribute("member", member);
		}else {
			System.out.println("로그인 실패");
			map.put("result", "fail");
			map.put("msg", "로그인 또는 비밀번호 오류");
		}
		
		System.out.println(map.get("result")+", "+map.get("msg"));
		//return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
		return map;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Locale locale, Model model, HttpSession session) {
		
		System.out.println("logout");
		session.invalidate();
		
//		return "index";
		return "redirect:/";
	}
}
