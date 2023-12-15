package gihoKim.Kiosk;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Product drink=new Product("음료");
		Product dessert=new Product("디저트");
		Product americano=new Product("아메리카노", 2000);
		Product espresso=new Product("에스프레소", 1500);
		Product cake=new Product("케이크", 8000);
		Product cookie=new Product("쿠키", 5000);
		
		System.out.println("==============================");
		System.out.println("=======상품을 선택해주세요.========");
		System.out.println("==============================");
		
		Scanner sc = new Scanner(System.in);
		String cmd;
		
		loop_a:
			while(true) {
				System.out.println("\n 1.음료 2.디저트");
				cmd = sc.next();
				switch(cmd){
				case "1":
					System.out.println("==============================");
					System.out.println("=============음 료=============");
					System.out.println("==============================");
					americano.info();
					espresso.info();
					loop_b:
						while(true) {
							System.out.println("\n ==============================");
							System.out.println(" 1.아메리카노 2.에스프레소 3.나가기");
							cmd = sc.next();
							switch(cmd){
							case "1":
								System.out.println("아메리카노를 선택하셨습니다.");
								loop_c:
									while(true) {
										System.out.println("1. Hot 2.Ice 3.취소");
										cmd = sc.next();
										switch(cmd){
										case"1":
											System.out.println("따듯한 아메리카노");
											break loop_c;
										case"2":
											System.out.println("차가운 아메리카노");
											break loop_c;
										case"3":
											break loop_c;
										}
									}
								break loop_b;
								
							case "2":
								System.out.println("에스프레소를 선택하셨습니다.");
								loop_d:
									while(true) {
										System.out.println("1. Hot 2.Ice 3.취소");
										cmd = sc.next();
										switch(cmd){
										case"1":
											System.out.println("따듯한 에스프레소");
											break loop_d;
										case"2":
											System.out.println("차가운 에스프레소");
											break loop_d;
										case"3":
											break loop_d;
										}
									}
								break loop_b;
									
							case "3":
								System.out.println("취소");
								break loop_b;
							}
						}
					
				case "2":
					System.out.println("==============================");
					System.out.println("=============디저트=============");
					System.out.println("==============================");
					cake.info();
					cookie.info();
					loop_e:
						while(true) {
							System.out.println("\n ==============================");
							System.out.println(" 1.케이크 2.쿠키 3.나가기");
							cmd = sc.next();
							switch(cmd){
							case "1":
								System.out.println("케이크를 선택하셨습니다.");
								loop_f:
									while(true) {
										System.out.println("1. 딸기 2.오렌지 3.취소");
										cmd = sc.next();
										switch(cmd){
										case"1":
											System.out.println("딸기 케이크");
											break loop_f;
										case"2":
											System.out.println("오렌지 케이크");
											break loop_f;
										case"3":
											break loop_f;
										}
									}
									break;
								
							case "2":
								System.out.println("쿠키를 선택하셨습니다.");
								loop_g:
									while(true) {
										System.out.println("1.초콜릿 2.버터 3.취소");
										cmd = sc.next();
										switch(cmd){
										case"1":
											System.out.println("초콜릿쿠키");
											break loop_g;
										case"2":
											System.out.println("버터쿠키");
											break loop_g;
										case"3":
											break loop_g;
										}
									}
									break;
									
							case "3":
								break loop_e;
							}
						
						}
				break loop_a;
			}
			}
	}
}



