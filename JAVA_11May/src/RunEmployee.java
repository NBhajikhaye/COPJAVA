
public class RunEmployee 
{

	public static void main(String[] args) 
	{
		Employee[] emp = new Employee[5];
		int i;
		
//		Employee e1 = new Employee();
//		
//		e1.acceptEmpInfo();
//		e1.displayEmpInfo();
		
		for(i = 0; i < 5; i++)
			emp[i] = new Employee();

		for(i = 0; i < 5; i++)
			emp[i].acceptEmpInfo();
		
		for(i = 0; i < 5; i++)
			emp[i].displayEmpInfo();
		
		for(i = 0; i < 5; i++)
		{
			if(emp[i].getEmpSalary() > 20000)
				emp[i].displayEmpInfo();
		}
		
	}
}
