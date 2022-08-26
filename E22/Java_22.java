package E22;

public class Java_22 {

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
	public static final String ANSI_BOLD="\u001B[1m";


	public static void flag1() {
		System.out.println(ANSI_BLUE + " ".repeat(20));
		System.out.println(ANSI_BLUE + " ".repeat(20));
		System.out.println(ANSI_BLUE + " ".repeat(20));
		System.out.println(ANSI_BLUE + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));

		System.out.println(ANSI_RESET+ANSI_UNDERLINE+ANSI_BOLD+ "UKRAINE"+ANSI_RESET);
	}
	
	public static void flag2() {
		System.out.println(ANSI_BLUE + " ".repeat(2)+ANSI_WHITE+" ".repeat(2)+ANSI_BLUE + " ".repeat(16));
		System.out.println(ANSI_BLUE + " ".repeat(2)+ANSI_WHITE+" ".repeat(2)+ANSI_BLUE + " ".repeat(2)+ANSI_WHITE + " ".repeat(14));
		System.out.println(ANSI_WHITE + " ".repeat(6)+ANSI_BLUE + " ".repeat(14		));
		System.out.println(ANSI_BLUE + " ".repeat(2)+ANSI_WHITE+" ".repeat(2)+ANSI_BLUE + " ".repeat(2)+ANSI_WHITE + " ".repeat(14));
		System.out.println(ANSI_BLUE + " ".repeat(2)+ANSI_WHITE+" ".repeat(2)+ANSI_BLUE + " ".repeat(16));
		System.out.println(ANSI_WHITE + " ".repeat(20));
		System.out.println(ANSI_BLUE + " ".repeat(20));
		System.out.println(ANSI_WHITE + " ".repeat(20));
		System.out.println(ANSI_BLUE + " ".repeat(20));
		System.out.println(ANSI_RESET+ANSI_UNDERLINE+ANSI_BOLD+ "GREECE"+ANSI_RESET);	}
	public static void flag3() {
		System.out.println(ANSI_BLUE + " ".repeat(7)+ANSI_WHITE+" ".repeat(6)+ANSI_RED + " ".repeat(7));
		System.out.println(ANSI_BLUE + " ".repeat(7)+ANSI_WHITE+" ".repeat(6)+ANSI_RED + " ".repeat(7));
		System.out.println(ANSI_BLUE + " ".repeat(7)+ANSI_WHITE+" ".repeat(6) +ANSI_RED + " ".repeat(7));
		System.out.println(ANSI_BLUE + " ".repeat(7)+ANSI_WHITE+" ".repeat(6)+ANSI_RED + " ".repeat(7));
		System.out.println(ANSI_BLUE + " ".repeat(7)+ANSI_WHITE+" ".repeat(6)+ANSI_RED + " ".repeat(7));
		System.out.println(ANSI_BLUE + " ".repeat(7)+ANSI_WHITE+" ".repeat(6)+ANSI_RED + " ".repeat(7));
		System.out.println(ANSI_BLUE + " ".repeat(7)+ANSI_WHITE+" ".repeat(6)+ANSI_RED + " ".repeat(7));
		System.out.println(ANSI_RESET+ANSI_UNDERLINE+ANSI_BOLD+ "FRANCE"+ANSI_RESET);	}
	
	public static void flag4() {
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_RESET+ ANSI_UNDERLINE+ANSI_BOLD+ "SPAIN	"+ANSI_RESET);	
	}

	public static void flag5() {
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_RESET+ANSI_UNDERLINE+ANSI_BOLD+ "CATALONIA"+ANSI_RESET);	
	}
	public static void flag6() {
		System.out.println(ANSI_BLACK + " ".repeat(20));
		System.out.println(ANSI_BLACK + " ".repeat(20));
		System.out.println(ANSI_BLACK + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_RED + " ".repeat(20));
		System.out.println(ANSI_RED	 + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_YELLOW + " ".repeat(20));
		System.out.println(ANSI_RESET+ANSI_UNDERLINE+ANSI_BOLD+ "GERMANY"+ANSI_RESET);	
	}
		public static String textFormat(String text, int background, String type) {
		type= type =="bold" ? ANSI_BOLD : "";
		String color="\u001B["+40+"m";
		return (color+type+""+text);
	}
		public static String textUnformat(String text) {
		 return text =text.replaceAll("\u001B\\[[;\\d]*m", "\u001B[0m");
		}

	public static void main(String[] args) {
		flag1();
		flag2();
		flag3();
		flag4();
		flag5();
		flag6();
		
		String formattedText=textFormat("Format this text for me", 40 , "bold");
		System.out.println(formattedText);
		
		String unformattedText=textUnformat(formattedText);
		System.out.println(unformattedText);
		

	}
}