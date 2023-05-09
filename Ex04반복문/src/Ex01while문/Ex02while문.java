package Ex01while문;
import java.util.Scanner;

public class Ex02while문 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//while(1)
		int input=0;
		while(input<10) {
		    input = sc.nextInt();
		} 
		System.out.println("while문 탈출!");
	
		//do~while문
		do {
			input = sc.nextInt();
		}while(input<10);
		
	
		//while (2)
		
		
	    while(true) { 
	    	input = sc.nextInt();
	    	if(input>=10) {
	    		break;
	    	}
	    } 
	    	System.out.println("while(true)문 탈출!");
	}

}
