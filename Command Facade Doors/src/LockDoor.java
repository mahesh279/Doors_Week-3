
public class LockDoor implements CommandDoors {
	
	DoorCommands door;
	public LockDoor(DoorCommands door)
	{
		this.door=door;
	}
	public void execute()
	{
		door.lockDoor();
	}

}
