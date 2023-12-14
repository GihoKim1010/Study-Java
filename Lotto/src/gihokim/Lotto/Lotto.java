package gihokim.Lotto;

import java.util.Scanner;

public class Lotto {

	void playGame() {

		// �� ���ڵ��� ������ �迭
		int[] userNum = new int[6];
		int[] ranNum = new int[7];

		// 6�� ���� �Է¹ޱ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("1~45 �߿���, ���� 6���� �Է��ϼ���.");

		// ������ �Է��� ���� 6��.
		for (int j = 0; j < 6; j++) {
			userNum[j] = sc.nextInt();
		}

		// �������� ���� ����. 7��°�� ���ʽ�
		ranNum[0] = (int) (Math.random() * 45 + 1);

		while (true) {
			ranNum[1] = (int) (Math.random() * 45 + 1);
			if (ranNum[1] != ranNum[0]) {
				break;
			}
		}

		while (true) {
			ranNum[2] = (int) (Math.random() * 45 + 1);
			if (ranNum[2] != ranNum[0] && ranNum[2] != ranNum[1]) {
				break;
			}
		}

		while (true) {
			ranNum[3] = (int) (Math.random() * 45 + 1);
			if (ranNum[3] != ranNum[0] && ranNum[3] != ranNum[1] && ranNum[3] != ranNum[2]) {
				break;
			}
		}

		while (true) {
			ranNum[4] = (int) (Math.random() * 45 + 1);
			if (ranNum[4] != ranNum[0] && ranNum[4] != ranNum[1] && ranNum[4] != ranNum[2] && ranNum[4] != ranNum[3]) {
				break;
			}
		}

		while (true) {
			ranNum[5] = (int) (Math.random() * 45 + 1);
			if (ranNum[5] != ranNum[0] && ranNum[5] != ranNum[1] && ranNum[5] != ranNum[2] && ranNum[5] != ranNum[3]
					&& ranNum[5] != ranNum[4]) {
				break;
			}
		}

		while (true) {
			ranNum[6] = (int) (Math.random() * 45 + 1);
			if (ranNum[6] != ranNum[0] && ranNum[6] != ranNum[1] && ranNum[6] != ranNum[2] && ranNum[6] != ranNum[3]
					&& ranNum[6] != ranNum[4] && ranNum[6] != ranNum[5]) {
				break;
			}
		}
		
		//���� ������ ������ 'same'�� 2� �� bonus ����
		int same=0;
		int bonus=0;
		
		for(int k=0; k<6; k++) {
			for(int l=0; l<6; l++) {
				if(userNum[k]==ranNum[l]) {
					same=same+1;
				}
				if(userNum[k]==ranNum[6]) {
					bonus=bonus+1;
				}
			}
		}
		
		// �Է��� ���ڿ� ���� ���� Ȯ���� ���
		System.out.println("���� ����: " + userNum[0] + "," + userNum[1] + "," + userNum[2] + "," + userNum[3] + ","
				+ userNum[4] + "," + userNum[5]);
		System.out.println("��÷�� ����: " + ranNum[0] + "," + ranNum[1] + "," + ranNum[2] + "," + ranNum[3] + ","
				+ ranNum[4] + "," + ranNum[5] + " / ���ʽ� ���� : " + ranNum[6]);

		//�ռ� ����
		if(same<3) {
			System.out.println("���Դϴ�.");
		}else if(same==3) {
			System.out.println("5���Դϴ�.");
		}else if(same==4) {
			System.out.println("4���Դϴ�.");
		}else if(same==5) {
			System.out.println("3���Դϴ�.");
			if(bonus==1) {
				System.out.println("2���Դϴ�.");
			}
		}else if(same==6) {
			System.out.println("1���Դϴ�.");
		}
	}
}
