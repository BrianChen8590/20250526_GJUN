package service.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService {

	static ApplicationContext a1 = new ClassPathXmlApplicationContext("sp1.xml");
	static MemberDaoImpl mdi = a1.getBean("mdi", MemberDaoImpl.class);

	@Override
	public void addMember(Member m) {
		mdi.add(m);

	}

	@Override
	public List<Member> selectAllMember() {
		// TODO Auto-generated method stub
		return mdi.selectAll();
	}

	@Override
	public String selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectMemberById(int id) {
		List<Member> l = mdi.selectById(id);
		Member[] m = l.toArray(new Member[1]);

		return m[0];
	}

	@Override
	public void updateMember(int id, String password, String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMember(int id) {
		// TODO Auto-generated method stub

	}

}