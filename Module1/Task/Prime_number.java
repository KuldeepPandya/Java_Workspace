package module1;

public class Prime_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		sSystem.out.println("Enter the number.");
		int number = sc.nextInt();
		
		int no=number%2;
		if(no==0)
		{
			System.out.println("Number is  not prime.");
		}
		else
		{
			System.out.println("Number is prime.");
		}
				
	}

}
