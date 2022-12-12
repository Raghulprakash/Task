package Day1;

public class vowles {

	public static void main(String[] args) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		int count = 0;
		for (int i = 0; i < letters.length(); i++)
			;
		{
			char vowle = letters.charAt(0);
			switch (vowle) {
			case 'a':
				count++;
			case 'e':
				count++;
			case 'i':
				count++;
			case 'o':
				count++;
			case 'u':
				count++;
			}

		}
		System.out.println("vowles in the string are :" + count);
	}

}
