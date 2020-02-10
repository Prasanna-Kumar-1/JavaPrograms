import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		//Read the string
		String str = sc.nextLine();
		//convert the string to character array, so that you parse it character by character 
		//                                       and count vowels
		char chars[] = str.toCharArray();
		
		int vcount=0;
		int ccount=0;
		//Use for-each loop. 
		//1. This loop iterates through each item in the given collection or array
		//2. stores each item in a variable (item)
		//3. and executes the body of the loop.
		for(char c :chars)
		{
			
			if(c=='a'|| c=='e'|| c== 'i' || c=='o' ||c=='u')
			{
				vcount++;
			}
			else if ((c >= 'a'&& c <= 'z'))
			{
				ccount++;
			}
			
		}
		
		System.out.println("No of vowels in " +str+ " is: "+ vcount);
		System.out.println("No of Consonents in " +str+ " is: "+ ccount);

	}

}
