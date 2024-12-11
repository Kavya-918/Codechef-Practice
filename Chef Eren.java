//Chef Eren
//Problem link:https://www.codechef.com/problems/CHEFEREN

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int f=sc.nextInt();
		    int u=sc.nextInt();
		    int c=sc.nextInt();
		    int k=0,m=0;
		    for(int i=1;i<=f;i++){
		        if(i%2==0)
		          m++;
		        else
		          k++;
		        
		    }
		    System.out.println((m*u)+(k*c));
		}
		sc.close();
	}
}
