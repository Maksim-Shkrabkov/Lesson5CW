package by.htp.university;

public class Subject {
	
//	instance variables
	
	private String name;
	private double finalMark;
	
	
//	constructors
		
	public Subject() {

	}
	
	public Subject(String name) {
		//super();
		this.name = name;
		//this.finalMark = finalMark;
	}
	
	public Subject(String name, double finalMark) {
		super();
		this.name = name;
		this.finalMark = finalMark;
	}

//	Getters and setters

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getFinalMark() {
		return finalMark;
	}

	
	public void setFinalMark(double finalMark) {
		this.finalMark = finalMark;
	}
	
		
}
