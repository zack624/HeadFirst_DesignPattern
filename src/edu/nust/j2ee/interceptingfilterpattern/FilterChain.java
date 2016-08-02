package edu.nust.j2ee.interceptingfilterpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	private List<Filter> filters;
	private Target target;
	
	public FilterChain() {
		this.filters = new ArrayList<Filter>();
	}

	public void addFilter(Filter f){
		filters.add(f);
	}

	public void setTarget(Target target) {
		this.target = target;
	}


//	public void intercept(){
//		for (Filter filter : filters) {
//			filter.intercept();
//		}
//	}
	
	public void doProcess(){
		filters.get(0).intercept();
		this.target.doProcess();
		filters.get(1).intercept();
	}
}
