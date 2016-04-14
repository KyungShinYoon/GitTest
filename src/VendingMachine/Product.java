package VendingMachine;

/**
 * 
 * @author Kyung Shin Yoon
 * @param name : ����� �̸�
 * @param price : ����� ����
 * @param numOfStock : ����� ���
 * @param numOfPurchased : ����� �Ǹŷ�
 * @brief ������� ������ ��� �ִ� Ŭ����
 * @brief ����� ��� �־��ֱ� ���� ��� ��Ȳ�� Ȯ���� �� �ʿ��� IsEmpty, IsFull �Լ��� �������
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
