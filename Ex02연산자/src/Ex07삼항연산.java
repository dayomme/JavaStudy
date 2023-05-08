import java.util.Scanner;

public class Ex07삼항연산 {

	public static void main(String[] args) {
        //들여쓰기 : ctrl + shift + f 
		Scanner sc = new Scanner(System.in);

		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();

		System.out.println("필요한 상자의 수 : " + (ball % 5 == 0 ? ball / 5 : ball / 5 + 1));
	
       //1box - 5 
	   //int box = (ball%5==0)? ball/5 : ball/5 +1 ;
	   //System.out.println(" 필요한 상자의 수 : " + box);
	
	
	}

}
