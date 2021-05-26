import java.util.Scanner;

public class Array2D 
{

	public static void main(String[] args) 
	{
		int i, j, row, col;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to create");
		row = sc.nextInt();
		
		System.out.println("Enter the number of columns you want to create");
		col = sc.nextInt();
		int array[][] = new int[row][col];
		
		System.out.println("Enter the elements of array");
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++)
				array[i][j] = sc.nextInt();
		}
		
		System.out.println("Entered elements are");
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++) {
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
