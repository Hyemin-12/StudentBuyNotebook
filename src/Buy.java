
public class Buy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("양서영", 10000);
		Student s2 = new Student("신유림", 50000);
		Notebook n1 = new Notebook(1000, 100);
		Notebook n2 = new Notebook(500, 50);
		//물건 구입 전 상태
		s2.printMoney();
		n2.printItem();
		//물건 구입 후 상태
		s2.buyNotebook(n2, 60);
		s2.printMoney();
		n2.printItem();
	}//end of main

}//end of class
