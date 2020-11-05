package application;

public interface Person 
{
	String getName();
	String getSurname();
	String getNumber();
	String getAddres();
	int getAge();
	
	class DefaultPerson implements Person
	{
		//required parameters
		private final String name;
		private final String surname;
		
		
		//optional parameters
		//set protected because Builder class can see them.
		protected String number;
		protected String addres;
		protected int age;
		
		
		public DefaultPerson(String name, String surname) 
		{
			super();
			this.name = name;
			this.surname = surname;
		}

		protected DefaultPerson(Builder builder) 
		{
			this(builder.getName(), builder.getSurname());
			this.number = builder.number;
			this.addres = builder.addres;
			this.age = builder.age;
		}

		@Override
		public String toString() {
			return "DefaultPerson [name=" + name + ", surname=" + surname + ", number=" + number + ", addres=" + addres
					+ ", age=" + age + "]";
		}

		@Override
		public String getName() 
		{
			return this.name;
		}

		@Override
		public String getSurname() 
		{
			return this.surname;
		}

		@Override
		public String getNumber() 
		{
			return this.number;
		}

		@Override
		public String getAddres() 
		{
			return this.addres;
		}

		@Override
		public int getAge() 
		{
			return this.age;
		}
	}
	
	class Builder extends DefaultPerson
	{
		public Builder(String name, String surname) 
		{
			super(name, surname);
		}
		
		public Builder number(String number)
		{
			this.number = number;
			return this;
		}
		
		public Builder address(String address)
		{
			this.addres = address;
			return this;
		}
		
		public Builder age(int age)
		{
			this.age = age;
			return this;
		}
		
		public Person build()
		{
			return new DefaultPerson(this);
		}
		
	}
	
}
