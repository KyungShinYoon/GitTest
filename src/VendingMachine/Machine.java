package VendingMachine;

import javax.swing.JOptionPane;

/**
 * 
 * @author Kyung Shin Yoon
 * @brief Product와 Change 클래스의 객체를 만들어주는 클래스
 * @date April 11,2016
 */
public class Machine{
	Product cola;
	Product cider;
	Product water;
	Product sikhye;
	Product letsbe;
	Change change;

	Machine() {
		cola = new Product("콜라", 800, 10);
		cider = new Product("사이다", 800, 10);
		water = new Product("물", 500, 10);
		sikhye = new Product("식혜", 600, 10);
		letsbe = new Product("레츠비", 300, 10);
		change = new Change(20);
	}	
}

