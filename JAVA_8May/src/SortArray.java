import java.util.Scanner;

public class SortArray 
{
	public static void main(String[] args) 
	{
		int size, i, j, temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want to sort");
		size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter Number you want to sort");
		for(i = 0; i < size; i++)
			array[i] = sc.nextInt();
		
		System.out.println("Before Sorting");
		for(i = 0; i < size; i++)
			System.out.print(" "+array[i]);
		
		for(i = 0; i < size-1; i++)
		{
			for(j = 0; j < size-1; j++)
			{
				if(array[j] >= array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("\n After Sorting");
		for(i = 0; i < size; i++)
			System.out.print(" "+array[i]);
	}
}
