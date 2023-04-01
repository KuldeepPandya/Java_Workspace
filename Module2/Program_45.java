package AssignmentsM2;


class demonthread extends Thread
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("demon thread " +Thread.currentThread().isDaemon());
		System.out.println("thread " +Thread.currentThread().isAlive());
	}
	 
}

public class Program_45  
{
	
	public static void main(String[] args) 
	{
		demonthread t1 = new demonthread();
		demonthread t2 = new demonthread();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
	}

}