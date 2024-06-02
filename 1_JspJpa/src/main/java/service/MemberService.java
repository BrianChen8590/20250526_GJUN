package service;

import java.util.List;

import entity.Member;

public interface MemberService {
	//create
	void addMember(Member m);
	
	//read
	boolean selectByUsername(String username);
	Member LoginMember(String username,String password);
	List<Member> selectAll();
	String selectAll2();
	Member selectById(int id);
	
	//update
	void updateMember(int id,String name);
	void updateMember(int id,String name,String password,String address,String phone);
	
	//delete
	void deleteMember(int id);

}