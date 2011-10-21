import java.util.Date;

public class Interview extends Event {
	private Date date;
	private Person interviewer;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Person getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(Person interviewer) {
		this.interviewer = interviewer;
	}
	

}
