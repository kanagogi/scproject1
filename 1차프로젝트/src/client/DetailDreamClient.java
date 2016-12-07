package client;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailDreamClient extends JFrame implements ActionListener{
	
	private String dreamID;
	
	private JLabel lbl_moneyContent;
	private JLabel lbl_achievementContent;
	private JScrollPane scroll_table;
	private JTable table_dream;	
	private DefaultTableModel dtm; 
	private JScrollPane scroll_list;
	private JList list_member;
	private JButton btn_refresh;
	private JButton btn_deposit;

	public DetailDreamClient(String _dreamID) {
		// 목표 아이디 저장
		dreamID = _dreamID;
		
		// GUI 부분
		this.setTitle("목표 상세화면");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lbl_title = new JLabel("\uBAA9\uD45C\uB0B4\uC6A9");
		lbl_title.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lbl_title);
		
		JPanel panel_1_1 = new JPanel();
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1.add(panel_1_1_1);
		
		JLabel lbl_money = new JLabel("\uAE08\uC561 : ");
		panel_1_1_1.add(lbl_money);
		
		lbl_moneyContent = new JLabel("00");
		panel_1_1_1.add(lbl_moneyContent);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1.add(panel_1_1_2);
		
		JLabel lbl_achievement = new JLabel("\uB2EC\uC131\uB960");
		panel_1_1_2.add(lbl_achievement);
		
		lbl_achievementContent = new JLabel("00%");
		panel_1_1_2.add(lbl_achievementContent);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		scroll_table = new JScrollPane();
		panel_2.add(scroll_table);
		
		table_dream = new JTable();
		String title[] = {"이름", "금액", "날짜"};
		dtm = new DefaultTableModel(title, 0);
		table_dream.setModel(dtm);
		scroll_table.setViewportView(table_dream);
		
		scroll_list = new JScrollPane();
		panel_2.add(scroll_list);
		
		list_member = new JList();
		scroll_list.setViewportView(list_member);
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		btn_refresh = new JButton("\uAC31\uC2E0");
		btn_refresh.addActionListener(this);
		panel_3.add(btn_refresh);
		
		btn_deposit = new JButton("\uC785\uAE08");
		btn_deposit.addActionListener(this);
		panel_3.add(btn_deposit);
		
		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_refresh){
			System.out.println("refresh");
		}
		
		else if(e.getSource() == btn_deposit){
			System.out.println("deposit");
		}
	}
}
