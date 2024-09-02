package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department objs);
	void update(Department objs);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}