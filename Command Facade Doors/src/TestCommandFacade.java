
public class TestCommandFacade {

	public static void main(String[] args) {
		
		
		
		DoorButton doorbutton = new DoorButton();
		DoorCommands door = new DoorCommands();
		
		doorbutton.setCommand(new OpenDoor(door));
		doorbutton.buttonPressed();
		
		doorbutton.setCommand(new CloseDoor(door));
		doorbutton.buttonPressed();		
		
		doorbutton.setCommand(new LockDoor(door));
		doorbutton.buttonPressed();		
		
		
		FacadeDoor facade = new FacadeDoor();
		
		facade.DoorLocked();
		

	}

}
