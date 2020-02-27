package com.Array;

public class ShiftingElementsTwoTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,2,3,4,5};
		int temp1=array[0];
		int temp2=array[1];
		int i=0;
		while(i<3)
		{
			array[i]=array[i+2];
			System.out.println(array[i]);
			i++;
		}
		array[3]=temp1;
		array[4]=temp2;
		
	}

}
