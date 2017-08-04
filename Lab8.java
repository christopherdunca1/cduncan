import java.util.*;
public class Lab8 
{
public static void main(String[] args)
{
int number = (9);

if(number<1)
{
System.out.print("For input number"+number);

}
else
{
	System.out.println("The writeSquares("+number+"");
			writeSquares(number);
			}
}
public static void writeSquares(int n){
	if(n==1){
		System.out.println("1"); 
	}
	else
	{
		if(n%2==1)
		{
			System.out.print(n*n+",");
			writeSquares(n-1);
		}
		else
		{
			writeSquares(n-1);
			System.out.print(","+n*n);
		}
	}
}
}




