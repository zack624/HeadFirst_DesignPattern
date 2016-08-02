package edu.nust.j2ee.interceptingfilterpattern;

public class BFilter implements Filter {

	@Override
	public void intercept() {
		System.out.println("B Filter has intercepted.");
	}

}
