package com.Array;

public class PrintingValuvesINBetweenTwoElementsInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,5,8,15};
		int s=0;
		while(s<array.length-1)
		{
			int no1=array[s];
			int no2=array[s+1];
			int big=no1>no2?no1:no2;
			int small=no1<no2?no1:no2;
			for(int i=small+1;i<big;i++)
			{
				System.out.println(i);
			}
			s++;
		}

	}

}
