package edu.nust.chainofresponsibilitypattern;

public class MiddleHandler extends Handler {

	@Override
	public void handlerRequest(int i) {
		if(i < 200){
			System.out.println("middleHandler pass the request.");
		}else{
			if(getSuccessor() != null){
				getSuccessor().handlerRequest(i);
			}
		}
	}

}
