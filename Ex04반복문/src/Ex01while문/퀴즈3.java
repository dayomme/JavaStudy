package Ex01while문;
import java.util.Scanner;

public class 퀴즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0 ;
	    int sum=0 ; //지금까지 입력한 모든 수의 합 저장(누적합), 연산에 이용시 초기화필수
		int odd=0; //홀수 개수
		int even=0; //짝수개수
		
	    while(true) {
			System.out.print("숫자입력: ");
			input = sc.nextInt();
			// sum = sum + input ;
			if(input==-1) {
				break; //만나는 순간 반복문 나감!
			}
			
			if(input%2==1) { //홀수
				++odd;
			}else {//나머지가 0일때 -> 짝수
				++even;
			}
			sum += input ;
		}
	System.out.println("누적결과 : " + sum);	
	System.out.println("홀수개수 : " + odd);	
	System.out.println("짝수개수 : " + even);	
		
		
		
		
		

	}

}
