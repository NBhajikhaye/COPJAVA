package ass1.Student;
import java.util.Scanner;

public class Student 
{
		public int rollNo;
		public String studName; 
		private char grade;
		double totalMarks;
	
	public void acceptStudInfo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Information");
		System.out.println("Enter Sudent Roll Number");
		rollNo = sc.nextInt();
		
		System.out.println("Enter Name");
		studName = sc.next();
		
		System.out.println("Enter Grade");
		grade = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println("Enter Percentage");
		totalMarks = sc.nextDouble();
		
		System.out.println();
	}
	
	public void displayStudInfo()
	{
		System.out.println("Student Information");
		System.out.println("Roll No. Name\tGrade\tTotal Marks");
		System.out.println(rollNo+"\t"+studName+"\t"+grade+"\t"+totalMarks);
		System.out.println("\n");
	}
}
