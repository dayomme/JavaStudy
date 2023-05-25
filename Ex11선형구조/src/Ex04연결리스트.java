import java.util.LinkedList;

public class Ex04연결리스트 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		// 데이터 추가 add
		list.addFirst(1); // 가장 앞에 데이터 추가 0
		list.addLast(2); // 가장 뒤에 데이터 추가 1
		list.add(1, 5); // 1번인덱스의 값에 5를 넣겠다

		// 모든값 출력 : 1 5 2
		for (Integer i : list) {
			System.out.println(i);
		}

		// 원하는 인덱스 값 출력
		System.out.println(list.get(1));

		// 데이터 삭제 remove
		list.removeFirst(); // 가장 앞에 데이터 삭제
		list.removeLast(); // 가장 뒤에 데이터 삭제
		list.remove(0); // index 0번 데이터 삭제
		list.remove(); // 비워두게되면 index 0번 데이터 삭제

		// 데이터 모든값 제거 clear
		list.clear();

		// 요소개수 확인 size
		System.out.println(list.size()); // 요소개수

	}

}
