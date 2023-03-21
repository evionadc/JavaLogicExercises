package firstExercises;
import java.util.Iterator;
import java.util.Scanner;

public class TaskThree {

	private static boolean breaking = false;
	
	
	public static void main(String[] args) {
		
		while(breaking == false) {
			
			breaking = validPassword();
		}
		
		System.out.println("Password accepted");
	}


	private static boolean validPassword() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = in.nextLine();
		boolean isValidLenght = validatorLenght(password);
		boolean isValidUpperCase= validatorUpperCase(password);
		boolean isValidSpecialChar = validatorSpecialCharacter(password);
		
		
		
		if( isValidLenght && isValidUpperCase && isValidSpecialChar) {
			
			return true;
		}
		else {
			return false;
		}
		
	}


	private static boolean validatorSpecialCharacter(String password) {
		
		for(int i = 0; i<password.length(); i++) {
			   
			   String y = String.valueOf(password.charAt(i));
			   if(y.equals("%") || y.equals("#") || y.equals("&") || y.equals("$")) {
				   return true;
			   }
		}
		System.out.println("Password must contain at least one of these special characters (%,#,&,$");
		return false;
	}


	private static boolean validatorUpperCase(String password) {
		for(int i = 0; i<password.length(); i++) {
			boolean isnumber = false;
			String y = String.valueOf(password.charAt(i));
			try {
				Integer.parseInt(y);
				isnumber = true;
			} catch (Exception e) {
				isnumber = false;
			}
			
			if(y.toUpperCase().equals(y) && !isnumber) {
				return true;
			}
		}
		System.out.println("Password must have one uppercase letter");
		return false;
	}


	private static boolean validatorLenght(String password) {
		
		int lenght=password.length();
		
		if(lenght <= 2) {
			System.out.println("Password must have 2 digits ");
			System.out.println("Password must be longer 8 digits ");
			return false;
		}
		else if(lenght <8) {
			System.out.println("Password must be longer 8 digits ");
			return false;
		}
		else {
			return true;
		}
		
	}

}
