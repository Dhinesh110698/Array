package com.Array;

public class AddingOneElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {5,3,2,4,7};
		int no=60;
		int len1=array1.length;
		int[] array2=new int[len1+1];
		int len2=array2.length;
		array2[len2-1]=no;
		for(int i=0;i<array1.length;i++)
		{
			array2[i]=array1[i];
		}
for(int i=0;i<array2.length;i++)
{
	System.out.println(array2[i]);
}
	}

}
