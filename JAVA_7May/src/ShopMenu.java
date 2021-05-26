import java.util.Scanner;

public class ShopMenu 
{
	public static void main(String[] args) 
	{
		int pen, pencil, notebook, bottle, colorbox, total = 0, choice, quantity;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("---Menu---");
			System.out.println("1. Pen (10 Rs)");
			System.out.println("2. Pencil (5 Rs)");
			System.out.println("3. Notebook (20 Rs)");
			System.out.println("4. Bottle (30 Rs)");
			System.out.println("5. Colorbox (50 Rs)");
			System.out.println("6. Exit");
			choice = sc.nextInt();
			
			switch (choice)
			{
				case 1: //Pen 15 Rs
						System.out.println("Enter Quantity of Pens");
						quantity = sc.nextInt();
						total = total + (10 * quantity);
						break;
						
				case 2: //Pencil 5 Rs
						System.out.println("Enter Quantity of Pencil");
						quantity = sc.nextInt();
						total = total + (5 * quantity);
						break;
						
				case 3: //Notebook 20 Rs
						System.out.println("Enter Quantity of Notebook");
						quantity = sc.nextInt();
						total = total + (20 * quantity);
						break;
						
				case 4: //Notebook 30 Rs
						System.out.println("Enter Quantity of Bottle");
						quantity = sc.nextInt();
						total = total + (30 * quantity);
						break;
				
				case 5: //ColorBox 30 Rs
						System.out.println("Enter Quantity of Color Box");
						quantity = sc.nextInt();
						total = total + (50 * quantity);
						break;
			}
			System.out.println("\n Grand Total "+total);
			System.out.println("\n");
		}while( choice < 6 );
	}

}
