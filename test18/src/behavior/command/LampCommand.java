package behavior.command;

public class LampCommand implements Command {

	private Lamp theLamp;
	
	public LampCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	@Override
	public void execute(boolean sw) {
		if(sw==true) {
			theLamp.turnOn();
		}
		else {
			theLamp.turnOff();
		}
	}
}
