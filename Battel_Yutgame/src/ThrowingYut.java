
import java.util.Scanner;


public class ThrowingYut {

	Scanner scan = new Scanner(System.in);
	int playerYut = 0;
	int playerNumber;
	int playerInfoArray[][] = new int[4][5];
	// �÷��̾��� ������ �����ϴ� �迭 [����(�÷��̾� ����id)][�̵��� ��ĭ]


	void throwing(int playerNumber){
		int yut;
		// �� �÷��̾ ���� �ϳ��� ������
		// 1�� ��(������ ��), 0�� ��(�ҷ��� ��) > 1�� 3���� ���̴�
		for (int times = 0; times <4 ;){
			if ((yut = scan.nextInt()) == 0 || (yut == 1))	{
				playerYut += yut;
				times++;
			}
			else
				// 0�̳� 1�� �ƴ� �ٸ� ���� �Է����� ��� �ɷ�����
				System.out.println("0 �Ǵ� 1�� �Է��ϼ�");
		}
		// �����ؼ� ���������� ���� ���Դ��� �÷��̾�� �˷��ش�
		switch(playerYut){
		case 0:
			// ���̳� �� ������ �ѹ� �� ������(������ �� �ִ� ������ �迭�� �־���ϳ�?)
			System.out.println("�÷��̾�"+playerNumber+"���� '��'�� ���Խ��ϴ�. ����ϱ���! �� �� �� �����ϴ�");
			++playerInfoArray[playerNumber][0];
			throwing(playerNumber);
			break;
		case 1:
			System.out.println("�÷��̾�"+playerNumber+"���� '�鵵'�� ���Խ��ϴ�. �̰��� ���� �Ѽ��� �ɱ��?");
			++playerInfoArray[playerNumber][1];
			break;
		case 2:
			System.out.println("�÷��̾�"+playerNumber+"���� '��'�� ���Խ��ϴ�.");
			++playerInfoArray[playerNumber][2];
			break;
		case 3:
			System.out.println("�÷��̾�"+playerNumber+"���� '��'�� ���Խ��ϴ�.");
			++playerInfoArray[playerNumber][3];
			break;
		case 4:
			System.out.println("�÷��̾�"+playerNumber+"���� '��'�� ���Խ��ϴ�. �� �� �� �����ϴ�");
			++playerInfoArray[playerNumber][4];
			throwing(playerNumber);
			break;

		}
	//	scan.close();
		playerYut = 0; //�ʱ�ȭ
	} // ��� �÷��̾��� �̵�ĭ���� ������

	// �÷��̾�� ���° ���� ��ĭ �����ϰ��� ���϶�� �Ѵ�
}

