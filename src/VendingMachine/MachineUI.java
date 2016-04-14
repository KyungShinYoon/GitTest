package VendingMachine;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
/**
 * 
 * @author Kyung Shin Yoon
 * @brief MachineUI, main class 
 * @todo windowbuilder�� ���� VendingMachine UI�� ����� ��ư�� Ŭ���Կ����� �����ؾ� �ϴ� �Լ����� ��� ����
 * @date April 11,2016
 */
public class MachineUI extends JFrame {
	
	Machine machine = new Machine(); //Machine ��ü ����
	Change change = new Change(20); //Change ��ü ����
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MachineUI frame = new MachineUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}
	/**
	 * Create the frame.
	 * @brief VendingMachine UI�� ������ ������ְ� �۲õ� �ٲ��� images������ ����� ����� ������ ����
	 * setBounds, setIcon ���� �̿��� ����� �׸��� �ٿ��ְ� ��ġ�� ��������
	 */
	public MachineUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 592, 41);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Yoon's Luxury VendingMachine");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("HYũ����ŻM", Font.PLAIN, 17));
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("images/cola.png"));
		lblNewLabel.setBounds(14, 45, 85, 136);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("images/cider.png"));
		lblNewLabel_1.setBounds(135, 45, 85, 136);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("images/water.jpg"));
		lblNewLabel_2.setBounds(260, 45, 60, 136);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("images/sikhye.png"));
		lblNewLabel_3.setBounds(356, 45, 85, 136);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("images/letsbe.png"));
		lblNewLabel_4.setBounds(479, 45, 81, 136);
		contentPane.add(lblNewLabel_4);	
		
		/**
		 * @brief String.valuOf�Լ��� ����Ͽ� JLabel�� ���ڷ� �� ���� �ֱ�(�󺧿� �������� int���� string���� �ٲپ��ش�)
		 * @param String.valueOf(change.gettotal()) : ������ �ݾ��� ��
		 * @param String.valueOf(change.getOneThousandWon()) : 1000���� ��� ~ 10��������
		 * @brief ���� id.setText�Լ��� ����Ͽ� purchase�Լ� �����Ŀ� ���� ���� ����� ���Աݾ��� ��ȭ�� �󺧿� ��Ÿ���ش�
		 */
		JLabel lblNewLabel_10 = new JLabel(String.valueOf(change.gettotal())); //���Աݾ�
		lblNewLabel_10.setBounds(344, 506, 62, 18);
		contentPane.add(lblNewLabel_10);		
		
		JLabel lblNewLabel_11 = new JLabel(String.valueOf(change.getOneThousandWon()));
		lblNewLabel_11.setBounds(59, 406, 44, 14);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("1000���ֱ�"); //1000�� �ֱ�
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_11.setText(String.valueOf(change.getOneThousandWon()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));
			}
		});
		btnNewButton.setBounds(14, 368, 117, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_12 = new JLabel(String.valueOf(change.getFiveHundredWon()));
		lblNewLabel_12.setBounds(183, 402, 37, 18);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton_1 = new JButton("500���ֱ�"); //500�� �ֱ�
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_12.setText(String.valueOf(change.getFiveHundredWon()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));

			}
		});
		btnNewButton_1.setBounds(135, 368, 111, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_13 = new JLabel(String.valueOf(change.getOneHundredWon()));
		lblNewLabel_13.setBounds(302, 402, 38, 18);
		contentPane.add(lblNewLabel_13);
		
		JButton btnNewButton_2 = new JButton("100���ֱ�"); //100���ֱ�
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_13.setText(String.valueOf(change.getOneHundredWon()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));

			}
		});
		btnNewButton_2.setBounds(253, 368, 111, 27);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_14 = new JLabel(String.valueOf(change.getFiftyWon()));
		lblNewLabel_14.setBounds(411, 402, 48, 18);
		contentPane.add(lblNewLabel_14);
		
		JButton button_1 = new JButton("50���ֱ�"); //50���ֱ�
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_14.setText(String.valueOf(change.getFiftyWon()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));

			}
		});
		button_1.setBounds(370, 368, 105, 27);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_15 = new JLabel(String.valueOf(change.getTenWon()));
		lblNewLabel_15.setBounds(523, 402, 37, 18);
		contentPane.add(lblNewLabel_15);		

		JButton btnNewButton_3 = new JButton("10���ֱ�"); //10���ֱ�
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_15.setText(String.valueOf(change.getTenWon()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));

			}
		});
		btnNewButton_3.setBounds(479, 368, 105, 27);
		contentPane.add(btnNewButton_3);		
		
		JLabel label_5 = new JLabel("���Աݾ� :");
		label_5.setBounds(255, 506, 85, 18);
		contentPane.add(label_5);
		
		/**
		 * ������� Ŭ�� ���� �� ��������� ���� �Ǹŷ� ��ȭ�� ���Աݾ��� ��ȭ�� setText�� ��Ÿ�� 
		 */
		JLabel lblNewLabel_5 = new JLabel(String.valueOf(machine.cola.getnumOfStock())); //�ݶ� ���
		lblNewLabel_5.setBounds(55, 232, 36, 18);
		contentPane.add(lblNewLabel_5);		
		
		JLabel lblNewLabel_16 = new JLabel(String.valueOf(machine.cola.getNumOfPurchased())); //�ݶ� �Ǹŷ�
		lblNewLabel_16.setBounds(60, 253, 37, 18);
		contentPane.add(lblNewLabel_16);
		
		JButton btnNewButton_4 = new JButton("�ݶ�"); //�ݶ�
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_5.setText(String.valueOf(machine.cola.getnumOfStock()));
				lblNewLabel_16.setText(String.valueOf(machine.cola.getNumOfPurchased()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));
			}
		});
		btnNewButton_4.setBounds(14, 193, 85, 27);
		contentPane.add(btnNewButton_4);
				
		JLabel lblNewLabel_6 = new JLabel(String.valueOf(machine.cider.getnumOfStock())); //���̴� ���
		lblNewLabel_6.setBounds(169, 232, 37, 18);
		contentPane.add(lblNewLabel_6);		
		
		JLabel label_1 = new JLabel(String.valueOf(machine.cider.getNumOfPurchased())); //���̴� �Ǹŷ�
		label_1.setBounds(175, 252, 37, 18);
		contentPane.add(label_1);

		JButton btnNewButton_5 = new JButton("���̴�"); //���̴�
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_6.setText(String.valueOf(machine.cider.getnumOfStock()));
				label_1.setText(String.valueOf(machine.cider.getNumOfPurchased()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));
			}
		});
		btnNewButton_5.setBounds(135, 193, 85, 27);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_7 = new JLabel(String.valueOf(machine.water.getnumOfStock())); //�� ���
		lblNewLabel_7.setBounds(277, 231, 26, 18);
		contentPane.add(lblNewLabel_7);		
				
		JLabel label_2 = new JLabel(String.valueOf(machine.water.getNumOfPurchased())); //�� �Ǹŷ�
		label_2.setBounds(282, 252, 36, 18);
		contentPane.add(label_2);
		
		JButton btnNewButton_6 = new JButton("��"); //��
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_7.setText(String.valueOf(machine.water.getnumOfStock()));
				label_2.setText(String.valueOf(machine.water.getNumOfPurchased()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));
			}
		});
		btnNewButton_6.setBounds(256, 193, 60, 27);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_8 = new JLabel(String.valueOf(machine.sikhye.getnumOfStock())); //���� ���
		lblNewLabel_8.setBounds(390, 231, 20, 18);
		contentPane.add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel(String.valueOf(machine.sikhye.getNumOfPurchased())); //���� �Ǹŷ�
		label_3.setBounds(395, 249, 32, 18);
		contentPane.add(label_3);		
		
		JButton btnNewButton_7 = new JButton("����"); //����
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_8.setText(String.valueOf(machine.sikhye.getnumOfStock()));
				label_3.setText(String.valueOf(machine.sikhye.getNumOfPurchased()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));
			}
		});
		btnNewButton_7.setBounds(356, 193, 85, 27);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_9 = new JLabel(String.valueOf(machine.letsbe.getnumOfStock())); //������ ���
		lblNewLabel_9.setBounds(507, 231, 26, 18);
		contentPane.add(lblNewLabel_9);		
		
		JLabel label_4 = new JLabel(String.valueOf(machine.letsbe.getNumOfPurchased())); //������ �Ǹŷ�
		label_4.setBounds(512, 253, 26, 18);
		contentPane.add(label_4);				

		JButton btnNewButton_8 = new JButton("������");//������
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg4) {
				purchase(arg4.getActionCommand());
				lblNewLabel_9.setText(String.valueOf(machine.letsbe.getnumOfStock()));
				label_4.setText(String.valueOf(machine.letsbe.getNumOfPurchased()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));
			}
		});
		btnNewButton_8.setBounds(469, 193, 105, 27);
		contentPane.add(btnNewButton_8);
	
		/**
		 * ����� ��� ä���
		 */
		JButton btnNewButton_9 = new JButton("�ݶ�ä���");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_5.setText(String.valueOf(machine.cola.getnumOfStock()));
			}
		});
		btnNewButton_9.setBounds(6, 311, 113, 27);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("���̴�ä���");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_6.setText(String.valueOf(machine.cider.getnumOfStock()));
			}
		});
		btnNewButton_10.setBounds(125, 311, 117, 27);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("��ä���");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_7.setText(String.valueOf(machine.water.getnumOfStock()));
			}
		});
		btnNewButton_11.setBounds(246, 311, 111, 27);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("����ä���");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_8.setText(String.valueOf(machine.sikhye.getnumOfStock()));
			}
		});
		btnNewButton_12.setBounds(360, 311, 105, 27);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("������ä���");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_9.setText(String.valueOf(machine.letsbe.getnumOfStock()));
			}
		});
		btnNewButton_13.setBounds(469, 311, 117, 27);
		contentPane.add(btnNewButton_13);
		
		JButton button = new JButton("�ܵ���ȯ"); //�ܵ���ȯ
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_10.setText("0");
				lblNewLabel_11.setText(String.valueOf(change.getOneThousandWon()));
				lblNewLabel_12.setText(String.valueOf(change.getFiveHundredWon()));
				lblNewLabel_13.setText(String.valueOf(change.getOneHundredWon()));
				lblNewLabel_14.setText(String.valueOf(change.getFiftyWon()));
				lblNewLabel_15.setText(String.valueOf(change.getTenWon()));
			}
		});
		button.setBounds(443, 502, 117, 27);
		contentPane.add(button);
		
		/**
		 * ���� ��� ä���
		 */
		JButton button_2 = new JButton("1000��ä��");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_11.setText(String.valueOf(change.getOneThousandWon()));
			}
		});
		button_2.setBounds(14, 430, 117, 27);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("500��ä��");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_12.setText(String.valueOf(change.getFiveHundredWon()));	
			}
		});
		button_3.setBounds(135, 430, 111, 27);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("100��ä��");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_13.setText(String.valueOf(change.getOneHundredWon()));
			}
		});
		button_4.setBounds(253, 430, 111, 27);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("50��ä��");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_14.setText(String.valueOf(change.getFiftyWon()));
			}
		});
		button_5.setBounds(370, 430, 105, 27);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("10��ä��");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_15.setText(String.valueOf(change.getTenWon()));
			}
		});
		button_6.setBounds(479, 430, 105, 27);
		contentPane.add(button_6);
		
		JLabel lblNewLabel_17 = new JLabel("��� :");
		lblNewLabel_17.setBounds(0, 232, 52, 18);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("�Ǹŷ� :");
		lblNewLabel_18.setBounds(-1, 255, 52, 18);
		contentPane.add(lblNewLabel_18);
	}
	
	/**
	 * 
	 * @brief ���Ǳ��� ��� ������ ��� �ٽ� �Լ�
	 * @param cmd : � ��ư���� �ν��ϱ� ����  string ����
	 * @exception ������� ��� 0�̵Ǹ� error�� ��Ÿ����, ���Աݾ��� ������ݾ׺��� ������ error�� ��Ÿ����
	 * @exception ����� ��� �����ִٸ� ��� �߰��Ϸ��� �� error�� ��Ÿ����
	 * @brief ������� �Ǹŷ� ��ȭ, ������, �ݾ� ��ȭ, �� ������ �� �߿� ������ ��� �� �Լ����� ���� 
	 */
	public void purchase(String cmd) { //��� ������ ��� �ٽ� �Լ�
		if(cmd.equals("�ݶ�")){
			if(machine.cola.IsEmpty())
			{
				error("��� �����ϴ�. ä���ּ���");
				return;
			}
			else if(change.gettotal()<machine.cola.getPrice())
			{
				error("�ݾ��� �����մϴ�. ���� �־��ּ���");
				return;
			}
			else 
			{
				machine.cola.setNumOfPurchased(machine.cola.getNumOfPurchased()+1);
				machine.cola.setnumOfStock(machine.cola.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.cola.getPrice());	
			}
		}
		else if(cmd.equals("���̴�"))
		{
			if(machine.cider.IsEmpty())
			{
				error("��� �����ϴ�. ä���ּ���");
				return;
			}
			else if(change.gettotal()<machine.cider.getPrice())
			{
				error("�ݾ��� �����մϴ�. ���� �־��ּ���");
				return;
			}
			else 
			{
				machine.cider.setNumOfPurchased(machine.cider.getNumOfPurchased()+1);
				machine.cider.setnumOfStock(machine.cider.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.cider.getPrice());
			}
		}
		else if(cmd.equals("��"))
		{
			if(machine.water.IsEmpty())
			{
				error("��� �����ϴ�. ä���ּ���");
				return;
			}
			else if(change.gettotal()<machine.water.getPrice())
			{
				error("�ݾ��� �����մϴ�. ���� �־��ּ���");
				return;
			}
			else 
			{
				machine.water.setNumOfPurchased(machine.water.getNumOfPurchased()+1);
				machine.water.setnumOfStock(machine.water.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.water.getPrice());
			}
		}
		else if(cmd.equals("����"))
		{
			if(machine.sikhye.IsEmpty())
			{
				error("��� �����ϴ�. ä���ּ���");
				return;
			}
			else if(change.gettotal()<machine.sikhye.getPrice())
			{
				error("�ݾ��� �����մϴ�. ���� �־��ּ���");
				return;
			}
			else 
			{
				machine.sikhye.setNumOfPurchased(machine.sikhye.getNumOfPurchased()+1);
				machine.sikhye.setnumOfStock(machine.sikhye.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.sikhye.getPrice());
			}
		}
		else if(cmd.equals("������"))
		{
			if(machine.letsbe.IsEmpty())
			{
				error("��� �����ϴ�. ä���ּ���");
				return;
			}
			else if(change.gettotal()<machine.letsbe.getPrice())
			{
				error("�ݾ��� �����մϴ�. ���� �־��ּ���");
				return;
			}
			else 
			{
				machine.letsbe.setNumOfPurchased(machine.letsbe.getNumOfPurchased()+1);
				machine.letsbe.setnumOfStock(machine.letsbe.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.letsbe.getPrice());
			}
		}
		else if(cmd.equals("�ݶ�ä���"))
		{
			if(machine.cola.IsFull())
			{
				error("�ݶ� ���� ������ �����ϴ�.");
				return;
			}
			else
			{
				machine.cola.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("���̴�ä���"))
		{
			if(machine.cider.IsFull())
			{
				error("���̴ٸ� ���� ������ �����ϴ�.");
				return;
			}
			else
			{
				machine.cider.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("��ä���"))
		{
			if(machine.water.IsFull())
			{
				error("���� ���� ������ �����ϴ�.");
				return;
			}
			else
			{
				machine.water.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("����ä���"))
		{
			if(machine.sikhye.IsFull())
			{
				error("������ ���� ������ �����ϴ�.");
				return;
			}
			else
			{
				machine.sikhye.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("������ä���"))
		{
			if(machine.letsbe.IsFull())
			{
				error("������ ���� ������ �����ϴ�.");
				return;
			}
			else
			{
				machine.letsbe.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("1000���ֱ�"))
		{
			change.setOneThousandWon(change.getOneThousandWon()+1);
			change.settotal(change.gettotal()+1000);
			return;
		}
		else if(cmd.equals("500���ֱ�"))
		{
			change.setFiveHundredWon(change.getFiveHundredWon()+1);
			change.settotal(change.gettotal()+500);
			return;
		}
		else if(cmd.equals("100���ֱ�"))
		{
			change.setOneHundredWon(change.getOneHundredWon()+1);
			change.settotal(change.gettotal()+100);
			return;
		}
		else if(cmd.equals("50���ֱ�"))
		{
			change.setFiftyWon(change.getFiftyWon()+1);
			change.settotal(change.gettotal()+50);
			return;
		}
		else if(cmd.equals("10���ֱ�"))
		{
			change.setTenWon(change.getTenWon()+1);
			change.settotal(change.gettotal()+10);
			return;
		}
		else if(cmd.equals("1000��ä��"))
		{
			change.setOneThousandWon(change.getOneThousandWon()+20);
			return;
		}
		else if(cmd.equals("500��ä��"))
		{
			change.setFiveHundredWon(change.getFiveHundredWon()+20);
			return;
		}
		else if(cmd.equals("100��ä��"))
		{
			change.setOneHundredWon(change.getOneHundredWon()+20);
			return;
		}
		else if(cmd.equals("50��ä��"))
		{
			change.setFiftyWon(change.getFiftyWon()+20);
			return;
		}
		else if(cmd.equals("10��ä��"))
		{
			change.setTenWon(change.getTenWon()+20);
			return;
		}
		else //�ܵ���ȯ
		{
			change.refund();
			JOptionPane.showMessageDialog(null, "1000�� : " + String.valueOf(change.getR_oneThousandWon()) + "\n"
					+ "500�� : " + String.valueOf(change.getR_fiveHundredWon()) + "\n" 
					+ "100�� : " + String.valueOf(change.getR_oneHundredWon()) + "\n"
					+ "50�� : " + String.valueOf(change.getR_fiftyWon()) + "\n"
					+ "10�� : " + String.valueOf(change.getR_tenWon()) + "\n",
					"�ܵ��� ��ȯ�Ǿ����ϴ�.",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		JOptionPane.showMessageDialog(null, "������ �弼��", "�ֹ��Ͻ� ���ᳪ�Խ��ϴ�.", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * 
	 * @brief ������ ���� �� ���â�� ���� �޼����� ��Ÿ�������� �Լ�
	 * @param msg : ���â�� ����ϱ� ���� string ����
	 */
	public void error(String msg) { // ���â�� ����ϴ� �޼ҵ�
		JOptionPane.showMessageDialog(null, msg, "���", 
				JOptionPane.INFORMATION_MESSAGE);
		return;
	}
}
