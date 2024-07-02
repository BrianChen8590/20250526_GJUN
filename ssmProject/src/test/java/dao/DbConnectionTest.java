package dao;

import org.junit.Test;

public class DbConnectionTest {

	@Test
	public void testDB() {
		System.out.println(DbConnection.getDb());
	}

}
