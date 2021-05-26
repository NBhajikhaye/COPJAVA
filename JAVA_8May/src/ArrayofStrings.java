import java.util.Scanner;

public class ArrayofStrings
{
	public static String[] acceptNames(String[] names, int size)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Elements of array");
		for(i = 0; i < size; i++)
			names[i] = sc.nextLine();
		sc.close();
		return names;
	}
	
	public static void displayNames(String[] names, int size)
	{
		int i;
		for(i = 0; i < size; i++)
			System.out.println(names[i].toUpperCase());
	}
	

	public static void main(String[] args) 
	{
		String names[] = new String[10];
		
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Names you Want to Enter");
		size = sc.nextInt();
				
		//Accepting Array
		names = acceptNames(names, size);
		
		//Display Array
		displayNames(names, size);

		sc.close();
	}

}
