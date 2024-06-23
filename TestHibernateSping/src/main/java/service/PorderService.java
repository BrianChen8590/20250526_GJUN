package service;

import java.util.List;

import entity.Porder;

public interface PorderService {
	void addPorder(Porder p);

	List<Porder> selectAllPorder();

	void updatePorder(int id, int a, int b);

	void updatePorder(int id, int a, int b, int c);

	void deletePorder(int id);
}