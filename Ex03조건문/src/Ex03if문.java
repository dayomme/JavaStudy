import java.util.Scanner;

public class Ex03if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int java = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int Python = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int Android = sc.nextInt();
		
		
		//int avg = (java + Python + Android)/3 ;
		double avg = (java + Python + Android)/3.0 ; //92.123 > 80
		// 컴퓨터는 실수(92.123)와 정수(80)를 비교하지 못하기 때문에 정수를 실수로 변경하여 비교함 
		
		if(avg>80) {//세 과목 점수의 평균이 80보다 높니? 
			        //80보다 낮거나 같으면 불합격 ! 출력 
			System.out.println("합격");
		} else { // 위 경우에 해당하는 경우가 아닐 경우
			System.out.println("불합격");
		}
        //else절을 빠져나왔다고 해서 프로그램이 끝나는것이 아니다 
		System.out.println("맨아랫줄");
	}

}
