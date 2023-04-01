package AssignmentsM2;

import java.util.HashMap;

public class Program_60
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "yashraj");
		h.put(2, "jay");
		h.put(3, "nisarg");
		h.put(4, "yashdeep");
		h.put(5, "kuldeep");
		System.out.println("Hash map :" +h.keySet() +h.values());
		System.out.println("Hash map size : "+h.size());
		
	}
}
