package AssignmentsM2;

import java.util.Scanner;

public class Program_38 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age.");
		int age = sc.nextInt();
		
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("welcome");
		}
	}

}
