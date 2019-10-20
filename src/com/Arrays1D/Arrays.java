package com.Arrays1D;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constants Declaration
		// I want 10 elements because it is a practice project
		
		final int ELEMENTS_ARRAY = 10;
		
		
		//Arrays declaration
		//1st Way
		int [] intArray = new int[10];
		char [] charArray = new char[10];
		boolean [] boolArray = new boolean [10];
		double [] dblArray = new double [10];
		String[] strArray = new String [10];
		
		int[] intArray2 = {10, 20, 30, 40, 50};
		char [] charArray2 = {'a', 'b', 'c', 'd', 'e'};
		boolean[] boolArray2 = {true, false, true, false, true};
		double[] dblArray2 = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] strArray2 = {"first", "second", "third", "fourth", "fifth"};
		
		for(int i = 0; i < intArray2.length; i += 1)
		{
			System.out.println(intArray2[i]);
		}
				
	

		
		

	}

}
