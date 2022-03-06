/* 학생 모델링 및 글래스 구현
  정적요소 : 이름, 갖고 있는 돈
  메서드 : 
  1. 생성자 메서드(이름, 돈)
  2. 공책을 구입(공책, 개수)하다
  3. 학생의 재정상태를 출력하다. */
public class Student {
	String name;
	int money;
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}//end of Student
	public void buyNotebook(Notebook item, int amount) {//매개변수로 클래스와 객체를 넘길 수 있다.(더 좋음)
		if(money >= item.price * amount) {
			money -= item.price * amount;
			item.sold(amount); //공책의 재고량은 줄고 매출액은 늘어나는 공책의 sold 메서드를 호출한다.
		}else {
			System.out.println("구입불가");
		}//end of ifelse
	}//end of buyNotebook
	public void printMoney() {
		System.out.println("=======학생의 잔고=======");
		System.out.println("이름 : " + this.name);
		System.out.println("현재 잔액 : " + this.money);
	}//end of printMoney
}//end of class
