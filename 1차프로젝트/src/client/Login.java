package client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import server.LoginManager;
import vo.*;

public class Login extends JFrame implements ActionListener{

	private JLabel lbl_title;
	private JLabel lbl_id;
	private JTextField tf_id;
	private JLabel lbl_pwd;
	private JPasswordField tf_pwd;
	private JButton btn_enroll;
	private JButton btn_login;
	
	private LoginManager loginManager = new LoginManager();

	public Login() {
		setBounds(100, 200, 300, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_title = new JLabel("\uB85C\uADF8\uC778 \uD654\uBA74");
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lbl_title, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		lbl_id = new JLabel("                   ID");
		panel_1.add(lbl_id);
		
		tf_id = new JTextField();
		panel_1.add(tf_id);
		tf_id.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		lbl_pwd = new JLabel("PASSWORD");
		panel_2.add(lbl_pwd);
		
		tf_pwd = new JPasswordField();
		panel_2.add(tf_pwd);
		tf_pwd.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		btn_enroll = new JButton("\uD68C\uC6D0\uB4F1\uB85D");
		btn_enroll.addActionListener(this);
		panel_3.add(btn_enroll);
		
		btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(this);
		panel_3.add(btn_login);

		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// �Է� ��ư
		if(e.getSource() == btn_enroll){
			String newId = tf_id.getText();
			int newPwd = Integer.parseInt(tf_pwd.getText());
			
			boolean ifExist = loginManager.findUserById(newId);
			if(ifExist){
				JOptionPane.showMessageDialog(null, "�̹� ��ϵ� ȸ���Դϴ�.");
			}
			else{
				User newUser = new User(newId, newPwd, new JOptionPane().showInputDialog("�̸�:")); 
				boolean resultEnroll = loginManager.enrollUser(newUser);
				if(resultEnroll == false){
					JOptionPane.showMessageDialog(null, "��Ͻ���");
				}
				else{
					JOptionPane.showMessageDialog(null, "��ϼ���");
				}
			}
		}
		
		// �α��� ��ư
		else if(e.getSource() == btn_login){
			boolean isExist = loginManager.findUserById(tf_id.getText());
			
			if(isExist){
				if(loginManager.Login(tf_id.getText(), Integer.parseInt(tf_pwd.getText()))){
					JOptionPane.showMessageDialog(null, "�α��� ����");
					// �� �κп��� �α��� â �����, ����â �������.
					this.dispose();
					//new Account_BookGUI();
					new DreamClient();
				}
				else{
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "�������� �ʴ� ȸ���Դϴ�.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
