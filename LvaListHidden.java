import java.util.HashSet;
import java.util.Set;

public class LvaListHidden {
	private Set<Lva> lvalisthidden;
	
	public LvaListHidden () {
		this.lvalisthidden = new HashSet<Lva>();
	}
	
	public LvaListHidden (Set <Lva> lvalisthidden) {
		this.lvalisthidden = lvalisthidden;
	}
	
	public Set<Lva> getLvaListHidden() {
		return this.lvalisthidden;
	}
	public void addlva(Lva lva) {
		this.lvalisthidden.add(lva);
	}
	
	public void removelva(Lva lva) {
		this.lvalisthidden.remove(lva);
	}
}