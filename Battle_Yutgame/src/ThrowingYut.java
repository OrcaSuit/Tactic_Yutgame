
import java.util.InputMismatchException;
import java.util.Scanner;


public class ThrowingYut {

	Scanner scan = new Scanner(System.in);
	int playerYut = 0;
	int playerNumber;
	int playerInfoArray[][] = new int[4][5];
	int yut;
	// �÷��̾��� ������ �����ϴ� �迭 [����(�÷��̾� ����id)][�̵��� ��ĭ]


	void throwing(int playerNumber){
		
		// �� �÷��̾ ���� �ϳ��� ������
		// 1�� ��(������ ��), 0�� ��(�ҷ��� ��) > 1�� 3���� ���̴�
		System.out.println("��� �÷��̾ ���� �����ϴ�.");
		System.out.println("������ ���� ������ 1, �ҷ��� ���� 0�� �Է��ϼ���");
		for (int times = 0; times <4 ;){
			System.out.println("��ȿ �� ���� >> "+times+" ���� ���� �� >> "+playerYut);
			try{
				yut = scan.nextInt();
			}
			catch(InputMismatchException ex){
				System.out.println("�������� 0 �Ǵ� 1�� �Է��ϼ�- ��ȿ �� ���� >> "+times);
				scan.nextLine(); // �����Ⱚ�� ������������ ������ ���ο� ���� �Է¹��� �غ� �Ѵ�
				scan.nextLine();
				//times--; // ������ ���� �ڸ��� ������� �� �ڸ��� ä���־�� �Ѵ�
				continue;
			}
			finally{
				if ((yut == 0) || (yut == 1))	{
					playerYut += yut;
					times++;
				}
				else {
					// 0�̳� 1�� �ƴ� �ٸ� ���� �Է����� ��� �ɷ�����
					System.out.println("0 �Ǵ� 1�� �Է��ϼ�- ��ȿ �� ���� >> "+times);
					// times--;
				}
			}
		}
		
		// �����ؼ� ���������� ���� ���Դ��� �÷��̾�� �˷��ش�
		switch(playerYut){
		case 0:
			// ���̳� �� ������ �ѹ� �� ������(������ �� �ִ� ������ �迭�� �־���ϳ�?)
			System.out.println("�÷��̾�"+playerNumber+"���� '��'�� ���Խ��ϴ�. ����ϱ���! �� �� �� �����ϴ�");
			++playerInfoArray[playerNumber][0];
			playerYut = 0; // �� �� �� ������ ���� �ʱ�ȭ
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
			playerYut = 0; // �� �� �� ������ ���� �ʱ�ȭ
			throwing(playerNumber);
			break;
		default:
			System.out.println("������� ���� �ȴ�����! ���� ���� �� >> " + playerYut);
			break;
		}
	//	scan.close(); ���⼭ ������ ��� jave.util.Scanner�� ������
		playerYut = 0; //�ʱ�ȭ
	} // ��� �÷��̾��� �̵�ĭ���� ������

	// �÷��̾�� ���° ���� ��ĭ �����ϰ��� ���϶�� �Ѵ�
	void result(int playerNumber){
		System.out.println("�÷��̾�"+playerNumber+"���� �̵� ���� Ƚ���� ������ �����ϴ�.");
		System.out.println("��\t��\t��\t��\t��");
		System.out.println(playerInfoArray[playerNumber][1]+"\t"+playerInfoArray[playerNumber][2]
				+"\t"+playerInfoArray[playerNumber][3]+"\t"+playerInfoArray[playerNumber][4]
						+"\t"+playerInfoArray[playerNumber][0]);
	}
}

