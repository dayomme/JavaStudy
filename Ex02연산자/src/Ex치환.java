
public class Ex치환 {

	public static void main(String[] args) {
		
	   String left = "red" ;
	   String right = "blue" ;
	   
	   String temp ; //임시 저장공간 선언 // 초기화를 안함! 
	   String temp1 = null; // 빈값을 넣는것 초기화를 함 ! -> reference type만 가능
	   String temp2 = ""; // 문자열은 없지만 문자열 값을 할당한 것 
	   // int temp2 = null ; 기본타입은 null로 초기화 x  
	   temp = right;  // left : red  / temp : blue / right : blue
	   right = left ; // left : red  / temp : blue / right : red 
	   left = temp ;  // left : blue / temp : bleu / right : red
	   
	   System.out.println(left);  //blue
	   System.out.println(right); //red
     

	}

}
