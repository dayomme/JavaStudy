package TV클래스설계;

public class Tvsimulator {

	public static void main(String[] args) {
		// TV객체(object) 생성 
		
		// 데이터타입 변수명 = new 데이터타입();
        // 데이터타입 -> 기본타입 (8가지) / 레퍼런스타입(사용자정의)
		
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.브랜드이름 = "삼성" ;
		tv2.브랜드이름 = "LG" ;
		
		tv1.채널변경하기(30);
        tv1.채널내리기();  // 채널 29로 변경 	
        
        System.out.println(tv1.채널);
	}

}
