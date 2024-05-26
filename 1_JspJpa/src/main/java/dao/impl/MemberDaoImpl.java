package dao.impl;

import java.util.List;

import dao.DbConnection;
import dao.MemberDao;
import entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class MemberDaoImpl implements MemberDao {

	private EntityManager em = DbConnection.getDb();

	public static void main(String[] args) {
		// insert
//		Member m = new Member("ab", "o", "000", "taipei", "444");
//		new MemberDaoImpl().add(m);

		Member m = new MemberDaoImpl().queryById(1);
		System.out.println(m.getName());

	}

	@Override
	public void add(Member m) {

		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(m);
		et.commit();

	}

	@Override
	public List<Member> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member queryMember(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean queryUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Member queryById(int id) {
		return em.find(Member.class, id);
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub

	}

}
