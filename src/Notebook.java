/*
 * 
 */
public class Notebook {
	int price; //����
	int inventory; //����
	int sales = 0; //�����
	public Notebook(int price, int inventory) {
		this.price = price;
		this.inventory = inventory;
	}//end of Notebook
	public void sold(int amount) {
		// TODO Auto-generated method stub
		if(this.inventory >= amount) {
			this.inventory -= amount;
			this.sales += amount * this.price;
		}else {
			System.out.println("��� �������� �ǸźҰ�");
		}//end of ifelse
	}//end of sold
	public void printItem() {
		System.out.println("========�������========");
		System.out.println("��� : " + this.inventory);
		System.out.println("�Ѹ���� : " + this.sales);
	}//end of printItem
}//end of class
