package test;

class Employee3{
	String FirstName;
	String LastName;
	public Employee3(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
}
public class TestEmployee {

	public static void main(String[] args)
	{
		Employee3 e=new Employee3("sita","devi");
		Employee3 e1=new Employee3("radha","rani");
		Employee3 e2=new Employee3("ragu","ram");
		System.out.println(e.FirstName);
		System.out.println(e.LastName);
		System.out.println(e1.FirstName);
		System.out.println(e1.LastName);
		System.out.println(e2.FirstName);
		System.out.println(e2.LastName);
		
	}

}
