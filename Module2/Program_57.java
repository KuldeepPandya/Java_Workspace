package AssignmentsM2;

import java.util.HashSet;
import java.util.Iterator;

public class Program_57
{
	public static void main(String[] args) 
	{
		HashSet< String> h = new HashSet<>();
		
		h.add("yash");
		h.add("nisarg");
		h.add("jay");
		h.add("yashdeep");
		h.add("kuuldeep");
		
		Iterator i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
