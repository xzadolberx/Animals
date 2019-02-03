public class Cote extends Animal{
 

	int climbingHeght;
	String whatToClimb;

	public void setClimbingHeight(int hight)
	{
		this.climbingHeght = hight; 
	}

	public int getClimbingHeight()
	{
		return this.climbingHeght;
	}

	public void setWhatToClimb(String whatOne){
		this.whatToClimb = whatOne;
	}

	public String getWhatToClimb()
	{
		return whatToClimb;
	}

	public Cote () 
	{
			setVoice("meow");
	}

	public Cote (String voice, int legs) 
	{
		setVoice(voice);
		setLegs(legs);
	}

	public void climb (String whatToClimb, int climbHeight)
	{
		setClimbingHeight(climbingHeght);
		setWhatToClimb(whatToClimb);
		if (climbHeight >= 2)
			System.out.println("Проще нового завести, чем этого достать");
	}
}