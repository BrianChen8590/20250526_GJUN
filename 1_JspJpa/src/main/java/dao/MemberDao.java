package dao;

import java.util.List;

import entity.Member;

public interface MemberDao {

	// create
	void add(Member m);

	// read
	List<Member> queryAll();

	Member queryMember(String username, String password);

	boolean queryUsername(String username);

	Member queryById(int id);

	// update
	void update(Member m);

	// delete

}
