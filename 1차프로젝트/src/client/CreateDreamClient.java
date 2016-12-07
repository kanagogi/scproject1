package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateDreamClient extends JFrame implements ActionListener{
	private JTextField tf_dreamName;
	private JTextField tf_money;
	private JTextField tf_period;
	private JButton btn_addMember;
	private JButton btn_ok;
	
	public CreateDreamClient() {
		this.setTitle("목표생성창");
		this.setSize(400, 200);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lbl_dreamName = new JLabel("\uBAA9\uD45C : ");
		panel_1.add(lbl_dreamName);
		
		tf_dreamName = new JTextField();
		panel_1.add(tf_dreamName);
		tf_dreamName.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JLabel lbl_money = new JLabel("\uAE08\uC561 : ");
		panel_2.add(lbl_money);
		
		tf_money = new JTextField();
		panel_2.add(tf_money);
		tf_money.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lbl_period = new JLabel("\uAE30\uAC04 : ");
		panel_3.add(lbl_period);
		
		tf_period = new JTextField();
		panel_3.add(tf_period);
		tf_period.setColumns(10);
		
		JPanel panel_btn = new JPanel();
		getContentPane().add(panel_btn, BorderLayout.SOUTH);
		
		btn_addMember = new JButton("\uBA64\uBC84\uCD94\uAC00");
		btn_addMember.addActionListener(this);
		panel_btn.add(btn_addMember);
		
		btn_ok = new JButton("\uC644\uB8CC");
		btn_ok.addActionListener(this);
		panel_btn.add(btn_ok);
		
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_addMember){
			System.out.println("add member");
		}
		
		else if(e.getSource() == btn_ok){
			System.out.println("dream ok");
		}
		
	}

	public static void main(String[] args) {
		
	}
}
