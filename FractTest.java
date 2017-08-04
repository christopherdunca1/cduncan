import java.util.Scanner;
	public class FractTest
	{
		public static void main(String[] args)
		{
			//get fraction 1
			System.out.println("Fraction 1");
			System.out.print("Enter the numerator: ");
			Scanner scn = new Scanner(System.in);
			int num = scn.nextInt();
			System.out.print("Enter the denominator: ");
			int denom = scn.nextInt();
			Fraction1 Frac1 = new Fraction1(num, denom);
			
			//get fraction 2
			System.out.println("Fraction 2");
			System.out.print("Enter the numerator: ");
			num = scn.nextInt();
			System.out.print("Enter the denominator: ");
			denom = scn.nextInt();
			Fraction1 Frac2 = new Fraction1(num, denom);
			
			//answer
			Fraction1 AnsSub = Frac1.subtract(Frac2);
			Fraction1 AnsAdd = Frac1.add(Frac2);
			Fraction1 Ansmultiply = Frac1.multiply(Frac2);
			
			System.out.println("This is the Subtraction Fraction: "+AnsSub.getNumerator()+"/"+AnsSub.getDenominator());
			System.out.println("This is the Addition Fraction:" +AnsAdd.getNumerator()+"/"+AnsAdd.getDenominator());
			System.out.println("This is the Multiplication Fraction:"+Ansmultiply.getNumerator()+"/"+Ansmultiply.getDenominator());

			//add
			

		}
	}

