package AssignmentsM2;

public class Program_35 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a[] =new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
	}

}
