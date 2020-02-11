//an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself
//For example, 153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.

public class ArmStrong {

	public static void main(String[] args) {
		
		int number=153, originalNumber, remainder, result=0;
		
		originalNumber = number;
		
		while(originalNumber!=0)
		{
			remainder=originalNumber%10;
			//Use Math.pow() method to raise 
			result= (int) (result + Math.pow(remainder, 3));
			originalNumber=originalNumber/10;
			
		}
		
		if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

	}

}
