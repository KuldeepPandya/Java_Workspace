package AssignmentsM2;

 
public class Program_44 implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("running.....");
	}
	public static void main(String[] args) 
	{
		Thread t1 =new Thread(new Program_44());
		t1.start();
		t1.start();
		
	}

}
