import java.util.HashSet;
import java.util.Set;

/* Lectercise - a mixup of Lecture and Exercise */
public class Lectercise extends Lva {
	private Set<Exam> exams;

	public Lectercise(int coursenr, String title) {
		super(coursenr, title);
		// TODO Auto-generated constructor stub
		this.exams = new HashSet<Exam>();
	}

	public Set<Exam> getExams() {
		return exams;
	}

	public void setExams(Set<Exam> exams) {
		this.exams = exams;
	}

	public void addExam(Exam exam) {
		this.exams.add(exam);
	}
	
	public void removeExam(Exam exam) {
		this.exams.remove(exam);
	}
}
