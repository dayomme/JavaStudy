

public class Ex02산술연산 {

	public static void main(String[] args) {
		
		int num = 456;
		System.out.println("결과확인 : " + num/100 * 100);
		
		// 456 -> 400
        // 456 - 56 = 400
        System.out.println(num - (num%100));
        
        // 4*100
        System.out.println((num/100)*100);
		
		
        // 777 -> 77*10 +1
        int num2 = 777;
        System.out.println("결과확인 : " + (num2/10*10 + 1));
        
      
       
//        Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수 입력 : ");	
//		int num11 = sc.nextInt();
//		
//		System.out.print("두번째 정수 입력 : ");
//		int num22 = sc.nextInt();
//		
//		System.out.println("두수의 더하기 : " + (num11 + num22));
//		System.out.println("두수의 빼기 : " + (num11 + num22));
//		System.out.println("두수의 곱하기 : " + num11 * num22);
//		System.out.println("두수의 나누기(몫) : " + (num11 / num22));
		
        
	}

}
