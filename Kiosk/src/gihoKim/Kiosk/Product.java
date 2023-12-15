package gihoKim.Kiosk;

public class Product {

	String name;
	int price;
	String temp;

	Product(String name, int price, String temp){
		this.name=name;
		this.price=price;
		this.temp=temp;
	}
	
	Product(String name, int price){
		this.name=name;
		this.price=price;
	}

	Product(String name) {
		this.name = name;
	}
	
	Product() {
	}
	
	public void info() {
		System.out.println("상품명: " + name + " / 가격: " + price + "원");
	}

}
