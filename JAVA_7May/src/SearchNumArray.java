import java.util.Scanner;

public class SearchNumArray 
{

	public static void main(String[] args) 
	{
		int i, num, size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elsments of array");
		for(i = 0; i < size; i++)
			array[i] = sc.nextInt();
		
		System.out.println("Enter number to search");
		num = sc.nextInt();
		
		for(i = 0; i < size; i++)
		{
			if(array[i] == num)
				break;
		}
		
		System.out.println(num+" found at "+i+" index");
		sc.close();
	}

}
