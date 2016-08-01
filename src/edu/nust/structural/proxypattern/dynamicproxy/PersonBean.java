package edu.nust.structural.proxypattern.dynamicproxy;

public interface PersonBean {
	String getName();
	String getGender();
	int getScore();
	
	void setName(String name);
	void setGender(String gender);
	void setScore(int score);
}
