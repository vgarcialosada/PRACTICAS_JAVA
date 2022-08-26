package E23;

import java.util.Random;

public class Java_23 {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[40m";
	public static final String ANSI_RED = "\u001B[41m";
	public static final String ANSI_GREEN = "\u001B[42m";
	public static final String ANSI_YELLOW = "\u001B[43m";
	public static final String ANSI_BLUE = "\u001B[44m";
	public static final String ANSI_PURPLE = "\u001B[45m";
	public static final String ANSI_CYAN = "\u001B[46m";
	public static final String ANSI_WHITE = "\u001B[47m";
	public static final String ANSI_UNDERLINE = "\u001B[4m";
	public static final String ANSI_BOLD = "\u001B[1m";

	public static void randomFormat(String toFormat) {
		for (int i = 0; i < toFormat.length(); i++) {
			Random random = new Random();
			int rand1 = random.nextInt(10 - 0 + 1) + 0;
			int rand2 = random.nextInt(10 - 0 + 1) + 0;
			String randomColor = "\u001B[4" + rand1 + "m";
			String randomFormat = "\u001B[" + rand2 + "m";
			System.out.print(ANSI_RESET+randomColor+randomFormat+toFormat.charAt(i)+ANSI_RESET);

		}
	}

	public static void main(String[] args) {
randomFormat("Double rainbow? What does it mean?");
randomFormat("Well, a \"double rainbow\" is a phenomenon of optics that displays a spectrum of light due to the sun shining on droplets of moisture in the atmosphere. Does that explain it?");
	}
}