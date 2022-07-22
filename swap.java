

import java.util.*;

public class GFG1 {
	public static void main(String[] argv)
		throws Exception
	{

		try {

			// creating object of List<String>
			List<String> vector = new ArrayList<String>();

		
			vector.add("A");
			vector.add("B");
			vector.add("C");
			vector.add("D");
			vector.add("E");
			System.out.println("Before swap: " + vector);

		
			System.out.println("\nSwapping 0th and 4th element.");
			Collections.swap(vector, 0, 4);

		
			System.out.println("\nAfter swap: " + vector);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("\nException thrown : " + e);
		}
	}
}
