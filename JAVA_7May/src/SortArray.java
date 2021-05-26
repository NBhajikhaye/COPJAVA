import java.util.Scanner;

public class SortArray 
{

	public static void main(String[] args) 
	{
		int array[] = new int[50];
		int i, j, size, temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		size = sc.nextInt();
		
		System.out.println("Enter Elements of Array");
		for(i = 0; i < size; i++)
			array[i] = sc.nextInt();

		for(i = 0; i < size - 1; i++)
		{
			for(j = 0; j < size - 1; j++)
			{
				if(array[j] >= array[j + 1])
				{
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array");
		for(i = 0; i < size; i++)
			System.out.println(array[i]);
		
		System.out.println("Minimum Element : "+array[0]);
		System.out.println("Maximum Element : "+array[size - 1]);
		sc.close();
	}
}
