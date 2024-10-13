package Exerccie02;

public class MotDico {
	private int num = (int)(Math.random() * 101);
	private String mot;
	private String definition;
	
	public String getMot()
	{
		return this.mot;
	}
	public String getDefinition()
	{
		return this.definition;
	}
	public void setDefinition(String s)
	{
		this.definition = s;
	}
	public void setMot(String s)
	{
		this.mot = s;
	}
	public boolean synonyme(MotDico m)
	{
		if(this.definition == m.definition)
			return true;
		else
			return false;
	}
	
}
