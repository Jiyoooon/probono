package kr.ac.kopo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.ac.kopo.dto.Member;

@Mapper
public interface MemberDao {
	Member selectUserByIdAndPassword(@Param("id") String id, @Param("pwd") String pwd);
}
