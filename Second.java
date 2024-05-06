public class Second{
	
	private String redgNo;
	private String Name;
	
	public Second(String redgNo, String Name)
	{
		this.redgNo = redgNo;
		this.Name = Name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return redgNo + " " + Name;
	}
	
}
