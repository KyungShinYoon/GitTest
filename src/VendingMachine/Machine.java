package VendingMachine;

import javax.swing.JOptionPane;

/**
 * 
 * @author Kyung Shin Yoon
 * @brief Product�� Change Ŭ������ ��ü�� ������ִ� Ŭ����
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
		cola = new Product("�ݶ�", 800, 10);
		cider = new Product("���̴�", 800, 10);
		water = new Product("��", 500, 10);
		sikhye = new Product("����", 600, 10);
		letsbe = new Product("������", 300, 10);
		change = new Change(20);
	}	
}

