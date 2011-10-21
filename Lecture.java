
public class Lecture extends Lva {
	private Exam exam;

	public Lecture(int coursenr, String title) {
		super(coursenr, title);
		// TODO Auto-generated constructor stub
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
