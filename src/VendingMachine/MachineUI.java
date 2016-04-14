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
 * @todo windowbuilder를 통해 VendingMachine UI를 만들고 버튼을 클릭함에따라 수행해야 하는 함수들을 모두 구현
 * @date April 11,2016
 */
public class MachineUI extends JFrame {
	
	Machine machine = new Machine(); //Machine 객체 생성
	Change change = new Change(20); //Change 객체 생성
	
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
	 * @brief VendingMachine UI의 제목을 만들어주고 글꼴도 바꿔줌 images폴더를 만들어 음료수 사진들 저장
	 * setBounds, setIcon 등을 이용해 음료수 그림을 붙여넣고 위치를 설정해줌
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
		label.setFont(new Font("HY크리스탈M", Font.PLAIN, 17));
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
		 * @brief String.valuOf함수를 사용하여 JLabel에 인자로 준 값을 넣기(라벨에 쓰기위해 int형을 string으로 바꾸어준다)
		 * @param String.valueOf(change.gettotal()) : 투입한 금액의 값
		 * @param String.valueOf(change.getOneThousandWon()) : 1000원의 재고 ~ 10원재고까지
		 * @brief 라벨의 id.setText함수를 사용하여 purchase함수 수행후에 계산된 돈의 재고값과 투입금액의 변화를 라벨에 나타내준다
		 */
		JLabel lblNewLabel_10 = new JLabel(String.valueOf(change.gettotal())); //투입금액
		lblNewLabel_10.setBounds(344, 506, 62, 18);
		contentPane.add(lblNewLabel_10);		
		
		JLabel lblNewLabel_11 = new JLabel(String.valueOf(change.getOneThousandWon()));
		lblNewLabel_11.setBounds(59, 406, 44, 14);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("1000원넣기"); //1000원 넣기
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
		
		JButton btnNewButton_1 = new JButton("500원넣기"); //500원 넣기
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
		
		JButton btnNewButton_2 = new JButton("100원넣기"); //100원넣기
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
		
		JButton button_1 = new JButton("50원넣기"); //50원넣기
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

