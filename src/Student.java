/* �л� �𵨸� �� �۷��� ����
  ������� : �̸�, ���� �ִ� ��
  �޼��� : 
  1. ������ �޼���(�̸�, ��)
  2. ��å�� ����(��å, ����)�ϴ�
  3. �л��� �������¸� ����ϴ�. */
public class Student {
	String name;
	int money;
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}//end of Student
	public void buyNotebook(Notebook item, int amount) {//�Ű������� Ŭ������ ��ü�� �ѱ� �� �ִ�.(�� ����)
		if(money >= item.price * amount) {
			money -= item.price * amount;
			item.sold(amount); //��å�� ����� �ٰ� ������� �þ�� ��å�� sold �޼��带 ȣ���Ѵ�.
		}else {
			System.out.println("���ԺҰ�");
		}//end of ifelse
	}//end of buyNotebook
	public void printMoney() {
		System.out.println("=======�л��� �ܰ�=======");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� �ܾ� : " + this.money);
	}//end of printMoney
}//end of class
