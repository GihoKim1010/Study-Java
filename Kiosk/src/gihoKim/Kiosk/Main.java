package gihoKim.Kiosk;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Product drink=new Product("����");
		Product dessert=new Product("����Ʈ");
		Product americano=new Product("�Ƹ޸�ī��", 2000);
		Product espresso=new Product("����������", 1500);
		Product cake=new Product("����ũ", 8000);
		Product cookie=new Product("��Ű", 5000);
		
		System.out.println("==============================");
		System.out.println("=======��ǰ�� �������ּ���.========");
		System.out.println("==============================");
		
		Scanner sc = new Scanner(System.in);
		String cmd;
		
		loop_a:
			while(true) {
				System.out.println("\n 1.���� 2.����Ʈ");
				cmd = sc.next();
				switch(cmd){
				case "1":
					System.out.println("==============================");
					System.out.println("=============�� ��=============");
					System.out.println("==============================");
					americano.info();
					espresso.info();
					loop_b:
						while(true) {
							System.out.println("\n ==============================");
							System.out.println(" 1.�Ƹ޸�ī�� 2.���������� 3.������");
							cmd = sc.next();
							switch(cmd){
							case "1":
								System.out.println("�Ƹ޸�ī�븦 �����ϼ̽��ϴ�.");
								loop_c:
									while(true) {
										System.out.println("1. Hot 2.Ice 3.���");
										cmd = sc.next();
										switch(cmd){
										case"1":
											System.out.println("������ �Ƹ޸�ī��");
											break loop_c;
										case"2":
											System.out.println("������ �Ƹ޸�ī��");
											break loop_c;
										case"3":
											break loop_c;
										}
									}
								break loop_b;
								
							case "2":
								System.out.println("���������Ҹ� �����ϼ̽��ϴ�.");
								loop_d:
									while(true) {
										System.out.println("1. Hot 2.Ice 3.���");
										cmd = sc.next();
										switch(cmd){
										case"1":
											System.out.println("������ ����������");
											break loop_d;
										case"2":
											System.out.println("������ ����������");
											break loop_d;
										case"3":
											break loop_d;
										}
									}
								break loop_b;
									
							case "3":
								System.out.println("���");
								break loop_b;
							}
						}
					
				case "2":
					System.out.println("==============================");
					System.out.println("=============����Ʈ=============");
					System.out.println("==============================");
					cake.info();
					cookie.info();
					loop_e:
						while(true) {
							System.out.println("\n ==============================");
							System.out.println(" 1.����ũ 2.��Ű 3.������");
							cmd = sc.next();
							switch(cmd){
							case "1":
								System.out.println("����ũ�� �����ϼ̽��ϴ�.");
								loop_f:
									while(true) {
										System.out.println("1. ���� 2.������ 3.���");
										cmd = sc.next();
										switch(cmd){
										case"1":
											System.out.println("���� ����ũ");
											break loop_f;
										case"2":
											System.out.println("������ ����ũ");
											break loop_f;
										case"3":
											break loop_f;
										}
									}
									break;
								
							case "2":
								System.out.println("��Ű�� �����ϼ̽��ϴ�.");
								loop_g:
									while(true) {
										System.out.println("1.���ݸ� 2.���� 3.���");
										cmd = sc.next();
										switch(cmd){
										case"1":
											System.out.println("���ݸ���Ű");
											break loop_g;
										case"2":
											System.out.println("������Ű");
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



