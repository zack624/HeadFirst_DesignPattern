package edu.nust.structural.compositepattern;
/**
 * 组合模式(Composite Pattern)
 * 将对象组成树形结构来表现"整体/部分"的层次关系,让客户以一致的方式处理个别对象和对象组合
 * @author zack
 * @since 2016年7月22日
 */
public class CustomerDemo {
	public static void main(String[] args) {
		MenuComponent dessertMenuLeaf = new MenuLeaf("dessert", "sweet", 1);
		MenuComponent teaMenuLeaf = new MenuLeaf("tea", "puckery",3);
		
		MenuComponent menu = new MenuNode("mainmenu","main menu");
		MenuComponent breakfastMenuLeaf = new MenuLeaf("morningleaf", "morningDescription",100);
		MenuComponent lanchMenuNode = new MenuNode("noon","noonDescription");
		MenuComponent dinerMenuNode = new MenuNode("evening","eveningDescrition");
		MenuComponent afternoonTeaMenuNode = new MenuNode("afternoontea","it also belongs noon");
		//存在问题,重复遍历了叶子节点
		afternoonTeaMenuNode.add(teaMenuLeaf);
		lanchMenuNode.add(afternoonTeaMenuNode);
		dinerMenuNode.add(dessertMenuLeaf);
		menu.add(breakfastMenuLeaf);
		menu.add(lanchMenuNode);
		menu.add(dinerMenuNode);
		
		Waitress ws = new Waitress(menu);
		ws.printMenu();
		System.out.println("end");
	}
}
