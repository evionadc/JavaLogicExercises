package secondExercices;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

	public List<String> treat_string(List<String> phrases) {

		List<String> treated_phrases = new ArrayList<String>();
		for (String phrase : phrases) {
			phrase = phrase.trim().substring(0, 1).toUpperCase() + phrase.trim().substring(1).toLowerCase().trim();
			if(validatorSpecialCharacterAtEnd(phrase)) {
				phrase = phrase.concat(".");
			}
			treated_phrases.add(phrase);
		}

		return treated_phrases;
	}

	public boolean validatorSpecialCharacterAtEnd(String string) {

		String y = String.valueOf(string.charAt(string.length()-1));
		if (!y.equals(".") || !y.equals("?") || !y.equals("!")) {
			return true;
		}

		return false;
	}

}
