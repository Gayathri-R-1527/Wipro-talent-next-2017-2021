import java.io.*;
import  java.util.*;
class UsermainCode{
public int totalHillWeight(int input1,int input2,int input3){
int rows=input1;
		int head=input2;
		int weight;
		int tw=0;
		for(int i=2;i<=rows;i++)
		{
			head=head+input3;
			weight=head*i;
			tw=tw+weight;


		}
		
		return tw + input2 ;
		
	}
}
