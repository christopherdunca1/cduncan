
public class Homework4 {
	public static void main(String[] args){
		int a = 6;
	    int b = 7;
	    System.out.println(multiply(a,b));
	}
		public static int multiply(int a, int b){
			//base case
			if(a==0 || b==0)
				return 0;
			//base case
				if(a==1)
					return b;
				//recursive case
				return multiply(a-1, b)+b;
			}
		}
		
	

