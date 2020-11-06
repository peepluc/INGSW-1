package application;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloneClass 
{
	public Person copy(Person original)
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj")))
		{
			out.writeObject(original);
			return (Person) in.readObject(); //it's a deep copy :)
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	
	}

}
