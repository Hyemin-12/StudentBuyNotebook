
public class Buy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("�缭��", 10000);
		Student s2 = new Student("������", 50000);
		Notebook n1 = new Notebook(1000, 100);
		Notebook n2 = new Notebook(500, 50);
		//���� ���� �� ����
		s2.printMoney();
		n2.printItem();
		//���� ���� �� ����
		s2.buyNotebook(n2, 60);
		s2.printMoney();
		n2.printItem();
	}//end of main

}//end of class
