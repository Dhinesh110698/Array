package com.Array;

public class AddingtwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {5,8,3,10};
		int array2[]= {2,3};
		int len1=array1.length;
		int len2=array2.length;
		int len=len1>len2?len1:len2;
		int []result=new int [len];
		int addcount=len1<len2?len1:len2;
		int i=0;
		while(i<addcount)
		{
			result[i]=array1[i]+array2[i];
			System.out.println(result[i]);
			i++;
		}
		//System.out.println(i);
while(i<len)
{
	result[i]=array1[i];
	System.out.println(result[i]);
	i++;
}
	}

}
