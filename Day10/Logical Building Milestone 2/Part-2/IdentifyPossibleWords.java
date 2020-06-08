import java.io.*;
import  java.util.*;
class IdentifyPossibleWords {

	public String identifyPossibleWords(String input1,String input2){
  input1 = input1.toUpperCase();
		
		StringBuffer out = new StringBuffer();
		String[] words = input2.split(":");
		
		int underscoreIndex = input1.indexOf('_');
		
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toUpperCase();

			if (words[i].length() >= input1.length() &&
			input1.replace('_', words[i].charAt(underscoreIndex)).equals(words[i])) {
				out.append(words[i]).append(":");
			}
		}
		
		if (out.length() == 0)
		 return "ERROR-009";
        else
		 return out.toString().substring(0, out.length() - 1);
		
	}
}
