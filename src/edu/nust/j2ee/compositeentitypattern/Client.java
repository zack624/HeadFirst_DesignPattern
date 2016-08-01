package edu.nust.j2ee.compositeentitypattern;

public class Client {
	private CompositeEntity ce;

	public Client() {
		this.ce = new CompositeEntity();
	}
	
	public void printData(){
		String[] datas = this.ce.getData();
		for (String data : datas) {
			System.out.println(data);
		}
	}
	
	public void setData(String data1,String data2){
		this.ce.setData(data1, data2);
	}
	
	
}
