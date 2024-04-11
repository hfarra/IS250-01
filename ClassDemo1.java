public class ClassDemo1
{
    public static void main (String [] args)
    {
		// declare reference to an object of class person
		person abdi; 
		// using new keyword -> acquire an actual, physical copy of the object and assign it to abdi variable
		abdi = new person();
		//person abdi = new person();
		
		abdi.gender = 'M';
		abdi.height = 5.2;
		abdi.age = 35;
		System.out.println ("abdi's gender is " + abdi.gender + ", his height is " + abdi.height + ", and his age is " + abdi.age);
		System.out.println ("abdi's gender is " + abdi.printGender() + ", his height is " + abdi.height + ", and his age is " + abdi.age);
		System.out.println (abdi.printGender());
		
    }
	
}


class person {
	char gender;		//F-> Female, M->Male
	double height;		//Person's height
	int age;			//Person's age
	//Method
	String printGender(){
		if (gender == 'M' || gender == 'm')
			return "Male";
		else if (gender == 'F' || gender == 'f')
			return "Female";
		else
			return "Unknown";
	}
}
