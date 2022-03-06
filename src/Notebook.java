/*
 * 
 */
public class Notebook {
	int price; //가격
	int inventory; //수량
	int sales = 0; //매출액
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
			System.out.println("재고량 부족으로 판매불가");
		}//end of ifelse
	}//end of sold
	public void printItem() {
		System.out.println("========매출상태========");
		System.out.println("재고 : " + this.inventory);
		System.out.println("총매출액 : " + this.sales);
	}//end of printItem
}//end of class
