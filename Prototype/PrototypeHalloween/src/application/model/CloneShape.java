package application.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloneShape 
{
	public static HalloweenShape clone(HalloweenShape original)
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj")))
		{
			out.writeObject(original);
			return (HalloweenShape) in.readObject(); //it's a deep copy :)
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
}
