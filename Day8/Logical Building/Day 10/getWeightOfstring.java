import java.io.*;
import  java.util.*;
class UserMainCode
{
  public int getWeightOfString(String input1, int input2) {
		int weight = 0;
		
	
		for (int i = 0; i < input1.length(); i++) {
			char l = input1.charAt(i);
			
			if (input2 == 0) {
				if (l == 'a' || l== 'e' || l == 'i' || l == 'o' || l == 'u' || 
					l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
					continue;
				}
			}
			
			if (l >= 65 && l <= 90) { 
				weight += l - 64;
			
			} else if (l >= 97 && l <= 122) { 
				weight += l - 96;
				
			} 
		}
		
		return weight;
	}

	
