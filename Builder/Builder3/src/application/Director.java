package application;

public class Director 
{
	private BuilderInterface myBuilder;

	public void construct(BuilderInterface myBuilder) 
	{
		this.myBuilder = myBuilder;
		this.myBuilder.addHeadLights();
		this.myBuilder.insertWheels();
		this.myBuilder.buildBody();
	}
	
	
}
