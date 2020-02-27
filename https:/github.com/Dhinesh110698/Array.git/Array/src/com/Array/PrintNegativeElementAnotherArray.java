package com.Array;

public class PrintNegativeElementAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 1, -2, 3, -4, -5, -6, -7 };
		int count = 0;
		for (int i = 0; i < array1.length; i++) 
		{
			if (array1[i] < 0) 
			{
				count++;
			}
		}
		int array2[] = new int[count];
		int j=0;
		for (int i = 0; i < array1.length; i++) 
		{
			if (array1[i] < 0) 
			{
				array2[j] = array1[i];
				System.out.println(array2[j]);
				j++;
			}
		}
	}

}
