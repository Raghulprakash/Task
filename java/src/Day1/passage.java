package Day1;

public class passage {

	public static void main(String[] args) {
		String paragraph = " Java is a high-level, class-based, object-oriented programming language.\n That is designed to have as few implementation dependencies as possible.\n It is a general-purpose programming language intended to let programmers write once, run anywhere.";
		System.out.println(paragraph);
		int count = 0;
		for (int i = 0; i < paragraph.length() - 1; i++) {
			if ((paragraph.charAt(i) == ' ') && (paragraph.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
		System.out.println("--------------");
		System.out.println("Words in the passage is : " + count);
	}

}
