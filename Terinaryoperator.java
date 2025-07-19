package myproject;
import java.util.Scanner;
public class Terinaryoperator {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=num.nextInt();
		System.out.println("Enter the value of b :");
		int b=num.nextInt();
		String result=(a>b)?"True.":"False.";
		System.out.println("The output is :"+result);
	}
}
