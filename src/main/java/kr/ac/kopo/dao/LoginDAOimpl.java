package kr.ac.kopo.dao;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.vo.LoginVO;

public class LoginDAOimpl implements LoginDAO {
	@Inject
	private SqlSession sql;
	
	@Override
	public LoginVO login(LoginVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne("loginMapper.login", vo);
	}

	
}

