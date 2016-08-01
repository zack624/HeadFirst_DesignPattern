package edu.nust.behavioral.interpreterpattern;

public class Variable implements Expression {

	@Override
	public int interpret(Context c) {
		return c.getVariableValue(this);
	}

}
