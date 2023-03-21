package secondExercices;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		
		StringUtils utils = new StringUtils();
		CirclesUtils c = new CirclesUtils();
		List<String> phrases = new ArrayList<>();
		
		phrases.add("today is monday");
		phrases.add("yesterday was saturday");
		phrases.add("There is a month left");
		phrases.add("         Where is he?");
		
		List<String> treated_phrases = utils.treat_string(phrases);
		
		System.out.println("Test treated phrases \n");
		for(String phrase : treated_phrases) {
			System.out.println(phrase);
		}
		
		System.out.println("Circles");
		
		List<Circles> circles = new ArrayList<Circles>();
		circles.add(new Circles(7.0, "Blue"));
		circles.add(new Circles(10.0, "White"));
		circles.add(new Circles(3.0, "Pink"));
		
		circles.sort(new CirclesUtils());
		
		System.out.println("The Circle "+ circles.get(2).getColor().toString() + " is the largest area");
		System.out.println("The Circle "+ circles.get(1).getColor().toString() + " is the medium area");
		System.out.println("The Circle "+ circles.get(0).getColor().toString() + " is the smallest area");


	}
	


}



