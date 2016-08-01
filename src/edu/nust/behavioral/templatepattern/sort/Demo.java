package edu.nust.behavioral.templatepattern.sort;
/**
 * 模板方式模式（Template Pattern）
 * @author zack
 * @since 2016年7月21日
 */
public class Demo {
	public static void main(String[] args) {
		Duck[] ducks = new Duck[]{
				new Duck("zhao",3),
				new Duck("qian",2),
				new Duck("sun",8),
				new Duck("li", 4)};
		
		print(ducks);
		DuckSort.sort(ducks);
		System.out.println("after sorting-----------------");
		print(ducks);
	}

	public static void print(Duck[] ducks) {
		for (Duck duck : ducks) {
			System.out.println(duck+".");
		}
	}
}
