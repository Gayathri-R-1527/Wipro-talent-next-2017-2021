import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int isPalindromePossible
	{
		ArrayList<Integer> a=new ArrayList<Integer>(5);
		ArrayList<Integer> b=new ArrayList<Integer>(5);
		int rem,i,count=0;
		while(input1!=0)
		{
			rem=input1%10;
			if(!a.contains(rem))
			{
				a.add(rem);
				i=a.indexOf(rem);
				b.add(i, 1);
			}
			else
			{
				i=a.indexOf(rem);
				int d = b.get(i); 
				d++; 
				b.remove(i);
				b.add(i, d);
			}
			input1/=10;
		}
		for(int c:b)
		{
			if(c%2!=0)
			{
				count++;
			}
		}
		if(count<=1)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
}
