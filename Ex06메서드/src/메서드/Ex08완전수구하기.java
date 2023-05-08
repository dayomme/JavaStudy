package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor); // true
		// num2가 num1의 약수인지 아닌지?
		// num1이 num2의 배수인지 아닌지?
		// num2가 num1을 나누어 떨어지게 하는지!

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);

		int num = 20;
		int result = getSumOfDivisors(num);

		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(10);

		// 완전수인지 아닌지 판단해주는 isPerfectNumber()
		// 완전수란?
		// : 자기자신을 제외한 약수의 합이 자기자신과 같은 수
		// 6 : 1 2 3 6 ---> 6 (완전수)
		// 10 : 1 2 5 10 --> 8 (완전수 X)
		// 28 : 1 2 4 7 14 28 --> 28 (완전수)
		// true, false
		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2); // true / false

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	// 1. isDivisor() : 매개변수 int 2개, 리턴타입 boolean(true, false)
	public static boolean isDivisor(int num1, int num2) {

		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
		// is라는 키워드가 붙은 메서드는 결과값이(리턴타입이) boolean
	}

	// 2. getDivisor() : 출력하는 기능을 가지고 있다 (void), 매개변수 int 1개
	public static void getDivisor(int num) {

		// num1의 약수를 출력하는 기능
		// 4의 약수 : 1 2 4
		System.out.print(num + "의 약수 : ");

//		for (int i = 1; i <= num; i++) {  		  
//			if (num % i == 0) {
//				System.out.print(i + " ");
//			}

		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				System.out.print(i + " ");
			}

		}
		System.out.println();
	}

	// 3. getSumOfDivisors() : 매개변수 int 1개, 리턴타입 int
	public static int getSumOfDivisors(int num) {

		int sum = 0; // 약수들의 합이 들어갈 공간
		for (int i = 1; i <= num / 2; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum + num;
	}

	// 4. isPerfectNumber() : 매개변수 int 1개, 리턴타입 boolean
	public static boolean isPerfectNumber(int num3) {

		// num3가 완전수인지 아닌지?
		// 자기자신을 제외한 약수의 합 == 자기자신
		// 약수의 합 = 자기자신 *2

		if ((getSumOfDivisors(num3) - num3) == num3) {
			return true;
		} else {
			return false;

		}
	}

	// 5. getPerfectNumber() : 출력하는 기능을 가지고 있다 (void), 매개변수 int 2개
	public static void getPerfectNumber(int startValue, int endValue) {

		System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");

		for (int i = startValue; i <= endValue; i++) {
			if (isPerfectNumber(i)) {
				System.out.print(i+ " ");
			}

		}

	}

}
