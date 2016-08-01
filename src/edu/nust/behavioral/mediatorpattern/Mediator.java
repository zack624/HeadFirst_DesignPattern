package edu.nust.behavioral.mediatorpattern;

public class Mediator {
	Man man;
	Woman woman;
	
	public void getPartner(PersonColleague other){
		if(other instanceof Man){
			if(man == null){
				setMan((Man)other);
			}else{
				System.out.println("gay is shamed.");
			}
		}else if(other instanceof Woman){
			if(woman == null){
				setWoman((Woman)other);
			}else{
				System.out.println("gay is shamed.");
			}
		}
		if(man != null && woman != null){
			System.out.println(man.getName() + " with " + woman.getName());
		}
	}

	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}

	public Woman getWoman() {
		return woman;
	}

	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	
}
