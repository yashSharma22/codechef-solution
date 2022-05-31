/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []j = new int[2];
		int l;
		for(int i = 1;i<=n;i++){
		    for (int k=0;k<j.length;k++){

            j[k] = sc.nextInt();

            }
            for( l=0;l<j.length;l++){
                l = 10*j[l] + 90*j[l+1];
                  System.out.println(l);
            }
          
		}
	}
}
