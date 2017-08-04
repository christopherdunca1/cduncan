
import java.util.Scanner;
public class Swap {
	public static int swapDigitPairs(int number) {
  
	    int result = 0;
	    int place = 1;
	    while (number > 9) {
	        result += place * 10 * (number % 10);
	        number /= 10;
	        result += place * (number % 10);
	        number /= 10;
	        place *= 100;
	    }
	    return result + place * number;
	}
	private static void swapLetterPairs() {
		 
		}

		public static void swapPairs(String S){
		    int cl = S.length() - 1;
		    for(int i = 0; i < cl; i= i + 2) {
		        System.out.print(S.charAt(i + 1));
		        System.out.print(S.charAt(i));
		        if (i == cl -1 ) {
		            System.out.print(S.charAt(cl));
		        } else {
		        }
		    }
		    System.out.print("\n");
		}
	public static void main(String[] args) throws Exception {
	    System.out.println(swapDigitPairs(1234));
	    swapPairs("abcd");
	    System.out.println(swapDigitPairs(12345));
	    swapPairs("abcde");
	}
}
