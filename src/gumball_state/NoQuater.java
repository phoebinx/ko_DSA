package gumball_state;

import vm_state_machine.VmPoweredOn;

public class NoQuater extends GumballMachineState{
	public NoQuater(GumballStateMachineManager gmm) {
		super(gmm);
	}
	
	public void insertQuater() {
		gmManager.setState(HasQuater.class.getSimpleName());
	}


}
