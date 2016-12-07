package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;

public class Account_BookGUI extends JFrame implements ActionListener{
	private JTextField tf_sum;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel dtm;
	private JComboBox comboBox;
	private JButton btn_insert;
	private JButton btn_update;
	private JButton btn_delete;
	private JLabel lbl_sum;
	private JPanel panel_bookGUI;

	public Account_BookGUI() {
		//setBounds(100, 200, 500, 530);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GUIForBookGUI();
		
		//setVisible(true);
	}
	
	public JPanel GUIForBookGUI(){
		panel_bookGUI = new JPanel();
		
		String columnName [] = {"분류","내용","입금","출금","날짜"};
		dtm = new DefaultTableModel(columnName,0);
		getContentPane().add(panel_bookGUI, BorderLayout.WEST);
		panel_bookGUI.setLayout(new BoxLayout(panel_bookGUI, BoxLayout.Y_AXIS));
		scrollPane = new JScrollPane();
		panel_bookGUI.add(scrollPane);
		
		table = new JTable();
		table.setModel(dtm);
		scrollPane.setViewportView(table);
				
		JPanel panel_1 = new JPanel();
		panel_bookGUI.add(panel_1);
		
		lbl_sum = new JLabel("\uD569\uACC4");
		panel_1.add(lbl_sum);
		
		tf_sum = new JTextField();
		panel_1.add(tf_sum);
		tf_sum.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB300\uC0C1\uC120\uD0DD", "\uC785\uAE08", "\uCD9C\uAE08"}));
		panel_2.add(comboBox); 
		
		btn_insert = new JButton("\uC785\uB825");
		btn_insert.addActionListener(this);
		panel_2.add(btn_insert);
		
		btn_update = new JButton("\uC218\uC815");
		btn_update.addActionListener(this);
		panel_2.add(btn_update);
		
		btn_delete = new JButton("\uC0AD\uC81C");
		btn_delete.addActionListener(this);
		panel_2.add(btn_delete);
		
		panel_bookGUI.add(panel_2);
		
		return panel_bookGUI;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_insert){
			if(comboBox.getSelectedIndex() == 0){
				//JOptionPane.showMessageDialog(null, "대상을 선택해주세요");
				new Account_withdrawGUI();
			}
			
			if(comboBox.getSelectedIndex() == 1){
				new Account_depositGUI();
				
			}else if(comboBox.getSelectedIndex() == 2){
				new Account_withdrawGUI();
			}
		}
		if(e.getSource() == btn_update){
			int a = table.getSelectedRow();
			
		}
		if(e.getSource() == btn_delete){
			
		}
	}

}
