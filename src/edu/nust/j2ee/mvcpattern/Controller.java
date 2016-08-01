package edu.nust.j2ee.mvcpattern;

public class Controller {
	private Student model;
	private View view;
	public Controller(Student model, View view) {
		super();
		this.model = model;
		this.view = view;
	}
	public Student getStudent() {
		return model;
	}
	public void setStudent(Student student) {
		this.model = student;
	}
	public View getView() {
		return view;
	}
	public void setView(View view) {
		this.view = view;
	}
	
	public void updateData(){
		view.showView(model.getName(), model.getAge());
	}
}
