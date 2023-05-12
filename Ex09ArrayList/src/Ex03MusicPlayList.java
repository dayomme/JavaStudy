import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicPlayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();

		int num, num1, num2; // 번호
		int MusicAdd = 0; // 추가
		int index = 0; // 재생목록번호

		while (true) {

			System.out.print("[1]노래 추가 [2]노래 삭제 [3] 종료 >> ");
			num = sc.nextInt();

			if (num == 1 || num == 2) {
				System.out.println("========== 현재 재생 목록 ==========");

				if (index == 0) {
					System.out.println("재생 목록이 없습니다. ");
				}

				for (index = 0; index < al.size(); index++) {
					System.out.println(index + 1 + "." + al.get(index));
				}

			}

			if (num == 1) {
				System.out.println("================================");

				System.out.print("[1]마지막위치에 추가 [2]원하는 위치 추가 >> ");
				num1 = sc.nextInt();

				if (num1 == 1) {
					System.out.print("추가 할 노래 입력 : ");
					String music = sc.next();
					al.add(music);
					System.out.println("추가가 완료되었습니다.");
					index++;
					System.out.println();

				} else {
					System.out.print("추가할 노래 입력 : ");
					String music = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					index = sc.nextInt();
					al.add(index - 1, music);
					System.out.println("추가가 완료되었습니다. ");
					index++;
				}

			} else if (num == 2) {

				System.out.println("================================");

				if (index == 0) {
					continue;
				}

				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				num2 = sc.nextInt();

				if (num2 == 1) {
					System.out.print("삭제할 노래 선택 >> ");
					index = sc.nextInt();
					al.remove(index - 1);
					System.out.println("노래가 삭제되었습니다.");
				} else {
					al.clear();
					System.out.println("전체list가 삭제되었습니다.");
					index = 0;

				}

			} else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

		}

	}

}
