package application.model;

import java.util.HashMap;
import java.util.Map;

import application.Settings;

public class ShapeHandler 
{
	private Map<String, HalloweenShape> mappingShape;
	private static ShapeHandler sh = null;
	
	public static ShapeHandler getShapeHandler()
	{
		if (sh == null)
			sh =  new ShapeHandler();
		
		return sh;
	}
	
	private ShapeHandler()
	{
		mappingShape = new HashMap<String, HalloweenShape>();
		mappingShape.put(Settings.bat, new Bat());
		mappingShape.put(Settings.pumpkin, new Pumpkin());
		mappingShape.put(Settings.zombie, new Zombie());	
	}
	
	public HalloweenShape getShape(String type)
	{
		try
		{
			HalloweenShape hs = this.mappingShape.get(type);
			return CloneShape.clone(hs);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}
