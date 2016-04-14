package VendingMachine;

/** 
 * 
 * @author Kyung Shin Yoon
 * @param tenwon~oneThousandWon : �Һ��ڰ� ���� ��, ���� ��� �߰����ٶ� �ʿ��� ����
 * @param R_tenWon~R_oneThousandWon : ���� ��ȯ�� �� �ʿ��� �ܵ��� ��Ÿ���� ����
 * @param total : ���Աݾ��� ��Ÿ���� ����
 * @param quantity : ���Ǳ⿡ ���ִ� ������ ����
 * @brief ���� �ְ�, ���� ���������ϰ�, �ܵ���� ������ ���� ���õ� set,get �Լ��� ���� Ŭ����
 * @brief refund() : �ܵ���ȯ�� ���ֱ����� ����� ���ִ� �Լ��� ����(���Ǳ���� ���� ����� ��ȯ�Ǵ� ���� ������ ���ش�)
 * @date April 11,2016 
 */
public class Change {	
	private int tenWon; //�Һ��ڰ� ���� ��, ���� ��� �߰����ٶ� �ʿ��� ������ 
	private int fiftyWon;
	private int oneHundredWon;
	private int fiveHundredWon;
	private int oneThousandWon;	
	private int R_tenWon;
	private int R_fiftyWon; //��ȯ�Ҷ� �ʿ��� �ܵ� ������
	private int R_oneHundredWon;
	private int R_fiveHundredWon;
	private int R_oneThousandWon;		
	
	private int total;
    
	Change(int quantity)
	{
		tenWon = quantity;
		fiftyWon = quantity;
		oneHundredWon = quantity;
		fiveHundredWon = quantity;
		oneThousandWon = quantity;
		total = 0;
	}
	
	public  int getR_tenWon() {
		return R_tenWon;
	}

	public void setR_tenWon(int r_tenWon) {
		R_tenWon = r_tenWon;
	}

	public int getR_fiftyWon() {
		return R_fiftyWon;
	}

	public void setR_fiftyWon(int r_fiftyWon) {
		R_fiftyWon = r_fiftyWon;
	}

	public int getR_oneHundredWon() {
		return R_oneHundredWon;
	}

	public void setR_oneHundredWon(int r_oneHundredWon) {
		R_oneHundredWon = r_oneHundredWon;
	}

	public int getR_fiveHundredWon() {
		return R_fiveHundredWon;
	}

	public void setR_fiveHundredWon(int r_fiveHundredWon) {
		R_fiveHundredWon = r_fiveHundredWon;
	}

	public int getR_oneThousandWon() {
		return R_oneThousandWon;
	}

	public void setR_oneThousandWon(int r_oneThousandWon) {
		R_oneThousandWon = r_oneThousandWon;
	}
	

	public int getTenWon() {
		return tenWon;
	}

	public void setTenWon(int tenWon) {
		this.tenWon = tenWon;
	}

	public int getFiftyWon() {
		return fiftyWon;
	}

	public void setFiftyWon(int fiftyWon) {
		this.fiftyWon = fiftyWon;
	}

	public int getOneHundredWon() {
		return oneHundredWon;
	}

	public void setOneHundredWon(int oneHundredWon) {
		this.oneHundredWon = oneHundredWon;
	}

	public int getFiveHundredWon() {
		return fiveHundredWon;
	}

	public void setFiveHundredWon(int fiveHundredWon) {
		this.fiveHundredWon = fiveHundredWon;
	}

	public int getOneThousandWon() {
		return oneThousandWon;
	}

	public void setOneThousandWon(int oneThousandyWon) {
		this.oneThousandWon = oneThousandyWon;
	}

	public int gettotal()
	{
		return this.total;
	}
	
	public void settotal(int total)
	{
		this.total = total;
	}
	
	public void refund()
	{
		this.R_oneThousandWon = this.total/1000;
		this.total = this.total%1000;
		this.R_fiveHundredWon = this.total/500;
		this.total = this.total%500;
		this.R_oneHundredWon = this.total/100;
		this.total = this.total%100;
		this.R_fiftyWon = this.total/50;
		this.total = this.total%50;
		this.R_tenWon = this.total/10;
		this.total = 0;
		this.oneThousandWon -= this.R_oneThousandWon;
		this.fiveHundredWon -= this.R_fiveHundredWon;
		this.oneHundredWon -= this.R_oneHundredWon;
		this.fiftyWon -= this.R_fiftyWon;
		this.tenWon -= this.R_tenWon;
	}
}
