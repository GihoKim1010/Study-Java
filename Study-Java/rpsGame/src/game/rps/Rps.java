package game.rps;

import java.util.Scanner; //ctrl + c + o �ϸ� �ڵ����� ����Ʈ����.

public class Rps {

	void run() {
		while (true) {
			int n = playRps();
			if (n == 1) {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}
		}
	}

	// if(userRpc.equals("����"))�� ���ڿ��� ������ ����. if(userRpc == "����")�� ����� �ּұ��� ���ƾ� ����.

	
	// ���������� ����
	int playRps() {
		System.out.println("����, ����, �� �߿��� �ϳ��� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();
		String result = "";

		// ��ǻ�Ͱ� �� ���� ����.
		int com = (int) (Math.random() * 3 + 1);
		String comRps = "";

		if (com == 1) {
			comRps = "����";
		} else if (com == 2) {
			comRps = "����";
		} else if (com == 3) {
			comRps = "��";
		}

		// ��� ��
		if (cmd.equals("x")) {
			return 1;
		} else if (cmd.equals("����")) {
			if (comRps.equals("����")) {
				result = "�����";
			} else if (comRps.equals("����")) {
				result = "�����";
			} else if (comRps.equals("��")) {
				result = "�̰���";
			}
		} else if (cmd.equals("����")) {
			if (comRps.equals("����")) {
				result = "�̰���";
			} else if (comRps.equals("����")) {
				result = "�����";
			} else if (comRps.equals("��")) {
				result = "�����";
			}
		} else if (cmd.equals("��")) {
			if (comRps.equals("����")) {
				result = "�����";
			} else if (comRps.equals("����")) {
				result = "�̰���";
			} else if (comRps.equals("��")) {
				result = "�����";
			}
		}
		System.out.println("�÷��̾� : " + cmd);
		System.out.println("��ǻ�� : " + comRps);
		System.out.println("��� : " + result);
		return 0;
	}
}