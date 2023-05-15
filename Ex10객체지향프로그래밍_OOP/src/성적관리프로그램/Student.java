package 성적관리프로그램;

public class Student {
//필드
	private String stuName;
	private String stuNum;
	private int javaScore;
	private int dbScore;
	private int webScore;

	// 생성자
	// 객체를 생성할때 1번만 호출되는 메소드
	// 반환타입을 작성하지 않는다 -> void도 X
	// 클래스이름과 생성자이름이 똑같다
	// 생성자는 하나 이상 선언되어야한다
	// (없는 경우 컴파일시에 자동으로 default생성자 추가)
	public Student(String stuName, // 지역변수
			String stuNum, int javaScore, 
			int dbScore, int webScore) {
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.javaScore = validScore(javaScore);
		this.dbScore = validScore(dbScore);
		this.webScore = validScore(webScore);
		// this : 클래스로부터 만들어진 객체 자기자신
	}
  
	private int validScore(int score) {
		if (score >= 10 || score <= 100) {
			return score;
		} else {
			return 0;
		}

	}
	 // getter 메소드 : 값을 가져올때 
	public String getStuName() {
		return stuName; 
	}
	
	public String getStuNum() {
		return stuNum;
	}

	public int getWebScore() {
		return webScore;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public int getDbScore() {
		return dbScore;
	}

	// setter 메소드 : 값을 수정할때 
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}

	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
	
	
	
}
