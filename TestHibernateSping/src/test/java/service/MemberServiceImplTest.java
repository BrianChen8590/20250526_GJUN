package service;

import org.junit.jupiter.api.Test;

import entity.Member;
import service.impl.MemberServiceImpl;

public class MemberServiceImplTest {
	MemberServiceImpl msi = new MemberServiceImpl();

	@Test
	public void addMemberTest() {
		msi.addMember(new Member("ab", "t", "44", "taipei", "44"));
		System.out.println("success");
	}

	// @Test
	public void selectAllMember() {
		System.out.println(msi.selectAllMember());
		System.out.println("success");
	}

	// @Test
	public void updateMemberTest() {
		msi.updateMember(14, "teacher", "0000", "台北", "456");
		System.out.println("success");
	}

	// @Test
	public void deleteMemberTest() {
		msi.deleteMember(14);
		System.out.println("success");
	}
}