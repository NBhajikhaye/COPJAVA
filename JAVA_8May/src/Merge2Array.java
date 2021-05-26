import java.util.Scanner;

public class Merge2Array 
{
	static Scanner sc;
	public static int[] acceptArray(int[] array, int size)
	{
		int i;
		
		System.out.println("Enter the elements of array");
		for(i = 0; i < size; i++)
				array[i] = sc.nextInt();

		return array;
	}
	
	public static void displayArray(int[] array, int size)
	{
		int i;
		
		System.out.println("Elements");
		for(i = 0; i < size; i++)
				System.out.println(" "+array[i]);
	}
	
	public static void main(String[] args) 
	{
		int size1, size2, i, j;
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter Size of First array");
		size1 = sc.nextInt();
		int[] array1 = new int[size1];
		
		array1 = acceptArray(array1, size1);
				
		System.out.println("Enter Size of Second array");
		size2 = sc.nextInt();
		int[] array2 = new int[size2];
		
		array2 = acceptArray(array2, size2);
		
		int[] array3 = new int[size1+size2];
	
		//Merge array
		for(i = 0; i < size1; i++)
			array3[i] = array1[i];
		System.out.println(i);
		
		for(i = size1, j = 0; i < (size1+size2); i++, j++)
			array3[i] = array2[j];
		
		System.out.println("First Array");
		displayArray(array1, size1);
		
		System.out.println("Second Array");
		displayArray(array2, size2);	
		
		System.out.println("After Merging");
		displayArray(array3, ( size1 + size2 ) );
		sc.close();
	}

}
