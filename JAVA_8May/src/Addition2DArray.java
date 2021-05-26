import java.util.Scanner;

public class Addition2DArray 
{
	public static int[][] acceptArray(int[][] array, int row, int col)
	{
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements of array");
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++)
				array[i][j] = sc.nextInt();
		}
		
		return array;
	}
	
	public static void displayArray(int[][] array, int row, int col)
	{
		int i, j;
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++) {
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int[][] mat1 = new int[10][10];
		int[][] mat2 = new int[10][10];
		int[][] mat3 = new int[10][10];
		int i, j, row, col;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to create");
		row = sc.nextInt();
		
		System.out.println("Enter the number of columns you want to create");
		col = sc.nextInt();
		
		mat1 = acceptArray(mat1, row, col);		
		
		mat2 = acceptArray(mat2, row, col);
		
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++)
				mat3[i][j] = mat1[i][j] + mat2[i][j];
		}
		
		System.out.println("First array ");
		displayArray(mat1, row, col);
		
		System.out.println("second array ");
		displayArray(mat2, row, col);
		
		System.out.println("After Addition");
		displayArray(mat3, row, col);
		
		
		sc.close();
	}

}
