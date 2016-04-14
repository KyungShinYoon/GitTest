package VendingMachine;

/** 
 * 
 * @author Kyung Shin Yoon
 * @param tenwon~oneThousandWon : 소비자가 넣을 돈, 돈의 재고를 추가해줄때 필요한 변수
 * @param R_tenWon~R_oneThousandWon : 돈을 반환할 때 필요한 잔돈을 나타내는 변수
 * @param total : 투입금액을 나타내는 변수
 * @param quantity : 자판기에 들어가있는 동전의 갯수
 * @brief 돈을 넣고, 돈의 재고관리를하고, 잔돈계산 까지의 돈에 관련된 set,get 함수를 만든 클래스
 * @brief refund() : 잔돈반환을 해주기위한 계산을 해주는 함수를 만듬(자판기안의 돈의 재고에서 반환되는 돈의 개수를 빼준다)
 * @date April 11,2016 
 */
public class Change {	
	private int tenWon; //소비자가 넣을 돈, 돈의 재고를 추가해줄때 필요한 변수들 
	private int fiftyWon;
	private int oneHundredWon;
	private int fiveHundredWon;
	private int oneThousandWon;	
	private int R_tenWon;
	private int R_fiftyWon; //반환할때 필요한 잔돈 변수들
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
