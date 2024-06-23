package service;

import java.util.List;

import entity.Member;

public interface MemberService {
	void addMember(Member m);

	List<Member> selectAllMember();

	void updateMember(int id, String name, String password, String address, String phone);

	void deleteMember(int id);
	
	String selectAllMemberTable();

}