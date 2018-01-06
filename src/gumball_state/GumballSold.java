package gumball_state;

public class GumballSold extends GumballMachineState {
	
	public GumballSold(GumballStateMachineManager gmm) {
		super(gmm);
	}
	
	public void dispenseGumball() {
		gumballCount--;
		if (gumballCount <= 0) {
			System.out.println("Machine Out of Gumballs");
			gmManager.setState(NoGumball.class.getSimpleName());
		} else {
			gmManager.setState(NoQuater.class.getSimpleName());
		}
	}

}
