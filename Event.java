import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Event {
	private Date registerindate, registeroutdate, checkoutdate;
	private Date now = new Date();
	private String title, description;
	private Set<Person> attendees = new HashSet<Person>();

	public Date getRegisterindate() {
		return registerindate;
	}

	public void setRegisterindate(Date registerindate) {
		this.registerindate = registerindate;
	}

	public Date getRegisteroutdate() {
		return registeroutdate;
	}

	public void setRegisteroutdate(Date registeroutdate) {
		this.registeroutdate = registeroutdate;
	}

	public Date getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}

	public void setRegisterDates (Date registerindate, Date registeroutdate, Date checkoutdate) {
		this.setCheckoutdate(checkoutdate);
		this.setRegisteroutdate(registeroutdate);
		this.setRegisterindate(registerindate);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void register(Person p) {
		if (registerindate != null && registeroutdate != null) {
			if (now.getTime() > this.registerindate.getTime() && now.getTime() < this.registeroutdate.getTime()) {
				this.attendees.add(p);
			}
		}
	}
	public void checkOut(Person p) {
		if (checkoutdate != null) {
			if (now.getTime() < this.checkoutdate.getTime()) {
				this.attendees.remove(p);
			}
		}
	}
	public Set<Person> getAttendies() {
		return this.attendees;
	}
}
