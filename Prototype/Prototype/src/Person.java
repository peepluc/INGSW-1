
public class Person implements Cloneable
{
	private String name;
	private String surname;
	private int age;
	private String telephoneNumber;
	private String address;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", telephoneNumber=" + telephoneNumber
				+ ", address=" + address + "]";
	}

	public Person() 
	{
		System.out.println("hello world");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person clone()
	{
		try
		{
			Person p = (Person) super.clone();
			return p;
		} 
		catch (CloneNotSupportedException e)
		{
			return null;
		}
		
	}
}
