package Assignment;

import java.util.Scanner;

public class Greatestnumber_1 
{
	public static void main(String[] args) 
	{
		
      Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number.");
		int First = sc.nextInt();
		System.out.println("Enter the Second number.");
		int Second =sc.nextInt();
		System.out.println("Enter the Third number.");
		int Third =sc.nextInt();
		if(First>Second && First>Third)
		{
			System.out.println("Maximun number is : "+First);
		}
		if(Second>Third && Second>First)
		{
			System.out.println("Maximum number is : "+Second);
		}
		if(Third>First && Third>Second)
		{
			System.out.println("Maximum number is : "+Third);
		}
	}

}
