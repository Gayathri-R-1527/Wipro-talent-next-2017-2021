import java.io.*;
import  java.util.*;

// Read only region start
class SumOfPowersOfDigits {

	public int sumOfPowerOfDigits(int input1){
if (input1 <= 9) 
{
return 0;
}		
		String number = String.valueOf(input1);
		int sum = 0;
		System.out.println(number);
		
		for (int i = 0; i < number.length(); i++) {
			if (i == number.length() - 1) {
				sum += 1;
				System.out.println(number.charAt(i) + " ^ " + 0);
			} 
      else {
				
				sum += Math.pow(Integer.parseInt(String.valueOf(number.charAt(i))), Integer.parseInt(String.valueOf(number.charAt(i + 1))));
                
			}
		}
		
		return sum;
	}

		
	
}
