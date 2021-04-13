package kr.ac.kopo.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.ac.kopo.service.LoginService;
import kr.ac.kopo.vo.LoginVO;

@Controller
@RequestMapping("/login/*")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	LoginService service;
	
//	@RequestMapping("/")	// localhost ~ /Main
//	public String main() {
//		return "index";	//이 “home”값은 리턴이 되면 스프링이 알아서 분석하고 자동으로 
//						//src/main/webapp/WEB-INF/views 안에 있는 home.jsp와 연결해준다. 
//	}
//	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post login");
		
		HttpSession session = req.getSession();
		LoginVO login = service.login(vo);
		
		if(login == null) {
			session.setAttribute("login", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("login", login);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		
		session.invalidate();
		
		return "redirect:/";
	}

}
