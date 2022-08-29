package E41;

import java.util.Iterator;
import java.util.Scanner;

public class TresEnRaya {
	String[] filatop = { "| |", "|1", "|2|", "3| " };
	String[] fila1 = { "|1|", "| ", "| |", " |" };
	String[] fila2 = { "|2|", "| ", "| |", " |" };
	String[] fila3 = { "|3|", "| ", "| |", " |" };
	String empty = "| |";

	public void displayTablero() {
		showArray(filatop);
		showArray(fila1);
		showArray(fila2);
		showArray(fila3);
	}

	public static void showArray(String[] x) {
		for (String string : x) {
			System.out.print(string);
		}
		System.out.println("\n");
	}

	public int gameMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n1. Humano contra humano\n");
		System.out.print("\n2. Humano contra CPU\n");
		System.out.print("\n3. Humano contra CPU\n");
		int choice = sc.nextInt();
		return choice;
	}

	public void playerVSplayer() {
		String playerFist = coinFlip();
		displayTablero();
		gameBegins(playerFist);
	}

	public void gameBegins(String activePlayer) {
		System.out.println("(" + activePlayer + ")" + " Inserta cordenadas (x,y)");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		char choicex = choice.charAt(1);
		char choicey = choice.charAt(3);
		setPiece(choicex, choicey, activePlayer);
	}

	public void setPiece(char x, char y, String player) {
		int Xint = Character.getNumericValue(x);
		int Yint = Character.getNumericValue(y);
		boolean isEmpty = spaceIsTaken(Xint, Yint);
		if (isEmpty) {
			String piece = "|" + player + "|";
			switch (Yint) {
			case 1:
				this.fila1[Xint] = piece;
				break;
			case 2:
				this.fila2[Xint] = piece;
				break;
			case 3:
				this.fila3[Xint] = piece;
				break;
			}
			displayTablero();
			boolean gameState = checkGameState(player);
			if (gameState) {
				player = changeActivePlayer(player);
				gameBegins(player);
			}
		} else {
			System.out.println("Espacio ya ocupado. Escoje otro.");
			gameBegins(player);

		}

	}

	public boolean spaceIsTaken(int x, int y) {
		boolean state;
		switch (y) {
		case 1:
			state = (fila1[x] == empty || fila1[x] == "| " || fila1[x] == " |") ? true : false;
			return state;
		case 2:
			state = (fila2[x] == empty || fila2[x] == "| " || fila2[x] == " |") ? true : false;
			return state;
		case 3:
			state = (fila3[x] == empty || fila3[x] == "| " || fila3[x] == " |") ? true : false;
			return state;
		default:
			return true;
		}
	}

	public String changeActivePlayer(String activePlayer) {
		activePlayer = activePlayer == "x" ? "O" : "x";
		return activePlayer;
	}

	public boolean checkGameState(String activePlayer) {
// wincons
		if (winCondition()) {
			return false;
		} else if (boardIsFull()) {
			return false;
		} else
			return true;
	}

	public boolean winCondition() {
		if (//horizontales
				(fila1[1] == fila1[2] && fila1[2] == fila1[3]) || (fila2[1] == fila2[2] && fila2[2] == fila2[3])
				|| (fila3[1] == fila3[2] && fila3[2] == fila3[3])
				//verticales
				|| (fila1[1] == fila2[1] && fila2[1] == fila3[1])
				|| (fila1[2] == fila2[2] && fila2[2] == fila3[2]) 
				|| (fila1[3] == fila2[3] && fila2[3] == fila3[3])
				//diagonales
				|| (fila1[1] == fila2[2] && fila2[2] == fila3[3]) || (fila1[3] == fila2[2] && fila2[2] == fila3[1])) {
			System.out.println("SE ACABO");
			return false; // WINCONDITION, CAMBIAR CUANDO VA_YA
		} else
			System.out.println("la partida sigue...");
		return false;
	}

	public boolean checkifempty(String x) {
		if (x == empty || x == "| " || x == " |") {
			return true;
		} else {
			return false;
		}
	}

	public boolean boardIsFull() {
		boolean isFull = false;
		if (fila1[1] == " x " || fila1[1] == " O " && fila1[2] == " x " || fila1[2] == " O " && fila1[3] == " x "
				|| fila1[3] == " O " && fila2[1] == " x " || fila2[1] == " O " && fila2[2] == " x "
				|| fila2[2] == " O " && fila2[3] == " x " || fila2[3] == " O " && fila3[1] == " x "
				|| fila3[1] == " O " && fila3[2] == " x " || fila3[2] == " O " && fila3[3] == " x "
				|| fila3[3] == " O ") {
			return true;
		} else
			return false;
	}

	public static String coinFlip() {
		int coinflip = (int) Math.round(Math.random());
		String playerFirst = coinflip == 0 ? "x" : "O";
		System.out.println("Empieza " + playerFirst);
		return playerFirst;

	}

}
