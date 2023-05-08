package 메서드;

public class Ex02매개변수O리턴값O {

	public static void main(String[] args) {

		// sum(5,3)
		// 결과값 : 8
		sum(5, 3);
		System.out.println(sum(5, 3));

	}

	// main밖
	public static int sum(int num1, int num2) {
		return num1 + num2;
		
	}

}
