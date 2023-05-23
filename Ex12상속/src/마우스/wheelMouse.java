package 마우스;

public class wheelMouse extends Mouse {

	// extends : 상속 키워드
	// 자식 ---> 부모 화살표 방향이 향하는 이유
	// : 데이터를 탐색해나가는 방향
	// public class 자식클래스 extends 부모클래스
	// Mouse로부터 상속받고있는 상태

//  <상속 받았으므로 삭제> 
//	// 1. 좌클릭
//	public void leftClick() {
//		System.out.println("좌클릭 따닥!");
//	}
//	// 2. 우클릭
//	public void rightClick() {
//		System.out.println("우클릭 따닥");
//	}
//	// 3. 드래그
//	public void drag() {
//		System.out.println("드래그");
//	}
	// -------
	// + 스크롤하기!
	public void scroll() {
		System.out.println("스크롤 하기 ~!");
	}

}
