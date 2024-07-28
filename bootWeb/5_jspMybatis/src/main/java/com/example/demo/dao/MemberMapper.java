package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Member;

@Mapper//產生bean物件
public interface MemberMapper {
	
	@Insert("insert into member(name,username,password,address,phone) "
			+ "values(#{name},#{username},#{password},#{address},#{phone})")
	void add(Member m);
	
	@Select("select * from member")
	List<Member> selectAll();
	
	@Select("select * from member where username=#{username} and password=#{password}")
	List<Member> selectMember(String username,String password);
	
	@Select("select * from member where username=#{username} ")
	List<Member> selectUsername(String username);
	
	@Select("select * from member where id=#{id}")
	List<Member> selectById(int id);

	@Update("update member set name=#{name},address=#{address} where id=#{id}")
	void update(Member m);
	
	@Delete("delete from member where id=#{id}")	
	void delete(int id);

	
	
	
	

}
