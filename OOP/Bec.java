package OOP;

public class Bec {
	
	private float intensitate;
	private Color color;
	private int soclu;
	private boolean stare;
	
	public Bec()
	{
		this(20.5f,new Color(),27,false);
		
	}
	
	public Bec(float f, Color color2, int i, boolean b) {
		// TODO Auto-generated constructor stub
		intensitate=f;
		color=color2;
		soclu=i;
		stare=b;
	}

	public void aprindere()
	{
		stare=true;
	}
	
	public void stingere()
	{
		stare=false;
	}
	

}
