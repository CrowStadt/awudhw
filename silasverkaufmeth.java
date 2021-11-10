public class Mensch
{
		//Attribute
	private	int personalnr = 12324;
	private	boolean isstbanane = false;
	private String name = "Otto Normie";
	
	//constructor
	public Mensch(int personalnr_neu,boolean isstbanane_neu, String name_neu)
	{
		personalnr = personalnr_neu;
		isstbanane = isstbanane_neu;
		name = name_neu;
	}
	//Methoden
	public void issteinebanane()
	{
		isstbanane = true;
	}
	public void ändereperso(int status)
	{
	personalnr = status;
	}
}
