package basic;

import java.util.ArrayList;



public class Alpha implements Functional {
	public void printer(String str)
	{
		System.out.println("My name is "+str);
	}


	public static void main(String[] args) {
		
		
		
		String str = "Hello there";
		System.out.println(str);
	
		
		 String[] names = {
		            "Liam",
		            "Olivia",  // I WOULD LIKE TO KEEP THIS MAIN CLASS ABSTRACTED AND SO IN THE PROCESS I WOULD CREATE A NEW  CLASS
		            "Noah",
		            "Emma",
		            "Oliver",
		            "Ava",
		            "William",
		            "Sophia",
		            "Elijah",
		            "Isabella",
		            "James",
		            "Charlotte",
		            "Benjamin",
		            "Amelia",
		            "Lucas",
		            "Mia",
		            "Mason",
		            "Harper",
		            "Ethan",
		            "Evelyn"
		        };
		 
		 ArrayList<String> S = new ArrayList<String>();
		 ArrayList<Student> Classroom = new ArrayList<Student>();
		 ArrayList<Student> Computer = new ArrayList<Student>();
		 ArrayList<Student> PhysicalEd = new ArrayList<Student>();
		 for(int i = 0;i<names.length;i++)
		 {
		 S.add(names[i]);
		 }
		 
		 System.out.println(S.size());
		 
		 //Collections.sort(S);
		 
		 for(int i = 0;i<names.length;i++)
		 {
			 Student s = new Student(S.get(i),i+1,1010101+i);
			 Classroom.add(s);
			 if(i<=9) {
			 Computer.add(s);
			 }
			 if(i>9) {
				 PhysicalEd.add(s);
				 }
		 }
		 System.out.println("LIST OF STUDENTS ENROLLED IN COMPUTER SCIENCE");
		 System.out.println();
		 for(Student s : Computer)
		 {
			 s.displayData();
			 
			 Beta ob = new Charlie();
			 ob.printer(s.name);
			 
		 }
		 
	/*
		 System.out.println();
		 
		 System.out.println("LIST OF STUDENTS ENROLLED IN PHYSICAL EDUCATION");
		 System.out.println();
		 for(Student s : PhysicalEd)
		 {
			 s.displayData();
		 }
	*/	 
		 
		 
		 
		 
		
		 

	}

}
