package edu.nust.interpreterpattern;

/**
 * 解释器模式（Interpreter Pattern）
 * 定义一个语言的方法，建立一个解释器来解释该语言的句子
 * @author zack
 * @since 2016年7月28日
 */
public class MathematicianDemo {
	public static void main(String[] args) {
		Constant con = new Constant(5);
		Variable var = new Variable();

		Context c = new Context();
		c.addVariable(var, 10);
		
		Mul mul = new Mul(con, var);
		mul.interpret(c);
	}
}
