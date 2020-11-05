package application;

public class main {

	public static void main(String[] args) 
	{
		User mario = new User.UserBuilder("Mario", "Avolio")
				.setAddress("Via X")
				.setAge(21)
				.setTelephoneNumber("12345")
				.build();
		
		System.out.println(mario);
		
		//What is the power of this Builder Design Pattern?
		// I CAN MAKE SOME SORT OF USER WITHOUT DEFINE ALL THE COSTRUCTOR
		// I MAY NOT SET A PARAMETER IN "UserBuilder" AND EVERYTHING WILL WORK ANYWHAY
		// LET ME SHOW YOU AN EXAMPLE 
		
		User bencaiddo = new User.UserBuilder("Michele", "Bencaiddo")
						.setAge(25).build();
		
		System.out.println(bencaiddo);
		
		// I DON'T USE A LOT OF COSTRUCTOR BUT I BUILD OBJECT
		
		
	}

}
