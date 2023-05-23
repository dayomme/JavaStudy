import java.util.Scanner;

public class Ex12switch문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();

		System.out.print("--메뉴--\n1. 콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >>");
                System.out.print("ㄱㅗㄹㄹㅏㅈㅜㅅㅔㅇㅛ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			money -= 1800;
			break;
		case 2:
			money -= 2000;
			break;
		case 3:
			money -= 1200;
			break;
		}

		if (money < 0) {
			System.out.println("돈이 부족해요 ㅠ-ㅜ");

		} else {
			System.out.printf("잔돈 : %d원\n천원 : %d\n오백원 : %d\n백원 : %d", money, (money / 1000), (money % 1000 / 500), (money % 500 / 100));

		}

	}

}
