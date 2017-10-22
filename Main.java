package by.htp.univer.runner;

import java.util.Date;

import by.htp.university.Group;
import by.htp.university.Student;
import by.htp.university.Subject;

public class Main {

	public static void main(String[] args) {
		
		//Create students
		
		Student stud1 = new Student("Ivanov Ivan Ivanov", new Date("2/01/1998"), 4);
		Student stud2 = new Student("petriv Petrov Petrov", new Date("2/01/1998"), 5);
		
		//Create subjects
		
		Subject math = new Subject("Math");
		Subject english = new Subject("English");
		Subject russian = new Subject("Rusian");
		Subject history = new Subject("History");
		Subject programming = new Subject("Java");
		Subject economy = new Subject("Economy");
		Subject geography = new Subject("Georgarphy");
		Subject paint = new Subject("Paint");
		
		//Add subjects to the students
		
		stud1.addDiscipline(math);
		stud1.addDiscipline(programming);
		stud1.addDiscipline(english);
		stud1.addDiscipline(economy);
		
		stud2.addDiscipline(russian);
		stud2.addDiscipline(history);
		stud2.addDiscipline(economy);
		stud2.addDiscipline(geography);
		stud2.addDiscipline(paint);
		
		//Create group of students
		
		Group group = new Group(10);
		
//		group.students = new Student[25];
//		group.students[0] = stud1;
//		group.students[1] = stud2;
		
		
		//Add students to the group
		
		group.addStudent(stud1);
		group.addStudent(stud2);
		
		//Call methods takeExam and generateReport
		
		group.takeExam();
		group.generateReport();
		
//		System.out.println(stud1.getFullName());
	}

}
