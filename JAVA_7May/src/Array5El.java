import java.util.Scanner;

public class Array5El 
{

	public static void main(String[] args) 
	{
		int i;
		int array[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Values");
		for(i = 0; i < 5; i++)
			array[i] = sc.nextInt();
		
		System.out.println("Entered values are");
		for(i = 0; i < 5; i++)
			System.out.print(array[i]+"\t");
		
		sc.close();
	}

}
