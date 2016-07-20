package edu.nust.templatepattern.sort;

public class DuckSort {
	public static void sort(Object[] objects){
//		Head First Design Pattern上需要clone，无法理解
//		Object[] objects = os.clone();
		realSort(objects,objects.length);
	}

	public static void realSort(Object[] objects,int len) {
		for (int i=0;i<len - 1;i++) {
			//这里的compareTo即一个算法步骤，需要子类编写具体算法
			if(((Comparable) objects[i]).compareTo(objects[i+1]) > 0){
				swap(objects,i,i+1);
			}
		}
	}

	public static void swap(Object[] objects, int i, int j) {
		Object temp = objects[i];
		objects[i] = objects[j];
		objects[j] = temp;
	}
}
