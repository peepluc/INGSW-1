package application;

public interface BuilderInterface 
{
	void buildBody();
	void insertWheels();
	void addHeadLights();
	Product getVehicle();
}

class Car implements BuilderInterface
{
	private Product p = new Product();

	@Override
	public void buildBody() 
	{
		p.add("This is a body of a car");
	}

	@Override
	public void insertWheels() 
	{
		p.add("4 qheels are added at car");
	}

	@Override
	public void addHeadLights() 
	{
		p.add("2 head light are added at car");
	}

	@Override
	public Product getVehicle() 
	{
		return p;
	}
}

class MotorCycle implements BuilderInterface
{
	private Product p = new Product();

	@Override
	public void buildBody() 
	{
		p.add("This is a body of a motorcycle");
	}

	@Override
	public void insertWheels() 
	{
		p.add("4 qheels are added at motorcycle");
	}

	@Override
	public void addHeadLights() 
	{
		p.add("2 head light are added at motorcycle");
	}

	@Override
	public Product getVehicle() 
	{
		return p;
	}
}

