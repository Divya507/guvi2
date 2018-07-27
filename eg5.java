/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k;
		int r=1;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		k=Sc.nextInt();
		for(int i=0;i<k;i++)
		{
			r=r*n;
			}
			System.out.println(r);
	}
}
