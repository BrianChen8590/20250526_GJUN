package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import entity.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService {

	public static void main(String[] args) {
		new MemberServiceImpl().updateMember(2, "teacher", "99999", "高雄", "123456789");
	}

	@Override
	public void addMember(Member m) {
		new MemberDaoImpl().add(m);

	}

	@Override
	public boolean selectByUsername(String username) {
		List<Member> l = new MemberDaoImpl().queryUsername(username);
		boolean x = false;

		if (l.size() != 0)
			x = true;

		return x;
	}

	@Override
	public Member LoginMember(String username, String password) {
		List<Member> l = new MemberDaoImpl().queryMember(username, password);

		if (l.size() != 0) {
			Member[] m = l.toArray(new Member[l.size()]);// Member[] m=new Member[3];
			return m[0];
		} else {
			return null;
		}
	}

	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		return new MemberDaoImpl().queryAll();
	}

	@Override
	public String selectAll2() {

		return null;
	}

	@Override
	public Member selectById(int id) {

		return new MemberDaoImpl().queryById(id);
	}

	@Override
	public void updateMember(int id, String name) {
		Member m = selectById(id);
		m.setName(name);

		new MemberDaoImpl().update(m);

	}

	@Override
	public void updateMember(int id, String name, String password, String address, String phone) {
		Member m = selectById(id);
		m.setName(name);
		m.setPassword(password);
		m.setAddress(address);
		m.setPhone(phone);

		new MemberDaoImpl().update(m);

	}

	@Override
	public void deleteMember(int id) {
		// TODO Auto-generated method stub
		Member m = this.selectById(id);
		new MemberDaoImpl().delete(m);		

	}

}