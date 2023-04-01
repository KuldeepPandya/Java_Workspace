package AssignmentsM2;


class a implements Runnable
{

	public void run()
	{
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println("thread a"+i);
		}
	}
	
}

public class Program_41 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new a());
		t1.start();
		
		
	}

}