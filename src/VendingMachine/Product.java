package VendingMachine;

/**
 * 
 * @author Kyung Shin Yoon
 * @param name : 음료수 이름
 * @param price : 음료수 가격
 * @param numOfStock : 음료수 재고
 * @param numOfPurchased : 음료수 판매량
 * @brief 음료수의 정보를 담고 있는 클래스
 * @brief 음료수 재고를 넣어주기 위해 재고 상황을 확인할 때 필요한 IsEmpty, IsFull 함수를 만들어줌
 * @date April 11, 2016
 */
public class Product {
	
	private String name;
	private int price;
	private int numOfStock;
	private int numOfPurchased;


	Product(String name, int price, int numOfStock)
	{
		this.name = name;
		this.price = price;
		this.numOfStock = numOfStock;	
		this.numOfPurchased = 0;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPrice()
	{
		return this.price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public int getnumOfStock()
	{
		return this.numOfStock;
	}

	public void setnumOfStock(int numOfStock)
	{
		this.numOfStock = numOfStock;
	}

	public int getNumOfPurchased() {
		return numOfPurchased;
	}

	public void setNumOfPurchased(int numOfPurchased) {
		this.numOfPurchased = numOfPurchased;
	}
	
	public boolean IsEmpty()
	{
		if(this.getnumOfStock()==0)
			return true;
		else
			return false;
	}

	public boolean IsFull()
	{
		if(this.getnumOfStock()==10)
			return true;
		else
			return false;
	}



}
