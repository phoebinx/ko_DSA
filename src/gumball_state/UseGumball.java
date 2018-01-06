package gumball_state;

public class UseGumball {
	public static void main(String args[]) {
		GumballStateMachineManager gm = new GumballStateMachineManager();
		gm.insertQuater();
		gm.ejectQuater();
		gm.insertQuater();
		gm.insertQuater();
		gm.turnCrank();
		gm.dispenseBall();
	}
	

}
