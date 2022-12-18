import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskFour {
	private static boolean breaking = false;
	private static String name;
	private static String  s;
	private static int  age;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		name= in.nextLine();
		
		while(!breaking) {
			
			breaking=validAge();
		}
		
		System.out.println("Happy " + age + getCardinal() + " Birthday "+ name);
		
	}
	


	private static boolean validAge() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age");
		s = in.nextLine();
		
		try {
			age = Integer.parseInt(s);
			if(age>1 && age<=130) {
				
				return true;
			}
			else {
				System.out.println("Enter age between 1 and 130");
				return false;
			}
			
		} catch (Exception e) {
			System.out.println("Enter only numbers");
			return false;
		}
		
	}
	
	private static String getCardinal() {
		
		int lastDigit = getLastDigit(s);
		
		switch(lastDigit){
			
		case 1: return "st";
		case 2: return "nd";
		case 3: return "rd";
		default:
			return "th";
			
		}
	}
	
	public static int getLastDigit(String number) {
		   List<Integer> digits = new ArrayList<Integer>();
		   for(int i = 0; i<number.length(); i++) {
			   
			   String y = String.valueOf(number.charAt(i));
			   int x = Integer.parseInt(y);
			   digits.add(x);
		   }
		   return digits.get(digits.size()-1);
		}

}
