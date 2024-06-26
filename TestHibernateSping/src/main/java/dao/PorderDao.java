package dao;

import java.util.List;

import entity.Porder;

public interface PorderDao {
	// c
	void add(Porder p);

	// r
	List<Porder> selectAll();

	List<Porder> selectById(int id);

	// u
	void update(Porder p);

	// d

	void delete(Porder p);

}