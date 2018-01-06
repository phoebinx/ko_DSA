package gumball_state;

public class GumballStateMachineManager {
	GumballStateMachine hasQuaterState;
	GumballStateMachine noQuaterState;
	GumballStateMachine noGumballState;
	GumballStateMachine gumballSoldState;
	GumballStateMachine currentState;
	
	public GumballStateMachineManager() {
		hasQuaterState = new HasQuater(this);
		noQuaterState = new NoQuater(this);
		noGumballState = new NoGumball(this);
		gumballSoldState = new GumballSold(this);
		currentState = noQuaterState;
	}
	
	public void insertQuater() {
		System.out.println("Attempting to insert Quater");
		currentState.insertQuater();
		
	}
	
	public void ejectQuater() {
		System.out.println("Attempting to eject Quater");
		currentState.ejectQuater();
	}

	public void turnCrank() {
		System.out.println("Attempting crank turn");
		currentState.turnCrank();
		
	}
	
	public void dispenseBall() {
		System.out.println("Attempting dispensing the gumball");
		currentState.dispenseGumball();
	}
	
	public void setState(String nextState) {
		switch (nextState) {
		case "NoGumball":
			currentState = noGumballState;
			break;
		case "NoQuater":
			currentState = noQuaterState;
			break;
		case "HasQuater":
			currentState = hasQuaterState;
			break;
		case "GumballSold":
			currentState = gumballSoldState;
			break;

		}
	}
	
	public void showState() {
		System.out.println("Current state is " + currentState.getClass().getName());
	}
}
