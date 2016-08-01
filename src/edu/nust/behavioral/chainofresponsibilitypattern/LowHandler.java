package edu.nust.behavioral.chainofresponsibilitypattern;

public class LowHandler extends Handler {

	@Override
	public void handlerRequest(int i) {
		if(i < 100){
			System.out.println("lowHandler pass the request.");
		}else{
			if(getSuccessor() != null){
				getSuccessor().handlerRequest(i);
			}
		}
	}

}
