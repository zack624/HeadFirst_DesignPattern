package edu.nust.j2ee.compositeentitypattern;

public class CoarseGrainedObject {
	private Pojo1 pojo1;
	private Pojo2 pojo2;
	
	
	public CoarseGrainedObject() {
		this.pojo1 = new Pojo1();
		this.pojo2 = new Pojo2();
	}

	public void setData(String data1,String data2){
		pojo1.setData(data1);
		pojo2.setData(data2);
	}
	
	public String[] getData(){
		return new String[]{pojo1.getData(),pojo2.getData()};
	}
}
