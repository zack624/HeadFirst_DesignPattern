package edu.nust.j2ee.daopattern;

import java.util.List;

public interface StudentDao {
	public List<Student> getAll();
	public Student getByName(String name);
	public void deleteStudent(int id);
}
