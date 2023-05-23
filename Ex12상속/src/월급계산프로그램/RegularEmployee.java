package 월급계산프로그램;

public class RegularEmployee extends Employee {

	int bonus;
 
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

}
//   String empno ;	 // 사번
//   String name ;   // 이름
//   int pay ;       // 연봉 
//   int bonus;      // 보너스 

//   public RegularEmployee(String empno, String name, int pay, int bonus) {
//	   this.empno = empno ;
//	   this.name = name;
//	   this.pay = pay;
//	   this.bonus = bonus;
//   }

//   getMoneyPay (리턴타입 : int) 
//   public int getMoneyPay() {
//	   pay = (pay+bonus)/12 ;
//	   return pay ; 
//   }

//   print (리턴타입 : String)
//   사번 : 이름 : 연봉 
//   public String print() {
//	   return empno + " : " + name + " : " + pay + "\n" + getMoneyPay();
//   }
