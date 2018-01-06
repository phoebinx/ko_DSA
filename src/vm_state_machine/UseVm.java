package vm_state_machine;

public class UseVm {
	
	public static void main(String args[]) {
		VirtualMachineManager vmm = new VirtualMachineManager();
		vmm.showState();
		vmm.powerOn();
		vmm.powerOff();
		vmm.suspend();
		vmm.powerOn();
		vmm.reset();
	}

}
