import java.util.HashSet;
import java.util.Set;


public class LvaList {
	private Set<Lva> lvalist;
	
	public LvaList() {
		this.lvalist = new HashSet<Lva>();
	}

	public LvaList(Set<Lva> lvalist) {
		this.lvalist = lvalist;
	}

	public Set<Lva> getLvalist() {
		return this.lvalist;
	}
	
	public void addlva(Lva lva) {
		this.lvalist.add(lva);
	}
	
	public void removelva(Lva lva) {
		this.lvalist.remove(lva);
	}
	

}