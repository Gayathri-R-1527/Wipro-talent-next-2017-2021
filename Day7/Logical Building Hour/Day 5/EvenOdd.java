import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int countEvensOdds(int input1,int input2,int input3,int input4,int input5,String input6)

int arr[]= new int[5];
		int ecount=0,ocount=0;
		
		arr[0]=input1;
		arr[1]=input2;
		arr[2]=input3;
		arr[3]=input4;
		arr[4]=input5;
		String s= new String("even");

		if(s==input6)
		{
		
			for(int i=0;i<5;i++)
			{
			
				if(arr[i]%2==0)
				{
				ecount++;
				}
			
			
			}
			return ecount;
		}
		else
		{
		for(int i=0;i<5;i++)
			{
			
				if(arr[i]%2!=0)
				{
				ocount++;
				}
			
			
			}
			return ocount;
		}
	}
}
		
