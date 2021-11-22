package basic;

public class Student {
	String name;
	int rollNo;
	double contactNo;
	//String subject;
	
	Student(String name,int rollNo,double contactNo)//,String gender)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.contactNo = contactNo;
		//this.subject = subject;
	}
	
	
	
	void displayData()
	{
		System.out.print(name);
		System.out.print("  "+rollNo);
		System.out.println("  "+contactNo);
	}

}



