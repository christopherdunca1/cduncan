import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		
//		System.out.println(a);
//		System.out.println(Arrays.toString(a));
		System.out.println("Enter the row:");
		int row = user_input.nextInt();
		
		System.out.println("Enter the column:");
		int column = user_input.nextInt();
		
		int a[][] = new int[row][column];
		Random rnd = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rnd.nextInt(899 + 1)+100;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();

		}
//		System.out.println("The Location we found the row is:   ");
//		System.out.println("The Location we found the column is:  ");
		System.out.println("Enter a number:");
		int number = user_input.nextInt();
		int[] result = Linear(a, number);
		if (result[0]!=-1)
			System.out.println(result[0]+" , "+result[1]);
		else
			System.out.println("there is no number");
	}

	public static int[] Linear(int[][] a, int number) {
		int[] location = { -1, -1 };
		for (int i = 0; i < a.length; i++) {
			for (int column = 0; column < a[0].length; column++) {
				if (a[i][column] == number){
					location[0] = i;
					location[1] = column;
				}
			}
		}
		return location;
	}
}
