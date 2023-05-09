package Ex01while문;
import java.util.Scanner;

public class 퀴즈2수업 {

	public static void main(String[] args) {
		

			Scanner sc = new Scanner(System.in);
			
			int input = 0 ;
		    int sum=0 ; //지금까지 입력한 모든 수의 합 저장(누적합), 연산에 이용시 초기화필수
			while(true) {
				System.out.print("숫자입력: ");
				input = sc.nextInt();
				// sum = sum + input ;
				if(input==-1) {
					break; //만나는 순간 반복문 나감!
				}
				sum += input ;
			}
		System.out.println("누적결과 : " + sum);	
		
	}

}
