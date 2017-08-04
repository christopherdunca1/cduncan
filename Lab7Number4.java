
public class Lab7Number4 {
	public static void main(String[] args){
		fib(4);
		System.out.print(fib(4));}
	public static int fib(int n){
		if(n <= 1)
			return n;
		else 
			return fib(n-1) + fib(n-2);
	}
}
