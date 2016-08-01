package edu.nust.j2ee.daopattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	private List<Student> sList;
	
	public StudentDaoImpl() {
		this.sList = new ArrayList<Student>();
		sList.add(new Student("zhao",1));
		sList.add(new Student("qian",2));
		sList.add(new Student("sun",3));
	}

	@Override
	public List<Student> getAll() {
		return sList;
	}

	@Override
	public Student getByName(String name) {
		for (Student student : sList) {
			if(student.getName().equals(name)){
				return student;
			}
		};
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		for (int i = 0 ; i < sList.size() ; i++) {
			if(sList.get(i).getId() == id){
				sList.remove(i);
				System.out.println("remove " + id + " success");
			}
		}
	}

}
