package behavior.command;

public class AlramCommand implements Command {
	
	private Alram theAlarm;

	public AlramCommand(Alram theAlarm) {
		this.theAlarm = theAlarm;
	}

	@Override
	public void execute(boolean sw) {
		if(sw==true) {
			theAlarm.start();
		}
		else {
			theAlarm.end();
		}
	}
}
