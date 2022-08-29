package E41;


public class Main {

	public static void main(String[] args) {
		TresEnRaya partida= new TresEnRaya();
	
		partida.displayTablero();
		int choice=partida.gameMenu();
		switch(choice) {
		case 1: 
			partida.playerVSplayer();
		}
		boolean game=true;
while (game) {
	
}
	}

}
