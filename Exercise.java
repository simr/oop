
public class Exercise extends Lva {
	private int groupsize;

	public Exercise(int coursenr, String title) {
		super(coursenr, title);
	}

	public int getGroupsize() {
		return groupsize;
	}

	public void setGroupsize(int groupsize) {
		this.groupsize = groupsize;
	}

	public boolean register(Person p) {
		return super.register(p);
		//TODO: tutor zuweisen
	}
}
