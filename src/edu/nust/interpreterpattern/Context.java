package edu.nust.interpreterpattern;

import java.util.HashMap;
import java.util.Map;
//保存“变量”类型的上下文
public class Context {
	private Map map = new HashMap();
	public void addVariable(Variable variableName,int value){
		map.put(variableName, value);
	}
	public int getVariableValue(Variable v){
		return (int) map.get(v);
	}
}
