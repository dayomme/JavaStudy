import java.util.Scanner;

public class Ex02if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		//입력한 값(num) 3의배수 또는 5의배수이니? 
		if(num%3==0 || num%5==0) {
			System.out.println("3 또는 5의 배수입니다");
		}
	}

}

