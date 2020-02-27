package com.Array;

public class PrintEvenNumbersInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5};
		int result[]=new int [array.length/2];
		int i=0,j=1;
		while(i<result.length)
		{
			result[i]=array[j];
			System.out.println(result[i]);
			i++;
			j=j+2;
		}

	}

}
