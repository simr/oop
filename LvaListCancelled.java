import java.util.HashSet;
import java.util.Set;

public class LvaListCancelled {
	private Set<Lva> lvalistcancelled;
	
	public LvaListCancelled () {
		this.lvalistcancelled = new HashSet<Lva>();
	}
	
	public LvaListCancelled (Set <Lva> lvalistcancelled) {
		this.lvalistcancelled = lvalistcancelled;
	}
	
	public Set<Lva> getLvaListCancelled() {
		return this.lvalistcancelled;
	}
	public void addlva(Lva lva) {
		this.lvalistcancelled.add(lva);
	}
	
	public void removelva(Lva lva) {
		this.lvalistcancelled.remove(lva);
	}
}