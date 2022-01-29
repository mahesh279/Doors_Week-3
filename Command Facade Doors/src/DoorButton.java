
public class DoorButton {
	
	CommandDoors button;
	public DoorButton() {}
	public void setCommand(CommandDoors command)
	{
		button = command;
	}
	public void buttonPressed()
	{
		button.execute();
	}

}
