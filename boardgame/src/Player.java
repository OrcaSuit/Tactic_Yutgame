
import java.util.Scanner;

public class Player{
	//����world
	//player's basic variables
	Scanner sc = new Scanner(System.in);
	int score;
	String name,team;
	
	//�߰��� �� �� : position of piece(make array which saves location data), whole board x 3
		
	void getName(){
			System.out.println("Type your name, Player");
			name = sc.next();
			System.out.println("Your name is " + name);
	}//end of getName

	void selectTeam(){
		System.out.println("choose your team, Player (blue or white)");
		team = sc.next();
		team = team.toLowerCase();
	}


}
