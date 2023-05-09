package Ex01while문;
import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame2 {

	public static void main(String[] args) {
		// 랜덤기능 사용하기!!
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("===Plus Game===");

		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;
		int fail = 0; // 실패한횟수

		do {
			System.out.print(num1 + "+" + num2 + "=");
			int answer = sc.nextInt();

			if ((num1 + num2) == answer) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
				fail++;
			}
			
			if (fail == 3) {
				System.out.println("Game over");
				break;
			}

			System.out.print("계속 하시겠습니까? >> ");
			String input = sc.next();

			if (input.equals("Y")) {
				
			} else if (input.equals("N")) {
				System.out.println("종료합니다.");
				break;
			}
		} while (true);
	}
}
