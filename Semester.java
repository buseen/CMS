package project;
import java.util.ArrayList;
public class Section {
	
	public int SectionId;
	public int SectionHour;
	
	public ArrayList<Students> student;
	
	public Section(int SectionId, SectionHour, ArrayList<Student> students) {
		super();
		SectionId = sectionId;
		SectionHour = sectionHour;
		this.students = students;
	}

	public void passingStates(){
		for(Student s : students){
			System.out.print(s + " ");
			s.showPassingState();
		}
	}
}



