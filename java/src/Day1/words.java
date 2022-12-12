package Day1;

public class words {

	public static void main(String[] args) {
		String word = "To Count Number of Character";
		int character = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != ' ')
				character++;
		}
		System.out.println("Number of character in a string: " + character);
	}

}
