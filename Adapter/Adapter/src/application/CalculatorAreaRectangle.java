package application;

public interface CalculatorAreaRectangle //adaptee
{
	double getAreaRectangle(Rectangle r);
}

class Calculator implements CalculatorAreaRectangle
{
	@Override
	public double getAreaRectangle(Rectangle r) 
	{
		return r.h * r.w;
	}	
}