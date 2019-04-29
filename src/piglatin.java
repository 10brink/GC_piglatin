import java.util.Scanner;

public class piglatin {

	public static void main(String[] args) {
		// pig latin week 1 capstone
		String answer = "y";
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("input a string to convert: ");
			String word = scan.nextLine();

			System.out.println("you said: " + word);

			// System.out.println(containsNum(word));
			// System.out.println(containsSymbol(word));

			System.out.println(convertPig(word));

			System.out.println("Continue? (y/n)");
			answer = scan.next();

		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}

	public static String convertPig(String word) {
		// method to translate a string to pig latin
		String result = "";
		char firstLetter = word.charAt(0);

		// char vowels[] = new char[] { 'a', 'e', 'i', 'o', 'u' };
		// word = word.toLowerCase();

		if (isVowel(firstLetter)) {
			result = result + word + "way";
		}
		else {
			int place = 0;
			for (int i = 0; i <= word.length(); i++) {
				char letter = word.charAt(i);
				if (isVowel(letter)) {
					place = i;
					// System.out.println("vowel at index " + i);
					break;
				}
			}
			String newend = word.substring(0, place);
			String end = word.substring(place);

			result = end + newend + "ay";

		}
		return result;
	}

	public static boolean isVowel(char c) {
		// method to check if char is a vowel
		return "AEIOUaeiou".indexOf(c) != -1;
	}

	public static boolean containsNum(String str) {
		for (int i = 0; i <= str.length(); i++) {
			char letter = str.charAt(i);
			if ("0123456789".indexOf(letter) != -1) {
				return true;
			}
		}

		return false;
	}

	public static boolean containsSymbol(String str) {
		for (int i = 0; i <= str.length(); i++) {
			char letter = str.charAt(i);
			if ("!@#$%^&*()_+=-<>?/;:{}".indexOf(letter) != -1) {
				return true;
			}
		}

		return false;
	}

}
