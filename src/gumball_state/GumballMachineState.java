package gumball_state;

public class GumballMachineState implements GumballStateMachine{

	GumballStateMachineManager gmManager;
	int gumballCount = 5;
	
	public GumballMachineState(GumballStateMachineManager gmm) {
		gmManager = gmm;
	}
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		System.out.println("Cannot insert Quater in "+this.getClass().getSimpleName() +" state.");
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("Cannot eject Quater in "+this.getClass().getSimpleName() +" state.");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Cannot turn Crank in "+this.getClass().getSimpleName() +" state.");
		
	}

	@Override
	public void dispenseGumball() {
		// TODO Auto-generated method stub
		System.out.println("Cannot dispense Gumball in "+this.getClass().getSimpleName() +" state.");
		
	}
	

}
