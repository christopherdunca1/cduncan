import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = scanner.nextLine();
        name = name.substring(name.indexOf(" ")+1, name.length())+" "+name.substring(0, name.indexOf(" "));
        System.out.println(name);
    }
}