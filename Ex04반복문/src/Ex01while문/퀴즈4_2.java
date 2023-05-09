package Ex01while문;
import java.util.Scanner;

public class 퀴즈4_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();

		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();

		int week = 1; // 1주차
		int lose; // 감량몸무게

		do {
			System.out.print((week++) + "주차 감량 몸무게 : ");
			lose = sc.nextInt();
			now -= lose;
			System.out.println("현재몸무게 :" + now);
		} while (true);


	}

}
