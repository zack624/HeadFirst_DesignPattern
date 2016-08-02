package edu.nust.j2ee.transferobjectpattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	private List<Student> students;
	
	public StudentBO() {
		students = new ArrayList<Student>();
		students.add(new Student("zhao", 18));
		students.add(new Student("qian",20));
		students.add(new Student("sun",22));
	}
	public List<Student> getAll(){
		return students;
	}
	
	public void addStu(Student s){
		students.add(s);
	}
	
	public void delStu(String stuName){
		for (int i = 0; i<students.size();i++) {
			if(students.get(i).getName().equalsIgnoreCase(stuName)){
				students.remove(i);
			}
		}
	}
	

}
