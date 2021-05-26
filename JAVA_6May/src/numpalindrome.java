import java.util.Scanner;

public class numpalindrome 
{

	public static void main(String[] args) 
	{
		int num, rev, rem, temp;
		rev = 0;

		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the number to check palindrome");
		num = sc.nextInt();
		
		temp = num;
		while(temp != 0)
		{
			rem = temp % 10;
			rev = rev  * 10 + rem;
			temp = temp / 10;
		}
		
		if(rev == num)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is NOT palindrome");
	}

}
