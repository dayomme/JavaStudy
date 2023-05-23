package 마우스;

public class Main {

	public static void main(String[] args) {

		Mouse m1 = new Mouse();
		// . : 참조
		m1.rightClick();
		m1.leftClick();
		m1.drag();

		wheelMouse m2 = new wheelMouse();
		m2.scroll();

		HealthMouse m3 = new HealthMouse();
		m3.Health();
		m3.rightClick();
		
	

	}

}
