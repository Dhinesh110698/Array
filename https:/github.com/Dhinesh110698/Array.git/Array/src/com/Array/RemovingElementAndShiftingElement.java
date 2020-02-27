package com.Array;

public class RemovingElementAndShiftingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[]array= {5,3,2,4,7};
		int no=3,i=0;
		while(i<array.length)
		{
			if(array[i]==no)
			{
				System.out.println("no is at present"+  i);
				break;
			}
			i++;
		}
		if(i==array.length)
		{
			System.out.println("no is not print");
		}
for(int j=i;j<array.length-1;j++)
{
	array[j]=array[j+1];
}
for(int j=0;j<array.length;j++)
{
	System.out.println(array[j]);
}
	}

}
