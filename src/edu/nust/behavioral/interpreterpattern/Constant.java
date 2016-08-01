package edu.nust.behavioral.interpreterpattern;
/**
 * TerminalExpression(终结符表达式) 
 * @author zack
 * @since 2016年7月28日
 */
public class Constant implements Expression {
	private int constantValue;
	
	
	public Constant(int constantValue) {
		super();
		this.constantValue = constantValue;
	}


	@Override
	public int interpret(Context c) {
		return constantValue;
	}

}
