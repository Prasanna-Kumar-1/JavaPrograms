import java.util.HashMap;
import java.util.Set;

public class DupCharCount {

    static void duplicateCharCount(String inputString)
    {
    	//Create a HashMap containing char as key and it's occurrences as value
    	HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
    	
    	//Converting input string into character array
    	char[] chrArray = inputString.toCharArray();
    	
    	//Checking each character of Character Array    	
    	for(char c :chrArray)
    	{
    		////If char is present, then put it in charCountMap & incrementing it's count by 1
    		if(charCountMap.containsKey(c))
    		{
    			charCountMap.put(c, charCountMap.get(c)+1);
    		}
    		else
    		{
    			//If char is not present,
                //putting this char to charCountMap with 1 as it's value
    			charCountMap.put(c,1);
    		}
    	}
    	
    	Set<Character> charsInString = charCountMap.keySet();
    	
    	for(char ch:charsInString)
    	{
    		if(charCountMap.get(ch)>1)
    		{
    			System.out.println(ch +" : "+ charCountMap.get(ch));
    		}
    	}
    	
    }

	public static void main(String[] args) 
	{
		duplicateCharCount("Sydney");
			
	}
}


