package vm_state_machine;

public class VmPoweredOff extends VmState {

	public VmPoweredOff(VirtualMachineManager vmm) {
		super(vmm);
	}
	
	@Override
	public void doPowerOn() {
		vmManager.setState(VmPoweredOn.class.getSimpleName());
	}
}
