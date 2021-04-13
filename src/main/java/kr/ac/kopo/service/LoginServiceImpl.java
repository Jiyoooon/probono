package kr.ac.kopo.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.LoginDAO;
import kr.ac.kopo.service.LoginService;
import kr.ac.kopo.vo.LoginVO;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Inject LoginDAO dao;
	
	@Override
	public LoginVO login(LoginVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.login(vo);
	}

}
