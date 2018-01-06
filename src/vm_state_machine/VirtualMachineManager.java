package vm_state_machine;

public class VirtualMachineManager {
	VirtualMachineState powerOnState;
	VirtualMachineState powerOffState;
	VirtualMachineState suspendedState;
	VirtualMachineState currentState;

	public VirtualMachineManager() {
		powerOnState = new VmPoweredOn(this);
		powerOffState = new VmPoweredOff(this);
		suspendedState = new VmSuspended(this);
		currentState = powerOffState;
	}

	public void powerOn() {
		System.out.println("Powering on ... ");
		currentState.doPowerOn();
	}

	public void powerOff() {
		System.out.println("Powering off ... ");
		currentState.doPowerOff();
	}

	public void reset() {
		System.out.println("Resetting ... ");
		currentState.doReset();
	}

	public void suspend() {
		System.out.println("Suspending ... ");
		currentState.doSuspend();
	}

	public void setState(String nextState) {

		switch (nextState) {
		case "VmPoweredOff":
			currentState = powerOffState;
			break;
		case "VmPoweredOn":
			currentState = powerOnState;
			break;
		case "VmSuspended":
			currentState = suspendedState;
			break;

		}
	}

	public void showState() {
		System.out.println("Current state is " + currentState.getClass().getName());
	}

}
