package kr.ac.kopo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.MemberDao;
import kr.ac.kopo.dto.Member;
import kr.ac.kopo.exception.ApplicationException;
import kr.ac.kopo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public Member findMemberByIdAndPassword(String id, String pwd) {
//		Member member = memberDao.selectUserByIdAndPassword(id, pwd);
		
//		if(member == null) {//정보를 찾지 못함
//			throw new ApplicationException("아이디 또는 비밀번호 오류");
//		}
		
		return memberDao.selectUserByIdAndPassword(id, pwd);
	}
	
}
