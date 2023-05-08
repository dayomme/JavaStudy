import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("JAVA 점수 입력 : ");	
		int java = sc.nextInt();
		
		System.out.print("WEB 점수입력 : ");
		int web = sc.nextInt();

		System.out.print("ANDROID 점수입력 : ");
		int and = sc.nextInt();
		
		//합계 
		int score = java + web + and ; 
		System.out.println("합계 : " + score);
		System.out.println("합계 : " + (java + web + and));
		
		//평균
		System.out.println("평균 : " + (java + web + and)/3.0);
		//소수점 두번째 자리까지 출력하시오.
		System.out.printf("평균 : %.2f", (double)(java + web + and)/3);
		
	
		
		
	
	}
}
