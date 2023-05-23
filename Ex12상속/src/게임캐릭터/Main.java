package 게임캐릭터;

public class Main {

	public static void main(String[] args) {
		
		//Charac c1 = new Charac();
		//추상클래스는 객체 생성이 불가능 합니다!
		
		//마법사
		Wizard harry = new Wizard();
		harry.atk();
		harry.run();
		harry.jump();
		System.out.println();
		
		//전사
		Warrior w1 = new Warrior();
		w1.atk();
		w1.run();
		w1.jump();
		
		
	}

}
