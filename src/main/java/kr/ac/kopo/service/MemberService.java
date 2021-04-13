package kr.ac.kopo.service;

import kr.ac.kopo.dto.Member;

public interface MemberService {
	Member findMemberByIdAndPassword(String id, String pwd);
}
