package edu.nust.behavioral.chainofresponsibilitypattern;

public class HighHandler extends Handler {

	@Override
	public void handlerRequest(int i) {
		if(i < 300){
			System.out.println("highHandler pass the request.");
		}else{
			if(getSuccessor() != null){
				getSuccessor().handlerRequest(i);
			}else{
				System.out.println("//this is the last handler.//");
			}
		}
	}

}
