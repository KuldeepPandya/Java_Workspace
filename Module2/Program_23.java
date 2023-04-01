package AssignmentsM2;


class a1
{
	void a1()
	{
		System.out.println("This is a parent class");
	}
}
class b1 extends a1
{
	void b1()
	{
		System.out.println("This is a child class");
	}
}

public class Program_23 
{
	public static void main(String[] args) 
	{
		b1 B = new b1();
		  B.a1();
		  B.b1();

		
	}
}


