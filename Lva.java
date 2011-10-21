public class Lva extends Event {
	private int coursenr;
	
	//constructor of Lva with needed data
	public Lva (int coursenr, String title) {
		this.setCourseNr(coursenr);
		this.setTitle(title);
	}
	
	public int getCourseNr() {
		return coursenr;
	}

	public void setCourseNr(int coursenr) {
		this.coursenr = coursenr;
	}
}