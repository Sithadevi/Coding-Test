package test;

class NameValidationException extends RuntimeException{
	String msg;

	public NameValidationException(String msg) {
		super();
		this.msg = msg;
	}
}


class Employee{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		firstName = firstName;
		lastName = lastName;
	}
	void validateField()
	{
		if(firstName==null | lastName==null )
		{
			throw new NullPointerException("Entry Missing");
		}
		else if(firstName.length()<=3 | lastName.length()<=3)
		{
			throw new NameValidationException("name  should be minimum Three characters");
		}
	}
}
public class ExceptionTest {

	public static void main(String[] args) {
		Employee e=new Employee("sita","devi");
		e.validateField();

	}

}
