package Assignment;

import java.util.Scanner;

public class SumAverage_4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter the five numbers.");
		for(int i =1;i<=5;i++)
		{
			int no = sc.nextInt();
			 sum +=no;
		}
		
		System.out.println("Sum of five number = "+sum);
		System.out.println("Average of five number = "+sum/5);
		
	}
}
