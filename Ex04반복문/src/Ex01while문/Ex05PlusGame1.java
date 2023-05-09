package Ex01while문;
import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame1 {

	public static void main(String[] args) {
		
//		//랜덤기능 사용하기!! 
//		Random rd = new Random();
//		
//		int num = rd.nextInt(10);   // 0~9 랜덤한 숫자 
//		System.out.println(rd.nextInt(10));
//		System.out.println(num);
//		
//		// 1부터 시작 
//		int num1 = rd.nextInt(10)+1 ;  
		
		
		//랜덤기능 사용하기!!
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//랜덤기능 사용해서 랜덤한 숫자 2개 가져오기
		// : 나중에 답을 구할때 사용할예정이니 저장하기(변수)
		int num1 = rd.nextInt(50)+1;
		int num2 = rd.nextInt(50)+1;
		
		System.out.println("===Plus Game===");
		//가져온 랜덤한 숫자 2개 출력하기
		System.out.print(num1 + "+" + num2 + "=" );
		// 답 입력 받기
		int answer = sc.nextInt();
		// 사용자가 입력한 정답이랑 실제 답이 일치하는지 판단하기!
		if((num1+num2)==answer) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		} 
        
		

	}

}
