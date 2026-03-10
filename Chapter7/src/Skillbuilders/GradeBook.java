package Skillbuilders;

public class GradeBook 
{
	public static void main(String[] args)
	{
		//Client creates objects
		Student alex = new Student("Alex Ross", 3.2);
		Student ali = new Student("Mohomed Ali", 3.3);
		Student amy = new Student("Amy Li", 3.4);
		Student jasmine = new Student("Jasmine Jordan", 3.5);
		
		alex.updateGPA(4.0);
		
		System.out.println(alex);//Automatically class toString()
		System.out.println(ali);
		System.out.println(amy);
		System.out.println(jasmine);
		
		
	}

}
