import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		//Convert the string into a character array
		char arr[] = str.toCharArray();
		
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Characters are: "+ arr[i]);
					break;
				}
			}
		}
	}

}
