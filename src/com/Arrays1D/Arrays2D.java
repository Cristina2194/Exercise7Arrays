package com.Arrays1D;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Contants declarartion
		final int ROWS=10;
		final int COLS=10;
//Variables declaratio
		int cont=1;
		
//Array 2D
		int[][] matrix = new int [ROWS][COLS];
		

		for(int i=0; i<ROWS; i++)
		{
			for(int j=0; j<COLS; j++)
			{
				matrix[i][j]=cont;
				cont++;
			}
		}
		for(int i=0; i<ROWS; i++)
		{
			for(int j=0; j<COLS; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
				
		
	}
	

}
