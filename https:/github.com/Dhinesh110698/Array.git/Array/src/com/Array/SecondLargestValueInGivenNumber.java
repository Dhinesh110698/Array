package com.Array;

public class SecondLargestValueInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no= {3,5,2,8,67,45,23,65,21,7,99,55};
		int i=0;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		while(i<no.length)
		{
			if(no[i]>max1)
			{
				max2=max1;
				max1=no[i];
			}
			else if(no[i]>max2)
			{
				max2=no[i];
			}
			i++;
		}
System.out.println(max1);
System.out.println(max2);
	}

}
