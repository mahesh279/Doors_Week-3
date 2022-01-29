
public class CloseDoor implements CommandDoors {
	
	DoorCommands door;
	public CloseDoor(DoorCommands door)
	{
		this.door=door;
	}
	public void execute()
	{
		door.closeDoor();;
	}

}
