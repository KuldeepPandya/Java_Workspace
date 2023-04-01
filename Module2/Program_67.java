package AssignmentsM2;

import java.util.ArrayList;
import java.util.HashSet;

public class Program_67 
{
	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<>();
		
		h.add("jay");
		h.add("janmaraj");
		h.add("satyaraj");
		h.add("kuldeep");
		
		System.out.println("Hash set : "+h);
		
		ArrayList<String> l = new ArrayList<>(h);
		
		System.out.println("Arraylist is : "+l);
		
	}

}
