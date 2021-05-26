import java.lang.*;

public class compound 
{

	public static void main(String[] args) 
	{
		double compamt, compint;
		int i = 0;
		
		compamt = 20000 * Math.pow(1+(0.06/1),3);
		
		System.out.println("Compount Amount = "+compamt);
		
		compint = compamt - 20000;
		System.out.println("Compount Interest = "+compint);

	}

}
