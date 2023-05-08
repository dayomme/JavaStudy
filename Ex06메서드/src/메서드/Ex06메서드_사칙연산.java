package 메서드;

public class Ex06메서드_사칙연산 {

	public static void main(String[] args) {

		// main안에 코드는 손대지 않기!
		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);

	}
    // 매개변수 O , 리턴값 X 
	// 매개변수 2 : int  
	// add : 메서드명 
	// 출력하는 기능을 가지고 있음 : 리턴타입이 없다 -> void 
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void div(int num1, int num2) {
		System.out.println(num1 / num2);

	}

}
