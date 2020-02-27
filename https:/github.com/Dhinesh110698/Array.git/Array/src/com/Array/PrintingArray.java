package com.Array;

public class PrintingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int [] array= {5,6,7,8,9};
		/*for(int i=0;i<array.length;i++)    //    forward printing
		{
			System.out.println(array[i]);
		}*/
		for(int i=array.length-1;i>0;i--)   // backward printing
		{
			System.out.println(array[i]);
			if(array[i]==7)
			{
				System.out.println("7 is present at"+ i);
			}
			if(i==3)
			{
				System.out.println("the i position number is"+array[i]);
			}
		}

	}

}
