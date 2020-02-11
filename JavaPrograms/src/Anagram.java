import java.util.Arrays;

//Two strings are called anagrams if they contain same set of characters but in different order

public class Anagram 
{
	static void isAnagram(String string1, String string2)
	{
		//Remove all the spaces using replaceAll() method
		String str1 = string1.replaceAll("\\s+", "");
		String str2 = string2.replaceAll("\\s+", "");
		
		boolean status = true;
		
		//Lengths should be equal for the 2 input strings
		if(str1.length() != str2.length())
		{
			status = false;
		}
		else
		{
			//convert to lower case arrays
			char[] s1Array = str1.toLowerCase().toCharArray();
			char[] s2Array = str2.toLowerCase().toCharArray();
			
			//Sort the arrays
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			//Now, compare the arrays using equals() method
			status = Arrays.equals(s1Array, s2Array);
		}
		
		//Output
		 
        if(status)
        {
            System.out.println(string1+" and "+string2+" are anagrams");
        }
        else
        {
            System.out.println(string1+" and "+string2+" are not anagrams");
        }
		
	}

	public static void main(String[] args) 
	{
		isAnagram("Mother In Law", "Hitler Woman");	
	}

}
