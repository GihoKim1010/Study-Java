package game.rps;

import java.util.Scanner; //ctrl + c + o 하면 자동으로 임포트해줌.

public class Rps {

	void run() {
		while (true) {
			int n = playRps();
			if (n == 1) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		}
	}

	// if(userRpc.equals("가위"))는 문자열만 같으면 같음. if(userRpc == "가위")는 저장된 주소까지 같아야 같음.

	
	// 가위바위보 로직
	int playRps() {
		System.out.println("가위, 바위, 보 중에서 하나를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();
		String result = "";

		// 컴퓨터가 낼 것을 구현.
		int com = (int) (Math.random() * 3 + 1);
		String comRps = "";

		if (com == 1) {
			comRps = "가위";
		} else if (com == 2) {
			comRps = "바위";
		} else if (com == 3) {
			comRps = "보";
		}

		// 결과 비교
		if (cmd.equals("x")) {
			return 1;
		} else if (cmd.equals("가위")) {
			if (comRps.equals("가위")) {
				result = "비겼어용";
			} else if (comRps.equals("바위")) {
				result = "졌어용";
			} else if (comRps.equals("보")) {
				result = "이겼어용";
			}
		} else if (cmd.equals("바위")) {
			if (comRps.equals("가위")) {
				result = "이겼어용";
			} else if (comRps.equals("바위")) {
				result = "비겼어용";
			} else if (comRps.equals("보")) {
				result = "졌어용";
			}
		} else if (cmd.equals("보")) {
			if (comRps.equals("가위")) {
				result = "졌어용";
			} else if (comRps.equals("바위")) {
				result = "이겼어용";
			} else if (comRps.equals("보")) {
				result = "비겼어용";
			}
		}
		System.out.println("플레이어 : " + cmd);
		System.out.println("컴퓨터 : " + comRps);
		System.out.println("결과 : " + result);
		return 0;
	}
}