package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {

		RegularEmployee r1 = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		r1.print();

		TempEmployee t1 = new TempEmployee("SMHRD002", "박문수", 3000);
		t1.print();

		PartTimeEmployee p1 = new PartTimeEmployee("SMHRD001", "홍길동", 10, 10);
        p1.print();
        
        
	}

}
