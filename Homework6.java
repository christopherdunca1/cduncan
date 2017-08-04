import java.util.Scanner;
public class Homework6 {
	
	   public static void main (String[] args)
	   {
	      @SuppressWarnings("unused")
		int grade, category;

	      @SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);

	      System.out.print ("Enter a numeric grade (0 to 100): ");
	      grade = scan.nextInt();

	      category = grade / 10;

	      System.out.print ("That grade is ");
	      switch (category)
	      {
	         case 10:
	            System.out.println ("a perfect score. Job Well done.");
	            break;
	         case 9:
	            System.out.println ("well above average. Excellent.");
	            break;
	         case 8:
	            System.out.println ("above average. Nice job.");
	            break;
	         case 7:
	            System.out.println ("average.");
	            break;
	         case 6:
	            System.out.println ("below average. You should see the");
	            System.out.println ("professor to clarify the material "
	                                + "presented in class.");
	            break;
	         default:
	            System.out.println ("not between 0 and 100 please try again.");
	      }
	   }

	   }

