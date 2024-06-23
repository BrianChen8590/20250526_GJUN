package service;

import org.junit.jupiter.api.Test;

import entity.Porder;
import service.impl.PorderServiceImpl;

public class PorderServiceImplTest {
	private static PorderServiceImpl psi = new PorderServiceImpl();

	// @Test
	public void addPorder() {
		psi.addPorder(new Porder("yy", 4, 5, 7));
		System.out.println("success");
	}

	// @Test
	public void updatePorderTest() {
		psi.updatePorder(3, 5, 7, 4);

		System.out.println("success");
	}

	@Test
	public void deletePorderTest() {
		psi.deletePorder(3);
		System.out.println("success");
	}

}