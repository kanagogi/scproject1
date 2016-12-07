package client;

import javax.swing.*;

import manager.DreamManager;
import manager.LoginManager;
import vo.Dream;
import vo.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class CreateDreamClient extends JFrame implements ActionListener{
	private String loginUser;
	
	private DreamManager dm = new DreamManager();
	private LoginManager lm = new LoginManager();
	
	private JTextField tf_dreamName;
	private JTextField tf_money;
	private JTextField tf_startDate;
	private JButton btn_addMember;
	private JButton btn_ok;
	
	private ArrayList<String> makingUserIDList = new ArrayList<>(); // 목표의 멤버들을 저장할 배열 
	private JTextField tf_endDate;
	
	public CreateDreamClient(String userID) {
		loginUser = userID;
		
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
		
		tf_startDate = new JTextField();
		panel_3.add(tf_startDate);
		tf_startDate.setColumns(10);
		
		JLabel lbl_temp = new JLabel("~");
		panel_3.add(lbl_temp);
		
		tf_endDate = new JTextField();
		panel_3.add(tf_endDate);
		tf_endDate.setColumns(10);
		
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
			String newMember = JOptionPane.showInputDialog("추가할 ID : ");
			boolean findUser = lm.findUserById(newMember);
			if(findUser){
				boolean find = false;
				for (String user : makingUserIDList) {
					if(user.equals(newMember)){
						find = true;
						break;
					}
				}
				// makingUserIDList 에 newMember 가 존재하지 않으면 리스트에 추가해줌.
				if(find == false){
					makingUserIDList.add(newMember);
				}
				
			}
			else{
				JOptionPane.showMessageDialog(null, "해당 ID가 존재하지 않습니다. 추가 등록 실패");
			}
			
		}
		
		else if(e.getSource() == btn_ok){
			makingUserIDList.add(loginUser);
			String dreamName = tf_dreamName.getText();
			int money = Integer.parseInt(tf_money.getText());
			String startDate = tf_startDate.getText();
			String endDate = tf_endDate.getText();
			String dreamID = loginUser + ((Math.random()*10)+1); // 나중에 아이디 생성 함수 따로 생각해야 함.
			
			Dream newDream = new Dream(dreamID, dreamName, startDate, endDate, money, makingUserIDList);
			
			boolean resEnroll = dm.enrollDream(newDream);
			// 이부분에 드림리스트 테이블에 작성해야함 여기부터좀 쓰세요 제발
			
			if(resEnroll){
				JOptionPane.showMessageDialog(null, "목표가 등록 되었습니다.");
			}
			else{
				JOptionPane.showMessageDialog(null, "목표 등록 실패.");
			}
				
		}
		
	}

	public static void main(String[] args) {
		new CreateDreamClient("1");
	}
}
