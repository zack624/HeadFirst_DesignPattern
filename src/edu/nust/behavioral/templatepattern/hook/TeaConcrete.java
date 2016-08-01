package edu.nust.behavioral.templatepattern.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaConcrete extends Template{

	@Override
	public void addCondiments() {
		System.out.println("add some tea condiments.");
	}

	@Override
	public void brew() {
		System.out.println("brewing in boiled water.");
	}

	@Override
	public boolean hook() {
		System.out.println("------Do you need some condiments?------\n(y/n?)");
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
