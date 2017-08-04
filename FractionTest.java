import java.util.Scanner;
	public class FractionTest
	{
		public static void main(String[] args)
		{
			//get fraction 1
			System.out.println("Fraction 1");
			System.out.print("Enter the numerator: ");
			Scanner scn = new Scanner(System.in);
			double num = scn.nextInt();
		    	 	
			System.out.print("Enter the denominator: ");
			double denom = scn.nextInt();
			Fraction Frac1 = new Fraction(num, denom);
			
			//get fraction 2
			System.out.println("Fraction 2");
			System.out.print("Enter the numerator: ");
			num = scn.nextDouble();
			System.out.print("Enter the denominator: ");
			denom = scn.nextDouble();
			Fraction Frac2 = new Fraction(num, denom);
			if (num < 1 && denom < 1) 
			{
			   System.out.println("Your input does not match the criteria, please enter a number between 1 and above");

			   if(!scn.hasNextInt())
			   {
			       scn.next() ;
			   }
			   num = scn.nextInt();
			   denom = scn.nextInt();
			}
			//answer
			Fraction AnsAdd = Frac1.add(Frac2);
			Fraction Ansmultiply = Frac1.multiply(Frac2);
			
			
			System.out.println("This is the Addition Fraction:" +AnsAdd.getNumerator()+AnsAdd.getDenominator());
			System.out.println("This is the Multiplication Fraction:"+Ansmultiply.getNumerator()+"/"+Ansmultiply.getDenominator());

			//add
			

		}
	}
	