// package boardgame;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.next();

		System.out.println("Hello players, Glad to see you all");
		System.out.println("From now on, we will play tactic yootnolee");
		
		Player mp = new Player(sc);
		ThrowingYut throwYut = new ThrowingYut();

		for(int i=1;i<5;i++){
			System.out.println("Type your name Player " + i);
			
			mp.name=sc.next();
			
			System.out.println("From now on, your name is " + mp.name + " Player " + i);
			
			mp.selectTeam();
		
			mp.setPlayer(mp.name, mp.team, 2, 1, 0, i);
			
			System.out.println("��Ʋ �����̴� �÷��̾� 4���� ���� ���� �ϳ��� ������ �� �հ�� ������ ������ ĭ���� �����մϴ�.");
			System.out.println("�÷��̾�"+i+"���� ������ ĭ���� ���մϴ�.");
			System.out.println("�ո��� 0��, �޸��� 1�� �Է��ϸ� �� �� �ֽ��ϴ�.");
		
			throwYut.throwing(i);
			
		
		}
		
		sc.close();

	}

}
