import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("초입력: ");
//		int time = sc.nextInt();
//		
//		System.out.println( time/3600 + "시 " + (time/60)%60 +"분 "+ time%60 + "초");
	
		
	    // 수업시간  
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // 초 입력 
		//3723초 -> 1시(3600초) 2분(60초) 3초 
		
		int hour = input / 3600 ; 
		int min = input % 3600 / 60 ;
		//int second = input % 3600 % 60 ;   
		int second = input % 60 ;
		
		System.out.println(hour+"시 " + min+"분 "+ second+"초 ");
		
		

	}

}
