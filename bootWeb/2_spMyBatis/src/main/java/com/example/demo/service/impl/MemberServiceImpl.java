package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberMapper;
import com.example.demo.model.Member;
import com.example.demo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mp;

	@Override
	public void addMember(Member m) {
		mp.add(m);

	}

	@Override
	public Member LoginMember(String username, String password) {
		List<Member> l = mp.selectMember(username, password);
		Member[] m = l.toArray(new Member[1]);
		Member M = null;
		if (l.size() != 0) {
			M = m[0];
		}

		return M;
	}

	@Override
	public boolean selectUsername(String username) {
		boolean x = false;
		List<Member> l = mp.selectUsername(username);
		if (l.size() != 0)
			x = true;
		return x;
	}

	@Override
	public List<Member> selectAllMember() {
		// TODO Auto-generated method stub
		return mp.selectAll();
	}

	@Override
	public void updateMember(int id, String name, String address) {
		/*
		 * 1.id--->調閱member-->轉array 2.setName , setAddress 3.update-->注入修改
		 */

		List<Member> l = mp.selectById(id);
		Member[] m = l.toArray(new Member[1]);
		m[0].setName(name);
		m[0].setAddress(address);

		mp.update(m[0]);

	}

	@Override
	public void deleteMember(int id) {
		mp.delete(id);

	}

}
