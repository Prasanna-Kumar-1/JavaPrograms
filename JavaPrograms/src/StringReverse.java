
public class StringReverse {

	public static void main(String[] args) 
	{
		
		String str = "Prasanna";
		char[] chrArray = str.toCharArray();
		
		for(int i=chrArray.length-1;i>=0;i--)
		{
			System.out.print(chrArray[i]);
			
		}
    }

}