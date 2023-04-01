package AssignmentsM2;

public class Program_21
{
	public static void main(String[] args) 
	{
		Program_21 obj = new Program_21();
		obj.print('a', 10);
		obj.print(10, 'a');
	}
		
		void print(int n,char c)
		{
			System.out.println("integer is :"+n+"\t\t"+"character is : "+c);
		}
		void print(char c,int n)
		{
			System.out.println("character is : "+c+"\t"+"integer is :"+n);
		}
}
