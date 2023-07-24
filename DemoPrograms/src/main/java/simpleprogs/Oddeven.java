package simpleprogs;
import java.util.Scanner;
public class Oddeven 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		Scanner num= new Scanner(System.in);
		int a= num.nextInt();
		if(a%2==0)
		{
			System.out.println("Even");
	}
		else
		{
			System.out.println("Odd");
		}
}
}