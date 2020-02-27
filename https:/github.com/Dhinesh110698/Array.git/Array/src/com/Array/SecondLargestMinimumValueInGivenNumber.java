package com.Array;

public class SecondLargestMinimumValueInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no= {3,7,2,8,5};
		int i=0;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		while(i<no.length)
		{
			if(no[i]<min1)
			{
				min2=min1;
				min1=no[i];
			}
			else if(no[i]<min2)
				
			{
				min2=no[i];
			}
			i++;
		}
System.out.println(min1);
System.out.println(min2);


	}

}
