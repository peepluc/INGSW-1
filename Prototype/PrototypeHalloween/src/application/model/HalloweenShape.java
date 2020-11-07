package application.model;
import java.io.Serializable;

public class HalloweenShape implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String type;
	
	final public String getType() 
	{
		return type;
	}
	
	final public void setType(String type) 
	{
		this.type = type;
	}

	@Override
	public String toString() {
		return "HalloweenShape [type=" + type + "]";
	}
}
