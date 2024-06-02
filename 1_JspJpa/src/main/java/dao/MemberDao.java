package dao;

import java.util.List;

import entity.Member;

public interface MemberDao {
	//create
	void add(Member m);
	
	
	//read
	List<Member> queryAll();
	List<Member> queryMember(String username,String password);
	List<Member> queryUsername(String username);
	Member queryById(int id);//find
	
	//update
	void update(Member m);
	
	
	//delete
	
	void delete(Member m);

}