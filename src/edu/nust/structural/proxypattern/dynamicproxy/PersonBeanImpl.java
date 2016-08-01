package edu.nust.structural.proxypattern.dynamicproxy;

public class PersonBeanImpl implements PersonBean {
	String name;
	String gender;
	int score;
	
	public PersonBeanImpl(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public int getScore() {
		return score;
	}
	
	//别人不能用
	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//自已不能用
	public void setScore(int score) {
		this.score = score;
	}

}
