package 메서드;

public class Ex04매개변수X리턴값O {

	public static void main(String[] args) {

		getName();
		System.out.println(getName());
		// "김다영"
	}

	// getName() 만들기 : 매개변수X 리턴타입O
	// " 김다영 " ---> String
	// () ---> ()
	public static String getName() {
		// 리턴타입에 자료형이 있으면 return이라는 키워드가 따라온다!
		return "김다영";

	}

}
