package com.Array;

public class MaxAndMinValueOfGivenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no= {3,7,2,8,5};
		int i=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		while(i<no.length)
		{
			if (max<no[i])
			{
				max=no[i];
			}
			if(min>no[i])
			{
				min=no[i];
			}
			i++;
		}
System.out.println(max);
System.out.println(min);
	}

}
