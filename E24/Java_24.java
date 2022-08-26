package E24;

public class Java_24 {

	public static final String ANSI_GREEN = "\u001B[42m";
	public static final String ANSI_BLACK = "\u001B[40m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void niceTree() {
		String star = "*";
		String space = " ";
		int counter1 = 10;
		int counter2 = 0;
		for (int h = 0; h < 10; h++) {

			for (int i = 0; i < counter1; i++) {
				System.out.print(ANSI_RESET + space + ANSI_RESET);
			}
			for (int j = 0; j < counter2; j++) {
				System.out.print(ANSI_GREEN + star + star + ANSI_RESET);

			}
			counter1--;
			counter2++;
			System.out.println(ANSI_RESET);
		}

		System.out.println(space.repeat(8) + ANSI_BLACK + star.repeat(4) + ANSI_RESET);
		System.out.println(space.repeat(8) + ANSI_BLACK + star.repeat(4) + ANSI_RESET);

	}

	public static void main(String[] args) {
		niceTree();
	}
}