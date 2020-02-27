package com.Array;

public class CountingInGivenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {10,20,10,30,40,10,25};
		int [] search= {10,20};
		int j=0;
		while(j<search.length)
		{
			int i=0; int count=0;
			while(i<array.length)
			{
				if(array[i]==search[j])
				{
				count++;
				}
				i++;
			}
         System.out.println(count);
         j++;
	}

}
}