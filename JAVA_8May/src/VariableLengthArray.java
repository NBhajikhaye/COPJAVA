
public class VariableLengthArray 
{

	public static void variableAddition(int... values)
	{
		int sum = 0;
		for(int i: values)
			sum = sum + i;
		System.out.println("Sum of "+values.length+" elements = "+sum);
	}
	public static void main(String[] args) 
	{
		variableAddition(10);
		variableAddition(10, 20);
		variableAddition(10, 20, 30);
		variableAddition(10, 20, 30, 40);
		variableAddition(10, 20, 30, 40, 50);
		variableAddition(10, 20, 30, 40, 50, 60);
		variableAddition(10, 20, 30, 40, 50, 60, 70);
		variableAddition(10, 20, 30, 40, 50, 60, 70, 80);
		variableAddition(10, 20, 30, 40, 50, 60, 70, 80, 90);
		variableAddition(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
	}

}
