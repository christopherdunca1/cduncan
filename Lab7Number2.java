public class Lab7Number2{
	public static void main(String[] args){
		printN(8);
}
private static void printN(int n){
	if(n>1){
		printN(n-1);
}
	System.out.println(n);
}
}
