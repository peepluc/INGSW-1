package application;

public class User 
{
	// immutable 
	private final String firstName;
	private final String lastName;
	private final String address;
	private final String telephoneNumber;
	private final int age;


	public User(UserBuilder userBuilder) 
	{
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.address = userBuilder.address;
		this.telephoneNumber = userBuilder.telephoneNumber;
		this.age = userBuilder.age;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", telephoneNumber="
				+ telephoneNumber + ", age=" + age + "]";
	}

	public static class UserBuilder
	{
		private final String firstName;
		private final String lastName;
		private String address;
		private String telephoneNumber;
		private int age;
		
		public UserBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public UserBuilder setTelephoneNumber(String telephoneNumber) {
			this.telephoneNumber = telephoneNumber;
			return this;
		}

		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public User build()
		{
			return new User(this);
		}
	}
}
