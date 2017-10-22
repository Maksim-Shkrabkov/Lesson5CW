package by.htp.university;

import java.util.Date;

public class Student {
	
//	instance variables
	
	private String fullName;
	private Date birthDate;
	private Subject subjects[];
	private int subjectCount;
	
	
//	constructors
	
	public Student(String fullName, Date birthDate) {
		this.fullName = fullName;
		this.birthDate = birthDate;
	}
	
	public Student(String fullName, Date birthDate, int subjectCount) {
		this.fullName = fullName;
		this.birthDate = birthDate;
		
		if(subjectCount > 0) {
			subjects = new Subject[subjectCount];
		}
		
	}
	
//	Getters and setters
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Subject[] getSubjects() {
		return subjects;
	}
	
//	methods
	
	public void addDiscipline(Subject subject) {
		if(subject != null && subjectCount < subjects.length) {
			subjects[subjectCount] = subject;
			subjectCount++;
		} else {
			System.out.println("You are too smart student");
		}
	}


}

