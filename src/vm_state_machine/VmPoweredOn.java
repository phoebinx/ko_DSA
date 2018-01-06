package vm_state_machine;

public class VmPoweredOn extends VmState {

	public VmPoweredOn(VirtualMachineManager vmm) {
		super(vmm);
	}
	
	@Override
	public void doPowerOff() {
		vmManager.setState(VmPoweredOff.class.getSimpleName());
	}

	@Override
	public void doSuspend() {
		vmManager.setState(VmSuspended.class.getSimpleName());
		
	}

	@Override
	public void doReset() {
		vmManager.setState(VmPoweredOn.class.getSimpleName());
	}	
}
