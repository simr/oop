import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Event {
	private Date registerindate, registeroutdate, checkoutdate;
	private Date now = new Date();
	private String title, description;
	private Set<Person> attendees = new HashSet<Person>();
	private Set<String> provides, depends;
	private int maxattendees = 0;
	
	public Event () {
	}

	public Date getRegisterindate() {
		return registerindate;
	}

	public void setRegisterindate(Date registerindate) {
		this.registerindate = registerindate;
		this.informAttendees("New Registerindate:" + registerindate.toString());
	}

	public Date getRegisteroutdate() {
		return registeroutdate;
	}

	public void setRegisteroutdate(Date registeroutdate) {
		this.registeroutdate = registeroutdate;
		this.informAttendees("New Registeroutdate:" + registeroutdate.toString());
	}

	public Date getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
		this.informAttendees("New Checkoutdate:" + checkoutdate.toString());
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
		this.informAttendees("New title: " + title);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		this.informAttendees("New description: " + description);
	}
	
	public void register(Person p) {
		if (registerindate != null && registeroutdate != null) {
			if (now.getTime() > this.registerindate.getTime() && now.getTime() < this.registeroutdate.getTime()) {
				//TODO: ausnahme
				if (p.hasDependencies(depends)) {
					this.attendees.add(p);
				}
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
	
	public void informAttendees(String text) {
		//TODO: sendmail?
	}

	public Set<String> getProvides() {
		return provides;
	}

	public void setProvides(Set<String> provides) {
		this.provides = provides;
	}

	public Set<String> getDepends() {
		return depends;
	}

	public void setDepends(Set<String> depends) {
		this.depends = depends;
	}

	public int getMaxattendees() {
		return maxattendees;
	}

	public void setMaxattendees(int maxattendees) {
		this.maxattendees = maxattendees;
	}
}
