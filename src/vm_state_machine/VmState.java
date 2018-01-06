package vm_state_machine;

public class VmState implements VirtualMachineState {

	VirtualMachineManager vmManager;
	
	public VmState(VirtualMachineManager vmm) {
		vmManager = vmm;
	}
	@Override
	public void doPowerOn() {
		System.out.println("Power On is not valid behaviour in "+this.getClass().getSimpleName() +" state.");
	}

	@Override
	public void doPowerOff() {
		System.out.println("Power Off is not valid behaviour in "+this.getClass().getSimpleName() +" state.");
	}

	@Override
	public void doSuspend() {
		System.out.println("Suspend is not valid behaviour in "+this.getClass().getSimpleName() +" state.");
	}

	@Override
	public void doReset() {
		System.out.println("Reset is not valid behaviour in "+this.getClass().getSimpleName() +" state.");
	}

}
