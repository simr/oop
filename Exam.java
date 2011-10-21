import java.util.Date;

public class Exam extends Event {
	private Date date;
	private boolean verbal;
	private int groupsize;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isVerbal() {
		return verbal;
	}

	public void setVerbal(boolean verbal) {
		this.verbal = verbal;
	}

	public int getGroupsize() {
		return groupsize;
	}

	public void setGroupsize(int groupsize) {
		this.groupsize = groupsize;
	}

}
