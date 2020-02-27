package com.Array;

public class MergingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5};
		int [] result=new int [a.length+b.length];
		int i=0,k=0;
		while(i<result.length)
		{
			if(i<a.length)
			{
				result[i]=a[i];
				System.out.println(result[i]);
			}
			else
			{
				result[i]=b[k];
				System.out.println(result[i]);
				k++;
			}
			i++;
		}   
/*		int a[]= {1,2,3};   //another method
		int b[]= {4,5};
		int [] result=new int [a.length+b.length];
		int i=0;
		while(i<a.length)
		{
				result[i]=a[i];
				System.out.println(result[i]);
				i++;
			}
		int j=i,k=0;
		while(j<result.length) {
			result[j]=b[k];
			System.out.println(result[j]);
			k++;
			j++;
		}*/

	}

}
