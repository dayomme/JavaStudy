import java.util.Scanner;

public class Ex05ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("소프트웨어 설계 : ");
		int S1 = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int S2 = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int DB = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int P = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int I = sc.nextInt();
		
		//합격 조건
		//1. 각 과목의 개수 가 모두 8 이상
		//2. 과목의 총 합이 60 이상 -> 두 조건 모두 해당 
      		
		int score = S1 + S2 + DB + P + I ;
		
		if ( S1>=8 && S2>=8 && DB>=8 && P>=8 && I>=8 && score>=60) {
			System.out.println("합격");
		} else { 
			System.out.println("불합격");
		}
	}

}
