package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Member;

@Mapper // 產生bean物件
public interface MemberMapper {

	// @Insert()
	void add(Member m);

	// @Select()
	List<Member> selectAll();

}
