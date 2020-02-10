import java.util.Arrays;

public class ArrayComparison 
{
	public static void main(String[] args)
	{
		String[] s1 = {"Sydney", "Melbourne", "Perth", "Adelide"};

		String[] s2 = {"Sydney", "Melbourne", "Adelide","Perth", };

		String[] s3 = {"Sydney", "Melbourne", "Perth", "Adelide"};


		//Use equals() method of Arrays to compare two arrays
		System.out.println(Arrays.equals(s1, s2));        //Output : false

		System.out.println(Arrays.equals(s1, s3));        //Output : true

		String[][] s4 = { {"Sydney", "Melbourne", "Perth", "Adelide"}, {"Sydney", "Melbourne", "Perth", "Adelide"}};

		String[][] s5 = {{"Sydney", "Melbourne", "Adelide","Perth"}, {"Sydney", "Melbourne", "Adelide","Perth"}};

		String[][] s6 = {{"Sydney", "Melbourne", "Perth", "Adelide"},{"Sydney", "Melbourne", "Perth", "Adelide"}};

		//Use deepEquals() method to compare multi dimensional arrays
		System.out.println(Arrays.deepEquals(s4, s5));       //Output : false

		System.out.println(Arrays.deepEquals(s4, s6));       //Output : false

	}
}

