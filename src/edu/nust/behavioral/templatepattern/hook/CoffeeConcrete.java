package edu.nust.behavioral.templatepattern.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeConcrete extends Template{

	@Override
	public void addCondiments() {
		System.out.println("add some sugar and milk.");
	}

	@Override
	public void brew() {
		System.out.println("brew in Coffee powder.");
	}

	@Override
	public boolean hook() {
		System.out.println("--------Do you need to add any condiments?---------\n(y/n?)");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(line.equalsIgnoreCase("y")){
			return true;
		}else if(line.equalsIgnoreCase("n")){
			return false;
		}
		return false;
	}
	
	

}
