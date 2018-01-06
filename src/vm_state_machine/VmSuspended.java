package vm_state_machine;

public class VmSuspended extends VmState {
	
	public VmSuspended(VirtualMachineManager vmm) {
		super(vmm);
	}
	
	@Override
	public void doPowerOn() {
		vmManager.setState(VmPoweredOn.class.getSimpleName());	
		}
}
