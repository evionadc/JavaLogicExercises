package firstExercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskOne {
	
	private static boolean breaking = false;
	private static String number;

	public static void main(String[] args) {
		
		while(breaking == false) {
			
			breaking = getaNumber();
		}
		
		
		System.out.println("The combined value of " + number + " is " + sumDigits(getDigits(number)));
	}
	
	@SuppressWarnings("resource")
	private static boolean getaNumber()  {
		
		Scanner in = new Scanner( System.in );
		System.out.println("Enter a number");
		
		number = in.next();
		
		try {
			Integer.parseInt(number);
			
		} catch (Exception e) {
			System.out.println("Enter only numbers");
			return false;
		}
		
		return true;
		
	}
	
	public static List<Integer> getDigits(String number) {
	   List<Integer> digits = new ArrayList<Integer>();
	   for(int i = 0; i<number.length(); i++) {
		   
		   String y = String.valueOf(number.charAt(i));
		   int x = Integer.parseInt(y);
		   digits.add(x);
	   }
	   return digits;
	}
	
	private static int sumDigits(List<Integer> digits) {
		int total=0;
		for (Integer digit : digits) {
			total=total+digit;
		}
		
		return total;
	}

}
