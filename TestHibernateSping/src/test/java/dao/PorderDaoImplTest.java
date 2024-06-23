package dao;

import java.util.List;

import org.junit.jupiter.api.Test;

import dao.impl.PorderDaoImpl;
import entity.Porder;

public class PorderDaoImplTest {

	private static PorderDaoImpl pdi = new PorderDaoImpl();

	// @Test
	public void addTest() {
		// Porder p=new Porder("a",1,2,3);
		// pdi.add(p);

		System.out.println("success");
	}

	// @Test
	public void selectAllTest() {
		List<Porder> l = pdi.selectAll();

		for (Porder p : l) {
			System.out.println(p.getId() + "\t" + p.getName());
		}

		System.out.println("select all success");
	}

	@Test
	public void selectByIdTest() {
		List<Porder> l = pdi.selectById(1);
		
		Porder[] p = l.toArray(new Porder[1]);

		System.out.println("success" + p[0].getName() + "\t" + p[0].getA());
	}

}