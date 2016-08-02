package edu.nust.j2ee.interceptingfilterpattern;

public class AFilter implements Filter {

	@Override
	public void intercept() {
		System.out.println("A Filter has intercepted.");
	}

}