		JButton btnNewButton_3 = new JButton("10원넣기"); //10원넣기
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_15.setText(String.valueOf(change.getTenWon()));
				lblNewLabel_10.setText(String.valueOf(change.gettotal()));

			}
		});
		btnNewButton_3.setBounds(479, 368, 105, 27);
		contentPane.add(btnNewButton_3);		
		
		JLabel label_5 = new JLabel("투입금액 :");
		label_5.setBounds(255, 506, 85, 18);
		contentPane.add(label_5);
		
		/**
		 * 음료수를 클릭 했을 때 음료수들의 재고와 판매량 변화와 투입금액의 변화를 setText로 나타냄 
		 */
		JLabel lblNewLabel_5 = new JLabel(String.valueOf(machine.cola.getnumOfStock())); //콜라 재고
		lblNewLabel_5.setBounds(55, 232, 36, 18);
		contentPane.add(lblNewLabel_5);		
		
		JLabel lblNewLabel_16 = new JLabel(String.valueOf(machine.cola.getNumOfPurchased())); //콜라 판매량
		lblNewLabel_16.setBounds(60, 253, 37, 18);
		contentPane.add(lblNewLabel_16);
		
		JButton btnNewButton_4 = new JButton("콜라"); //콜라
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
				
		JLabel lblNewLabel_6 = new JLabel(String.valueOf(machine.cider.getnumOfStock())); //사이다 재고
		lblNewLabel_6.setBounds(169, 232, 37, 18);
		contentPane.add(lblNewLabel_6);		
		
		JLabel label_1 = new JLabel(String.valueOf(machine.cider.getNumOfPurchased())); //사이다 판매량
		label_1.setBounds(175, 252, 37, 18);
		contentPane.add(label_1);

		JButton btnNewButton_5 = new JButton("사이다"); //사이다
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
		
		JLabel lblNewLabel_7 = new JLabel(String.valueOf(machine.water.getnumOfStock())); //물 재고
		lblNewLabel_7.setBounds(277, 231, 26, 18);
		contentPane.add(lblNewLabel_7);		
				
		JLabel label_2 = new JLabel(String.valueOf(machine.water.getNumOfPurchased())); //물 판매량
		label_2.setBounds(282, 252, 36, 18);
		contentPane.add(label_2);
		
		JButton btnNewButton_6 = new JButton("물"); //물
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
		
		JLabel lblNewLabel_8 = new JLabel(String.valueOf(machine.sikhye.getnumOfStock())); //식혜 재고
		lblNewLabel_8.setBounds(390, 231, 20, 18);
		contentPane.add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel(String.valueOf(machine.sikhye.getNumOfPurchased())); //식혜 판매량
		label_3.setBounds(395, 249, 32, 18);
		contentPane.add(label_3);		
		
		JButton btnNewButton_7 = new JButton("식혜"); //식혜
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
		
		JLabel lblNewLabel_9 = new JLabel(String.valueOf(machine.letsbe.getnumOfStock())); //레츠비 재고
		lblNewLabel_9.setBounds(507, 231, 26, 18);
		contentPane.add(lblNewLabel_9);		
		
		JLabel label_4 = new JLabel(String.valueOf(machine.letsbe.getNumOfPurchased())); //레츠비 판매량
		label_4.setBounds(512, 253, 26, 18);
		contentPane.add(label_4);				

		JButton btnNewButton_8 = new JButton("레츠비");//레츠비
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
		 * 음료수 재고 채우기
		 */
		JButton btnNewButton_9 = new JButton("콜라채우기");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_5.setText(String.valueOf(machine.cola.getnumOfStock()));
			}
		});
		btnNewButton_9.setBounds(6, 311, 113, 27);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("사이다채우기");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_6.setText(String.valueOf(machine.cider.getnumOfStock()));
			}
		});
		btnNewButton_10.setBounds(125, 311, 117, 27);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("물채우기");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_7.setText(String.valueOf(machine.water.getnumOfStock()));
			}
		});
		btnNewButton_11.setBounds(246, 311, 111, 27);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("식혜채우기");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_8.setText(String.valueOf(machine.sikhye.getnumOfStock()));
			}
		});
		btnNewButton_12.setBounds(360, 311, 105, 27);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("레츠비채우기");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_9.setText(String.valueOf(machine.letsbe.getnumOfStock()));
			}
		});
		btnNewButton_13.setBounds(469, 311, 117, 27);
		contentPane.add(btnNewButton_13);
		
		JButton button = new JButton("잔돈반환"); //잔돈반환
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
		 * 돈의 재고 채우기
		 */
		JButton button_2 = new JButton("1000원채움");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_11.setText(String.valueOf(change.getOneThousandWon()));
			}
		});
		button_2.setBounds(14, 430, 117, 27);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("500원채움");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purchase(arg0.getActionCommand());
				lblNewLabel_12.setText(String.valueOf(change.getFiveHundredWon()));	
			}
		});
		button_3.setBounds(135, 430, 111, 27);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("100원채움");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_13.setText(String.valueOf(change.getOneHundredWon()));
			}
		});
		button_4.setBounds(253, 430, 111, 27);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("50원채움");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_14.setText(String.valueOf(change.getFiftyWon()));
			}
		});
		button_5.setBounds(370, 430, 105, 27);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("10원채움");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(e.getActionCommand());
				lblNewLabel_15.setText(String.valueOf(change.getTenWon()));
			}
		});
		button_6.setBounds(479, 430, 105, 27);
		contentPane.add(button_6);
		
		JLabel lblNewLabel_17 = new JLabel("재고 :");
		lblNewLabel_17.setBounds(0, 232, 52, 18);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("판매량 :");
		lblNewLabel_18.setBounds(-1, 255, 52, 18);
		contentPane.add(lblNewLabel_18);
	}
	
	/**
	 * 
	 * @brief 자판기의 모든 역할이 담긴 핵심 함수
	 * @param cmd : 어떤 버튼인지 인식하기 위한  string 변수
	 * @exception 음료수의 재고가 0이되면 error를 나타내줌, 투입금액이 음료수금액보다 낮으면 error를 나타내줌
	 * @exception 음료수 재고가 꽉차있다면 재고를 추가하려할 때 error를 나타내줌
	 * @brief 음료수의 판매량 변화, 재고관리, 금액 변화, 돈 재고관리 등 중요 역할을 모두 이 함수에서 구현 
	 */
	public void purchase(String cmd) { //모든 역할이 담긴 핵심 함수
		if(cmd.equals("콜라")){
			if(machine.cola.IsEmpty())
			{
				error("재고가 없습니다. 채워주세요");
				return;
			}
			else if(change.gettotal()<machine.cola.getPrice())
			{
				error("금액이 부족합니다. 돈을 넣어주세요");
				return;
			}
			else 
			{
				machine.cola.setNumOfPurchased(machine.cola.getNumOfPurchased()+1);
				machine.cola.setnumOfStock(machine.cola.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.cola.getPrice());	
			}
		}
		else if(cmd.equals("사이다"))
		{
			if(machine.cider.IsEmpty())
			{
				error("재고가 없습니다. 채워주세요");
				return;
			}
			else if(change.gettotal()<machine.cider.getPrice())
			{
				error("금액이 부족합니다. 돈을 넣어주세요");
				return;
			}
			else 
			{
				machine.cider.setNumOfPurchased(machine.cider.getNumOfPurchased()+1);
				machine.cider.setnumOfStock(machine.cider.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.cider.getPrice());
			}
		}
		else if(cmd.equals("물"))
		{
			if(machine.water.IsEmpty())
			{
				error("재고가 없습니다. 채워주세요");
				return;
			}
			else if(change.gettotal()<machine.water.getPrice())
			{
				error("금액이 부족합니다. 돈을 넣어주세요");
				return;
			}
			else 
			{
				machine.water.setNumOfPurchased(machine.water.getNumOfPurchased()+1);
				machine.water.setnumOfStock(machine.water.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.water.getPrice());
			}
		}
		else if(cmd.equals("식혜"))
		{
			if(machine.sikhye.IsEmpty())
			{
				error("재고가 없습니다. 채워주세요");
				return;
			}
			else if(change.gettotal()<machine.sikhye.getPrice())
			{
				error("금액이 부족합니다. 돈을 넣어주세요");
				return;
			}
			else 
			{
				machine.sikhye.setNumOfPurchased(machine.sikhye.getNumOfPurchased()+1);
				machine.sikhye.setnumOfStock(machine.sikhye.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.sikhye.getPrice());
			}
		}
		else if(cmd.equals("레츠비"))
		{
			if(machine.letsbe.IsEmpty())
			{
				error("재고가 없습니다. 채워주세요");
				return;
			}
			else if(change.gettotal()<machine.letsbe.getPrice())
			{
				error("금액이 부족합니다. 돈을 넣어주세요");
				return;
			}
			else 
			{
				machine.letsbe.setNumOfPurchased(machine.letsbe.getNumOfPurchased()+1);
				machine.letsbe.setnumOfStock(machine.letsbe.getnumOfStock()-1);
				change.settotal(change.gettotal()-machine.letsbe.getPrice());
			}
		}
		else if(cmd.equals("콜라채우기"))
		{
			if(machine.cola.IsFull())
			{
				error("콜라를 넣을 공간이 없습니다.");
				return;
			}
			else
			{
				machine.cola.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("사이다채우기"))
		{
			if(machine.cider.IsFull())
			{
				error("사이다를 넣을 공간이 없습니다.");
				return;
			}
			else
			{
				machine.cider.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("물채우기"))
		{
			if(machine.water.IsFull())
			{
				error("물을 넣을 공간이 없습니다.");
				return;
			}
			else
			{
				machine.water.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("식혜채우기"))
		{
			if(machine.sikhye.IsFull())
			{
				error("식혜를 넣을 공간이 없습니다.");
				return;
			}
			else
			{
				machine.sikhye.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("레츠비채우기"))
		{
			if(machine.letsbe.IsFull())
			{
				error("레츠비를 넣을 공간이 없습니다.");
				return;
			}
			else
			{
				machine.letsbe.setnumOfStock(10);
				return;
			}
		}
		else if(cmd.equals("1000원넣기"))
		{
			change.setOneThousandWon(change.getOneThousandWon()+1);
			change.settotal(change.gettotal()+1000);
			return;
		}
		else if(cmd.equals("500원넣기"))
		{
			change.setFiveHundredWon(change.getFiveHundredWon()+1);
			change.settotal(change.gettotal()+500);
			return;
		}
		else if(cmd.equals("100원넣기"))
		{
			change.setOneHundredWon(change.getOneHundredWon()+1);
			change.settotal(change.gettotal()+100);
			return;
		}
		else if(cmd.equals("50원넣기"))
		{
			change.setFiftyWon(change.getFiftyWon()+1);
			change.settotal(change.gettotal()+50);
			return;
		}
		else if(cmd.equals("10원넣기"))
		{
			change.setTenWon(change.getTenWon()+1);
			change.settotal(change.gettotal()+10);
			return;
		}
		else if(cmd.equals("1000원채움"))
		{
			change.setOneThousandWon(change.getOneThousandWon()+20);
			return;
		}
		else if(cmd.equals("500원채움"))
		{
			change.setFiveHundredWon(change.getFiveHundredWon()+20);
			return;
		}
		else if(cmd.equals("100원채움"))
		{
			change.setOneHundredWon(change.getOneHundredWon()+20);
			return;
		}
		else if(cmd.equals("50원채움"))
		{
			change.setFiftyWon(change.getFiftyWon()+20);
			return;
		}
		else if(cmd.equals("10원채움"))
		{
			change.setTenWon(change.getTenWon()+20);
			return;
		}
		else //잔돈반환
		{
			change.refund();
			JOptionPane.showMessageDialog(null, "1000원 : " + String.valueOf(change.getR_oneThousandWon()) + "\n"
					+ "500원 : " + String.valueOf(change.getR_fiveHundredWon()) + "\n" 
					+ "100원 : " + String.valueOf(change.getR_oneHundredWon()) + "\n"
					+ "50원 : " + String.valueOf(change.getR_fiftyWon()) + "\n"
					+ "10원 : " + String.valueOf(change.getR_tenWon()) + "\n",
					"잔돈이 반환되었습니다.",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		JOptionPane.showMessageDialog(null, "맛나게 드세요", "주문하신 음료나왔습니다.", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * 
	 * @brief 에러가 있을 때 경고창을 띄우고 메세지를 나타내기위한 함수
	 * @param msg : 경고창을 출력하기 위한 string 변수
	 */
	public void error(String msg) { // 경고창을 출력하는 메소드
		JOptionPane.showMessageDialog(null, msg, "경고", 
				JOptionPane.INFORMATION_MESSAGE);
		return;
	}
}
