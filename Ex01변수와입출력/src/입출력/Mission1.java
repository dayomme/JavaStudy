package 입출력;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Mission1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //맨 위에 적는다 
		
		System.out.print("이름 : ");		
		String name = sc.next();
		
		System.out.print("나이 : ");		
		String age = sc.next();	 //숫자형 nextInt();
		
		System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다");
		System.out.printf("이름은 %s이고 나이는 %s입니다" , name , age);
        // 나이를 숫자형 nextInt(); 로 했을경우 "이름은 %s이고 나이는 %d입니다 " 로 작성
		
		
		
	}

}
