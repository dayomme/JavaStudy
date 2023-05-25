import java.util.Stack;

public class Ex01스택 {

	public static void main(String[] args) {

		// 1. 스택생성
		Stack<String> st = new Stack<String>();

		// 2. 요소 삽입 (push)
		st.push("Hello");
		st.push("Hi");
		String a = st.push("Java"); // 반환한값 사용시 변수에 넣기!

		// 3. 가장 마지막에 들어간 요소 확인 (top에서 제일 가까운 요소)
		System.out.println(st.peek()); // 마지막 문자만 알고싶기때문에 매개변수 사용하지않음!

		// 4. 특정 요소의 위치 확인
		System.out.println(st.search("Hello")); // 3
		System.out.println(st.search("Hi")); // 2
		System.out.println(st.search("Java")); // 1

		// 5. 요소 삭제 pop
		String e = st.pop(); // 마지막요소만 꺼내기때문에 매개변수 사용하지않음
		System.out.println(e); // 삭제가 된 요소를 반환

		// 6. Stack이 비어있는지 확인
		// 비어있으면 -> true, 요소가 하나라도 있으면 -> false
		System.out.println(st.empty());
		
		for( String i : st) {
			System.out.println(i);
		}
		

	}

}
