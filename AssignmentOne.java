import java.util.Scanner;


public class AssignmentOne {
	
	public static void main(String[] args) {
		
		int value;
		String valueString;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an Integer :");
		value = scan.nextInt();
		
		valueString = String.valueOf(value);
		System.out.println("The value after converting to String is " + valueString);
	}

}
