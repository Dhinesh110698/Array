package com.Array;

//import java.lang.reflect.Array;

public class ReverseOrderInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array1= {1,2,3,4,5};
int len=array1.length;
int []array2=new int [len];
int i=0;
int j=array1.length-1;
while(i<array1.length)
{
	array2[i]=array1[j];
	System.out.println(array2[i]);
	i++;
	j--;
}
	}

}
