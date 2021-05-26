import java.util.Scanner;

public class CharArrayToString {
	public static void main(String[] args) 
	{
		int size, i;
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many characters you want to enter");
		size = sc.nextInt();
		
		char[] ch = new char[size];
		System.out.println("Enter the characters");
		for(i = 0; i < size; i++)
			ch[i] = sc.next().charAt(0);
		
		System.out.println("\n\n Entered characters");
		for(i = 0; i < size; i++)
			System.out.print("  "+ch[i]);
		
		s = "";
		for(i = 0; i < size; i++)
			s = s + ch[i];
		
		System.out.println("\n\n After Conversion "+s);
		
		sc.close();
	}
}
