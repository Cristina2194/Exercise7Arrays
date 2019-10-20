package com.Arrays1D;
import java.util.Random;

public class primoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Constant declaration
		final int ELEMENTS_ARRAY=10;
		
		//Variable declaration
		byte primeNumbers=0;
		boolean isPrime=true;
		
		
		//Array declaration
		byte[] vector= new byte [ELEMENTS_ARRAY];
		
		//Objects declaration
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i = 0; i < ELEMENTS_ARRAY; i ++)
		{
			vector[i] = (byte) (randomNumbers.nextInt(15)+1);
			
			
		}
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.println(vector[i]);
		}
		for(int i = 0; i < ELEMENTS_ARRAY; i++)
		{
			isPrime=true;
			
			for(int j=2;j<vector[i];j++)
			{
				if(vector[i]%j==0)
				{
					isPrime=false;
					break;
				}	
					
			}
		 
		if(isPrime)
		{
			primeNumbers++;
			
		}
		}
		System.out.println("Quantity of prime numbers is: "+primeNumbers);
	}
   
}
