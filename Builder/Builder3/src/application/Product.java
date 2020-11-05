package application;

import java.util.ArrayList;

public class Product
{
	private ArrayList<String> a;
	
	public Product() 
	{
		a = new ArrayList<String>();
	}

	public void add(String part) 
	{
		a.add(part);
	}
	
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		for (String part: a)
		{
			sb.append(part + "\n");
		}
		return sb.toString();
	}
}
