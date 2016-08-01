package edu.nust.j2ee.compositeentitypattern;

public class CompositeEntity {
	private CoarseGrainedObject cgo;

	public CompositeEntity() {
		this.cgo = new CoarseGrainedObject();
	}
	
	public void setData(String data1,String data2){
		this.cgo.setData(data1, data2);
	}
	
	public String[] getData(){
		return this.cgo.getData();
	}
}
