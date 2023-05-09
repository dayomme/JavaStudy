package Ex01while문;
import java.util.Scanner;

public class 퀴즈2dowhile문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = 0;
		int sum = 0;
		
		do { System.out.print("숫자 입력 : ");
		     input = sc.nextInt();
		    if(input==-1) {
		    	break;
		    }
		}while(true);
        System.out.println();
	}

}
