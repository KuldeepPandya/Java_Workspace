package AssignmentsM2;

public class Program_22 
{
	void area_rectangle(int l,int w)
	{
		
		System.out.println("Area of rectangle : "+l*w);
	}
	void area_square(int a)
	{
		System.out.println("Area of square : "+a*a);
	}

	public static void main(String[] args) 
	{
	
		Program_22 ob = new Program_22();
	
		ob.area_rectangle(12, 20);
		ob.area_square(20);
	}
}