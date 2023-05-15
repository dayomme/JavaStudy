package 물품관리프로그램;

public class Product {

	// 필드
	private String name; // 물건이름
	private int unitPrice; // 단가
	private int amount; // 수량

	// 메서드
	// 생성자 -> 기본생성자만 있을경우 생략가능
	// 1) 생성자도 메서드다
	// 2) 생성자 이름이 클래스명과 같다 (소/대문자 구분)
	// 3) 생성자는 리턴타입이 없다 (void X)
	// 4. 기본생성자는 생략되어있다
	// ---> 새로운 생성자를 만들게 되면 기본생성자는 기능을 읽는다
	// ---> 기본생성자도 사용하고 싶으면 코드로 작성해줘야한다(생략불가)
	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}

	// getter : private로 감싸진 필드를 열어서 확인할 수 있도록 해주는 메서드
	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getAmount() {
		return amount;
	}

}
