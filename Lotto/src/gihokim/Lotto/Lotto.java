package gihokim.Lotto;

import java.util.Scanner;

public class Lotto {

	void playGame() {

		// 각 숫자들을 저장할 배열
		int[] userNum = new int[6];
		int[] ranNum = new int[7];

		// 6개 숫자 입력받기.
		Scanner sc = new Scanner(System.in);
		System.out.println("1~45 중에서, 숫자 6개를 입력하세요.");

		// 유저가 입력한 숫자 6개.
		for (int j = 0; j < 6; j++) {
			userNum[j] = sc.nextInt();
		}

		// 랜덤으로 뽑은 숫자. 7번째는 보너스
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
		
		//맞춘 갯수를 저장할 'same'과 2등에 쓸 bonus 지정
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
		
		// 입력한 숫자와 뽑힌 숫자 확인차 출력
		System.out.println("고르신 숫자: " + userNum[0] + "," + userNum[1] + "," + userNum[2] + "," + userNum[3] + ","
				+ userNum[4] + "," + userNum[5]);
		System.out.println("추첨된 숫자: " + ranNum[0] + "," + ranNum[1] + "," + ranNum[2] + "," + ranNum[3] + ","
				+ ranNum[4] + "," + ranNum[5] + " / 보너스 숫자 : " + ranNum[6]);

		//둥수 지정
		if(same<3) {
			System.out.println("꽝입니다.");
		}else if(same==3) {
			System.out.println("5등입니다.");
		}else if(same==4) {
			System.out.println("4등입니다.");
		}else if(same==5) {
			System.out.println("3등입니다.");
			if(bonus==1) {
				System.out.println("2등입니다.");
			}
		}else if(same==6) {
			System.out.println("1등입니다.");
		}
	}
}
