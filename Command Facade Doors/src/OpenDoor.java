
public class OpenDoor implements CommandDoors {
	
	DoorCommands door;
	public OpenDoor(DoorCommands door)
	{
		this.door=door;
	}
	public void execute()
	{
		door.openDoor();
	}

}
