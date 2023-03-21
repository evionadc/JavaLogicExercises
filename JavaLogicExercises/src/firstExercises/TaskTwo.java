package firstExercises;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskTwo {
	
	static String number;
	static boolean breaking;
	static double pounds = 2.20;
	static double onces = 35.27;

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		while(breaking == false) {
			
			breaking = getaNumber();
		}
		
		int max = Integer.parseInt(number);
		
		System.out.println("| Kilogramas | Pounds | Onces |");
		for(int i = 1 ; i<= max; i++) {
			
			System.out.println("|         " + (i)+ "  |" + df.format(i*pounds) + "    |" + df.format(i*onces) + " |" );
			
		}
	}
	
	@SuppressWarnings("resource")
	private static boolean getaNumber()  {
		
		Scanner in = new Scanner( System.in );
		System.out.println("Enter MAX");
		
		number = in.next();
		
		try {
			Integer.parseInt(number);
			
		} catch (Exception e) {
			System.out.println("Enter only numbers");
			return false;
		}
		
		return true;
		
	}

}
