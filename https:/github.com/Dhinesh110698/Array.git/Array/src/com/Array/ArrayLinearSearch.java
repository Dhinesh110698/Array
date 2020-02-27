package com.Array;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean nopresent=false;
		int [] marks= {91,76,92,89,98};
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]==76)
			{
				nopresent=true;
				System.out.println("i got it");
				break;
			}
		}
if(nopresent==false)
{
	System.out.println("no is not present");
}
	}

}
