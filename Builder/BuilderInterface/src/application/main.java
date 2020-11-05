package application;

public class main {

	public static void main(String[] args) 
	{
		Person p = new Person.Builder("Mario", "Avolio")
				.address("Via X")
				.age(21)
				.number("123123")
				.build();
	
		System.out.println(p);
	}

}
