package edu.nust.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	private static Map<String,Tree> treeMap = new HashMap<String,Tree>();
	
	public static Tree getTree(String name){
		Tree t = treeMap.get(name);
		if(t != null){
			return t;
		}else{
			//当需要添加的是不同实现类时，应使用反射
			Tree newTree = new ConcreteTree(name);
			treeMap.put(name, newTree);
			return newTree;
		}
	}
}
