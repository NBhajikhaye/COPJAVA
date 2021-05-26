import java.util.Scanner;

public class ReverseArray 
{

	public static void main(String[] args) 
	{
		int i, j = 0, size;
		int array[] = new int[50];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		size = sc.nextInt();
		
		System.out.println("Enter "+size+" Values to reverse");
		for(i = 0; i < size; i++)
		{
			array[i] = sc.nextInt();
			j++;
		}
		
		for(i = j - 1; i >= 0; i--)
			System.out.print(array[i]+"\t");
		
//		System.out.println("Entered values are");
//		for(i = array.length; i < 0; i++)
//			System.out.print(array[i]+"\t");
//		
		sc.close();
	}

}
