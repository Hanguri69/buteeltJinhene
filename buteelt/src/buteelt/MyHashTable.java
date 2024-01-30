package buteelt;

import java.util.Scanner;
import java.util.ArrayList;

public class MyHashTable extends ArrayList{
	
	public int sum(ArrayList<Integer> sa)
	{
		int sum = 0;
		for(int i = 0 ; i<sa.size();i++)
		{
			sum = sum+(int)sa.get(i);
		}
		return sum;
	}
	public double average(ArrayList<Integer> sa)
	{
		return 1.0*sum(sa)/sa.size();
	}
	
	public int max(ArrayList<Integer> sa)
	{
		int max = (int)sa.get(0);
		for (int i =0; i<sa.size();i++)
		{
			if(max<(int)sa.get(i))
			{
				max = (int)sa.get(i);
			}
		}
		return max;
	}
	public int min(ArrayList<Integer> sa)
	{
		int min = (int)sa.get(0);
		for (int i =0; i<sa.size();i++)
		{
			if(min>(int)sa.get(i))
			{
				min = (int)sa.get(i);
			}
		}
		return min;
	}
	public void  reverse(ArrayList<Integer> sa)
	{
		
		for (int i = sa.size()-1;i>=0;i--) {
			System.out.print((int)sa.get(i)+ " ");
		}
		
		
	}
	public void odd(ArrayList<Integer> sa)
	{
		System.out.println(" ");
		for (int i = 0;i<sa.size();i++)
		{
			if ((int)sa.get(i)%2 ==0)
			{
				System.out.print((int)sa.get(i)+" ");
			}
			

	

		}
		
	}
	public static void main(String [] args)
	{
		MyHashTable mb = new MyHashTable();
	
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(43);
		numbers.add(56);
		numbers.add(5);
		numbers.add(8);


		System.out.println(numbers);
		System.out.println(	mb.min(numbers));
		System.out.println(	mb.max(numbers));
		System.out.println(mb.average(numbers));
		System.out.println(	mb.sum(numbers));
		
	mb.reverse(numbers);
	mb.odd(numbers);

		
		
	}
	
	
}
