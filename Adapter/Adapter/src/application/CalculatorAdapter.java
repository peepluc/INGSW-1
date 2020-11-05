package application;

//adapter
public class CalculatorAdapter implements CalculatorAreaRectangle
{
	public Triangle t;
	Calculator c;
	
	public CalculatorAdapter(Triangle t) 
	{
		this.t = t;
	}
	
	@Override
	public double getAreaRectangle(Rectangle r) 
	{
		c = new Calculator();
		
		r.h = t.h;
		r.w = t.w * 0.5;
		
		return c.getAreaRectangle(r);
	}

	public static void main(String[] args) 
	{
		CalculatorAdapter ca = new CalculatorAdapter(new Triangle(10.5, 11.5));
		System.out.println(ca.getAreaRectangle(new Rectangle()));
	}
}
