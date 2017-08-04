	import java.util.Scanner;

	public class GuessNumber {
	    public static void main(String[] args) {
	        int SecretNumber;
	        String guesstr, maxstr;
	        int GuessNumber;
	        int MaximumSecretNumber;
	   
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        while (true) {
	      
	            int count = 0;

	            System.out.print("Enter maximum value for secret number: ");
	          
	            maxstr = scanner.next();
	  
	            MaximumSecretNumber = Integer.parseInt(maxstr.trim());
	          
	            SecretNumber = (int) (Math.random() * MaximumSecretNumber + 1);
	            System.out.println("** A new secret number has been chosen **");

	            while (true) {
	                count++;
	                System.out.print("Enter Guess: ");
	                guesstr = scanner.next();
	                GuessNumber = Integer.parseInt(guesstr.trim());

	     
	                if (GuessNumber == SecretNumber) {
	                    System.out.println("You won in " + count + " guesses");
	                    System.out.print("Play Again ?(Y/N):");
	                    String c = scanner.next();
	                    if (c.equalsIgnoreCase("y")) {
	                        break;
	                    }
	                    
	                    else {
	                        System.out.println("* The Program have Terminated *");
	                        System.exit(0);

	                    }

	                } 
	                else if (GuessNumber < SecretNumber)
	                    System.out.println("* Too low; try again *");
	                else if (GuessNumber > SecretNumber)
	                    System.out.println("* Too high; try again *");

	            }
	        }

	    }

	}

