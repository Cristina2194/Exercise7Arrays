package com.Arrays1D;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constats declaration
		final int ELEMENTS_ARRAY = 10;
		
		//variables declaration
		double generatedNumber=0;
		int generatedNumberInt=0;
		byte generatedNumberByte=0;
		
		byte evenValues=0;
		byte oddValues=0;
		byte zeroValues=0;
		byte positiveValues=0;
		byte negativeValues=0;
		
		//Arrays declaration
		//int [] miArray = new int [ELEMENTS_ARRAY];
		byte [] miArray = new byte [ELEMENTS_ARRAY];
		
		//Array pseudo random numbers
		//Way 1 by means of Random numbers
	
		Random randomNumbers = new Random(System.nanoTime());
		for (int i=0;i<ELEMENTS_ARRAY; i++)
		{
			generatedNumber = randomNumbers.nextDouble();
			System.out.println(generatedNumber);
		}
		for (int i=0;i<ELEMENTS_ARRAY; i++)
		{
			generatedNumberInt = randomNumbers.nextInt(51)+50;
			System.out.println(generatedNumberInt);
			
		}
	
		
	
		//Way  2 by means of Math Class
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			generatedNumber = (int) (Math.random()*50+50);
			generatedNumberInt = (int) generatedNumber;
			System.out.println(generatedNumber);
	
		}
		//pass 1 initialize
		for(int i=0;i<miArray.length;i++)
		{
			generatedNumberInt = randomNumbers.nextInt(101);
			//System.out.println(generatedNumberInt
			miArray[i] = (byte) generatedNumberInt;
		}
	//pass 2 Process
		for(int i = 0; i < ELEMENTS_ARRAY; i++)
		{
			
			if (miArray[i]==0)
			{
				zeroValues++;
			}
			else if(miArray[i]%2==0)
			{
				evenValues++;
			}
			else if(miArray[i]%2==1)
			{
				oddValues+=1;
			}
			else if(miArray[i]>0)
			{
				positiveValues+=1;
			}
			else if(miArray[i]<0)
			{
				negativeValues+=1;
				
			}
		}
		
		
				

		
			
	//pass 3 Visualization
		System.out.println("Zeros quatity"+zeroValues);
		System.out.println("Odd Values: "+oddValues);
		System.out.println("Even Values: "+evenValues);
		System.out.println("Positive Values: "+positiveValues);
		System.out.println("Negative Values: "+negativeValues);
		
		

		}
	}


