package by.htp.university;

public class Group {
		
//		instance variables
	
		private Student students[];
		private int studentsCount = 0;
		
//		constructors
		
		public Group(int number) {
			students = new Student[number];
		}
		
//		methods
		
		public void addStudent(Student student) {
			if(studentsCount < students.length) {
				students[studentsCount] = student;
				studentsCount++;
			} else {
				System.out.println("Groups is full of students");
			}
		
		}
		
		public void takeExam() {
			
			for(int i = 0; i < studentsCount; i++) {
				
				for (int j = 0; j < students[i].getSubjects().length; j++) {
					
					double mark = (double) Math.random() * 9 + 1;
					System.out.println("students " + students[i].getFullName() + " pass " + students[i].getSubjects()[j].getName() + " pass exam with mark " + mark);
					
					students[i].getSubjects()[j].setFinalMark(mark);
					System.out.println();
				}
			}
		}
		
		public void generateReport() {
			System.out.println("Group final report: ");
			for(int i = 0; i < studentsCount; i++) {
				
				System.out.println("Student:" + " " + students[i].getFullName());
				for (int j = 0; j < students[i].getSubjects().length; j++) {
					
					Subject current = students[i].getSubjects()[j];
					System.out.println(current.getName() + " - " + current.getFinalMark());
				}
			}
		}
}
