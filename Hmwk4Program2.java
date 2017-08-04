
public class Hmwk4Program2 {
	public static void main(String[] args){
		int n = (10);
					writeSequence(n);
					}
	
	public static void writeSequence(int n) {
		
	    if( n < 1 )
	        throw new IllegalArgumentException();

	    if( n == 1 ) {
	        System.out.print("1");

	    } else if( n == 2 ) {
	        System.out.print("1 1");

	    } else if( n % 2 == 0 ){
	        System.out.print((n / 2) + " ");
	        writeSequence(n - 2);
	        System.out.print(" " + (n / 2));

	    } else if( n % 2 == 1 ) {
	        System.out.print(((n + 1) / 2) + " ");
	        writeSequence((n - 2));
	        System.out.print(" " + ((n + 1) / 2));
	    }       
	}
}
