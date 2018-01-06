package gumball_state;

public class HasQuater extends GumballMachineState{
	public HasQuater(GumballStateMachineManager gmm) {
		super(gmm);
	}
	
	public void ejectQuater() {
		gmManager.setState(NoQuater.class.getSimpleName());
	}
	
	public void turnCrank() {
		gmManager.setState(GumballSold.class.getSimpleName());
	}
}
