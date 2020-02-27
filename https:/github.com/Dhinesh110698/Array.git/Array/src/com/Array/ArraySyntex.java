package com.Array;

import java.util.Scanner;

public class ArraySyntex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
	Scanner scannerobj=new Scanner(System.in);
		int[] marks1=new int[5];   //1st approach
marks1[0]=90;
marks1[1]=85;
marks1[2]=92;
marks1[3]=80;
marks1[4]=86;
int[] marks2={90,85,86,76,42,80};   //2nd approach 

for(int i=0;i<marks1.length;i++)
{
	System.out.println("enter marks");
	marks1[i]=scannerobj.nextInt();
	total=total+marks1[i];
}
System.out.println(total);
scannerobj.close();    //close scanner class
}
}