package vm_state_machine;

public interface VirtualMachineState {
	public void doPowerOn();
	public void doPowerOff();
	public void doSuspend();
	public void doReset();

}
