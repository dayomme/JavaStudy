package Ex01while문;
import java.util.Scanner;

public class 퀴즈2while문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int input = 0;
		int sum = 0;
		
		 while(true) {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			if(input==-1) {
				break;
			}
			sum += input;
		}
		
		System.out.println("누적결과 : " + sum );   
		
	
	}
	
	 
}

       