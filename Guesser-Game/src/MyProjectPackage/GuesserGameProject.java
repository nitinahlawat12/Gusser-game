package MyProjectPackage;
import java.util.*;

class Guesser{
	int guesserNum; //instance variable
	
	public int takeNumberGuesser() {
		System.out.println("Guesser guess a Number");
		Scanner sc = new Scanner(System.in);
		guesserNum = sc.nextInt();
		return guesserNum;
	}
}

class Player{
	int playerNum;
	
	public int takeNumberPlayer() {
		System.out.println("Player guess a Number");
		Scanner sc = new Scanner(System.in);
		playerNum = sc.nextInt();
		return playerNum;
	}
}

class Umpire{
	int numfromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	
	void collectFromGuesser() {
		Guesser g = new Guesser();
		numfromGuesser = g.takeNumberGuesser();
	}
	
	void collectfromPlayer() {
		Player p1 = new Player();
		numfromPlayer1=p1.takeNumberPlayer();
		
		Player p2 = new Player();
		numfromPlayer2=p2.takeNumberPlayer();
		
		Player p3 = new Player();
		numfromPlayer3=p3.takeNumberPlayer();
	}
	
	void compare() {
		if(numfromPlayer1==numfromGuesser) {
			if(numfromPlayer2==numfromGuesser && numfromPlayer3 == numfromGuesser) {
				System.out.println("All player won the game");
			}
			else if (numfromPlayer2 == numfromGuesser) {
				System.out.println("Only Player1 and Player2 won the game");
			}
			else if (numfromPlayer3 == numfromGuesser) {
				System.out.println("Only Player1 and Player3 won the game");
			}
			else {
				System.out.println("Only Player1 won the game");
			}
		}
		else if(numfromPlayer2 == numfromGuesser) {
			if(numfromPlayer3 == numfromGuesser) {
				System.out.println("Only Player2 and Player 3 won the game");
			}
			else {
				System.out.println("Only player2 Won the game");
			}
		}
		else if(numfromPlayer3==numfromGuesser){
			System.out.println("Only Player 3 won the game");
		}
		else {
			System.out.println("Game lost try again.....");
		}
	}
}

public class GuesserGameProject {

	public static void main(String[] args) {
		Umpire U = new Umpire();
		U.collectFromGuesser();
		U.collectfromPlayer();
		U.compare();
	}

}
