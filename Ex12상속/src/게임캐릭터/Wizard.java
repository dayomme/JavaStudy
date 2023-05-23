package 게임캐릭터;

public class Wizard extends Charac {

	// 전진, 점프, 공격 기능을 상속받게 만들자
	// extends charac 작성시 빨간줄이 뜨는이유
    //  -> 추상클래스가 물려주는 추상메서드는 반드시 구현해야하므로(강제성)
	//     아래와 같이 오버라이딩이 필수! 
	
	@Override
	public void run() {
		System.out.println("빗자루타고 슝 ~");
	}

	@Override
	public void jump() {
		System.out.println("포털로 이동!");
	}

	@Override
	public void atk() {
		System.out.println("아브라카다브라 ㅇ0ㅇ");
	}

}
