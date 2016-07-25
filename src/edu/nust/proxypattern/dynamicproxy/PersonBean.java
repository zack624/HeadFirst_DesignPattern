package edu.nust.proxypattern.dynamicproxy;

public interface PersonBean {
	String getName();
	String getGender();
	int getScore();
	
	void setName(String name);
	void setGender(String gender);
	void setScore(int score);
}
