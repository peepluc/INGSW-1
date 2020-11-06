package application;

public class Main {

	public static void main(String[] args) 
	{
		Person p = new Person(21, "Mario", "Avolio", "12312", "Via X");
		CloneClass c = new CloneClass();
		Person p2 = c.copy(p);
		System.out.println(p2);
	}

}
