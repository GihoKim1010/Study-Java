package rpsGame;

import java.util.Scanner;

public class Rps {

	void run() {
		System.out.println("===가위바위보===");

		int com = (int) (Math.random() * 3 + 1);

		System.out.println("가위, 바위, 보 중 하나를 입력하세요: ");

		int player = 1; // 기본값으로 아무거나 설정.

		// 아래 두줄은 sc 빼곤 정형화 된 부분.
		// System.in 으로 인해 콘솔에서 데이터를 읽어 올 수 있게됨.
		// next() 메서드를 호출함으로서 사용자가 콘솔에 입력한 문자열 중 다음 단어를 읽어와서 cmd 변수에 저장.
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();

		String r = "";

		switch (cmd) {
		case "가위":
			System.out.println("플레이어가 가위를 냈습니다.");
			switch (com) {
			case 1:
				System.out.println("컴퓨터가 가위를 냈습니다.");
				r = "비겼습니다.";
				break;
			case 2:
				System.out.println("컴퓨터가 바위를 냈습니다.");
				r = "졌습니다.";
				break;
			case 3:
				System.out.println("컴퓨터가 보를 냈습니다.");
				r = "이겼습니다.";
				break;
			}
			break;
		case "바위":
			System.out.println("플레이어가 바위를 냈습니다.");
			switch (com) {
			case 1:
				System.out.println("컴퓨터가 가위를 냈습니다.");
				r = "이겼습니다.";
				break;
			case 2:
				System.out.println("컴퓨터가 바위를 냈습니다.");
				r = "비겼습니다.";
				break;
			case 3:
				System.out.println("컴퓨터가 보를 냈습니다.");
				r = "졌습니다.";
				break;
			}
			break;
		case "보":
			System.out.println("플레이어가 보를 냈습니다.");
			switch (com) {
			case 1:
				System.out.println("컴퓨터가 가위를 냈습니다.");
				r = "졌습니다.";
				break;
			case 2:
				System.out.println("컴퓨터가 바위를 냈습니다.");
				r = "이겼습니다.";
				break;
			case 3:
				System.out.println("컴퓨터가 보를 냈습니다.");
				r = "비겼습니다.";
				break;
			}
			break;
		default:
			System.out.println("가위, 바위, 보 중에서만 낼 수 있습니다.");
			r = "승패 결정 불가.";
			break;
		}
		System.out.println("결과: " + r);

	}
}
