package edu.nust.behavioral.interpreterpattern;
/**
 * NotTerminalExpression
 * @author zack
 * @since 2016年7月28日
 */
public class Mul implements Expression {
	private Expression preExpression;
	private Expression nextExpression;
	
	public Mul(Expression preExpression, Expression nextExpression) {
		super();
		this.preExpression = preExpression;
		this.nextExpression = nextExpression;
	}

	@Override
	public int interpret(Context c) {
		int result = preExpression.interpret(c) * nextExpression.interpret(c);
		System.out.println("multiplication result is :" + result);
		return result;
	}

}
