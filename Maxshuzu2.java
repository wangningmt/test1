package a;

import java.util.Scanner;

	public class Maxshuzu2 {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int n,i;
			int max;
			n=in.nextInt();
			int[] a=new int[100];
			for(i=0;i<n;i++)
			{a[i]=in.nextInt();}
		    max=sonarray(a,n);
		    if(max<=0)
		    System.out.println(0);
		    else
		    System.out.println(max); 	
		    in.close();
	}
	   public static int sonarray(int a[],int n) {
		   int i,j,k;
		   int max=0;
		   int sum;
		   for(i=0;i<n;i++){
		   for(j=i;j<n;j++) {
			   sum=0;
			   for(k=i;k<=j;k++) {
				   sum+=a[k];
			   }
			   if(sum>=max)
			   {max=sum;}
			 }
		  }
		   return(max);
	   }
	}
		

