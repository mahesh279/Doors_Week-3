
public class FacadeDoor {
	
	
	private SetTimer settime;

	
	public FacadeDoor()
	{
		settime = new SetTimer();
		
	}
	
	
	public void DoorLocked()
	{
		settime.setTime();
	}
	
	

}
