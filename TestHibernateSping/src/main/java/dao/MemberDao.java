package dao;

import java.util.List;

import entity.Member;

public interface MemberDao {
	// create
	void add(Member m);

	// read
	List<Member> selectAll();

	// update
	void update(Member m);

	// Delete
	void delete(Member m);

}