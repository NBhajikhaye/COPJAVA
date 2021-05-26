import java.util.Scanner;

public class ArrayMenu 
{
	public static void main(String[] args) 
	{		
		int i, j, size, choice, sum = 0, avg = 0, temp;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements of array");
		for(i =0; i < size; i++)
			array[i] = sc.nextInt();
		
		do
		{
			System.out.println("---Menu---");
			System.out.println("1. Sum of elements of array");
			System.out.println("2. Average of elements of array");
			System.out.println("3. Minimum element in array");
			System.out.println("4. Maximum element in array");

			System.out.println("\n Enter Your Choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: //Sum of elements of array
						for(i = 0; i < size; i++)
							sum = sum + array[i];
						System.out.println("Sum of elements of array : "+sum);
						break;
				
				case 2: //Average of elements of array
						for(i = 0; i < size; i++)
							sum = sum + array[i];
						avg = sum / size;
						System.out.println("Average of elements of array : "+avg);
						break;
						
				case 3: //Minimum element in array
						for(i = 0; i < size - 1; i++) {
							for(j = 0; j < size - 1; j++) {
								if(array[j] >= array[j + 1]) {
									temp = array[j];
									array[j] = array[j + 1];
									array[j + 1] = temp;
								}	}	}
						System.out.println("Minimum Element : "+array[0]);
						break;
						
				case 4: //Maximum element in array
						for(i = 0; i < size - 1; i++) {
							for(j = 0; j < size - 1; j++) {
								if(array[j] >= array[j + 1]) {
									temp = array[j];
									array[j] = array[j + 1];
									array[j + 1] = temp;
								}	}	}
						System.out.println("Maximum Element : "+array[size - 1]);
						break;
				default :
						System.out.println("Invalid Choice");
						break;
			}	
		}while(choice < 5);
		
		sc.close();
	}

}
