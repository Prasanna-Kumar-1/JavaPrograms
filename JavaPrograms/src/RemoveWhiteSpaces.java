import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		Scanner sc =   new Scanner(System.in);
		
		System.out.println("Enter the string with Spaces : ");
		
		String original = sc.nextLine();
		
		//Use replaceAll() method to replacce the spaces
		String modifiedString = original.replaceAll("\\s+","");
		
		System.out.println("Modified String is : "+ modifiedString);
		

	}

}
