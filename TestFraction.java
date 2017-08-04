import java.util.Scanner;
//Here is the import for Scanner

	public class TestFraction
	{
		public static void main(String[] args)
		{
			//This is going to prompt the user to input the fraction numbers
			//This is going to be fraction #1
			System.out.println("This is going to be Fraction #1: ");
			//Prompting the user to input the Numerator
			System.out.print("Please go and Enter the Numerator: ");
			Scanner input = new Scanner(System.in);
			double num = input.nextInt();
		    //Here we are asking the user to enter the Denominator	 	
			System.out.print("Please go and Enter the Denominator: ");
			double denom = input.nextInt(); //This is telling the user to input the next integer number.
			//Notice how I use scn.nextInt() which is prompting the user
			Fraction Frac1 = new Fraction(num, denom);
			
			//This is going to be fraction #2
			System.out.println("Fraction 2");
			//Here we are asking the user input the Numerator
			System.out.print("Enter the numerator: ");
			//Here we are telling the user to input the numerator which is with
			//The user scanner input and it is showing that it is a double value
			num = input.nextDouble();
			//Here we are asking the user to input the Denominator
			System.out.print("Enter the denominator: ");
			//Here we are taking the input of the next denominator integer
			denom = input.nextDouble();
			//Here we are making the fraction#2 object
			Fraction Frac2 = new Fraction(num, denom);
			
			//Here we are adding the fractions together
			Fraction Add = Frac1.add(Frac2);
			//Here is the print statement after the fractions have been added
			System.out.println("Here is the fraction after is has been added:" +Add.getNumerator()+Add.getDenominator());
			
		
			
		}
	}