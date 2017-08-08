package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptionhandling {
public static void main(String args[])
{
    int numerator, denominator;
    Boolean Loop=true;
    Scanner in =new Scanner(System.in);
	do{
	try {
		System.out.println("enter numerator and denominator");
		
		numerator =in.nextInt();
		denominator=in.nextInt();
		int quotient=numerator/denominator;
		System.out.println("the quotient is "+quotient);
	}
	catch (InputMismatchException e)
	{
		System.out.println(e);
		
		System.out.println("Decimal values not accepted");
		
	}
	catch (ArithmeticException e) {
		
        System.out.println("Division by is not possible ");
        System.out.println(e);
	}
	}while(Loop);
}
}
