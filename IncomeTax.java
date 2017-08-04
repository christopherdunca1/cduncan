import java.util.Random;
import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args){
		Scanner console=new Scanner(System.in);
		
		 
		 double tax=0;
		 double income=0;
		 double max = 0;
		 
		 Random rand=new Random();
		 int randomNumber=rand.nextInt(14)+1;
		 double n=console.nextDouble();
		  for(int i=1;i<=randomNumber;i++){
			     System.out.println("Person: "+i);
			     System.out.println("Please enter income: ");
		  max= Math.max(max, n);		//Keeps tack of the maximum value
		
		     if(n<750){
		          n=n*.1;
		          System.out.println("Tax due: $"+n);
		     }else if(n<2500){
		     n=0+7.5+n*.02;
		     System.out.println("Tax due: $"+n);
		
		 }else if(n<5000){
		     n=0+82.5+n*.04;
		     System.out.println("Tax due: $"+n);
		
		 }else if(n<8000){
		     n=0+142.50+n*.05;
		     System.out.println("Tax due: $"+n);
		
		 }else if(n>8000){
		     n=0+230+n*.06;
		     System.out.println("Tax due: $"+n);
		     
		     {
		    	
		 }
		 }
		 }
