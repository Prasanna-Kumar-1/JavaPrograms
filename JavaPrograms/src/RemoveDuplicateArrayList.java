import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) 
	{
		//1. First, Create a Array List with Duplicate Elements
		//2. Add the elements to ArrayList containing duplicates using add() method
		//3. Create a new Linked Hashset. Move the elements from Array List to this Linked Hashset. 
		//   LinkedHashSet doesn’t allow duplicate elements and also maintains the insertion order 
		//   of elements
		//4. Move the non-duplicate elements from this LinkedHashset into new array 
		ArrayList<String> listWithDuplicates = new ArrayList<String>();
		
		listWithDuplicates.add("BRISBANE");
		listWithDuplicates.add("SYDNEY");
		listWithDuplicates.add("MELBOURNE");
		listWithDuplicates.add("DARWIN");
		listWithDuplicates.add("SYDNEY");
		listWithDuplicates.add("BRISBANE");
		
		//Construct a Linked Hashset using listWithDuplicates
		LinkedHashSet<String>  set = new LinkedHashSet<String>(listWithDuplicates);
		
		//Move the elements from Linked Hashset into Array List
		
		ArrayList<String> listWithoutDuplicates = new ArrayList<String>(set);
		
		//Print the array without Duplicates
		System.out.print("ArrayList After Removing Duplicate Elements :");
		System.out.println(listWithoutDuplicates);
	}

}
