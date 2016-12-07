package vo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

	public Account_BookGUI() {
		setBounds(100, 200, 500, 530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		scrollPane = new JScrollPane();
		
		table = new JTable();
		String columnName [] = {"분류","내용","입금","출금","날짜"};
		dtm = new DefaultTableModel(columnName,0);
		table.setModel(dtm);
		scrollPane.setViewportView(table);
		getContentPane().add(scrollPane, BorderLayout.NORTH);
//		getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		
		lbl_sum = new JLabel("\uD569\uACC4");
		panel_1.add(lbl_sum);
		
		tf_sum = new JTextField();
		panel_1.add(tf_sum);
		tf_sum.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB300\uC0C1\uC120\uD0DD", "\uBB38\uD654/\uC608\uC220", "\uC720\uD765/\uC220", "\uC1FC\uD551", "\uC0DD\uD65C", "\uAD50\uD1B5", "\uC678\uC2DD", "\uAE30\uD0C0"}));
		panel_2.add(comboBox);
		
		btn_insert = new JButton("\uC785\uB825");
		panel_2.add(btn_insert);
		
		btn_update = new JButton("\uC218\uC815");
		panel_2.add(btn_update);
		
		btn_delete = new JButton("\uC0AD\uC81C");
		panel_2.add(btn_delete);
		
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_insert){
			
		}
		if(e.getSource() == btn_update){
			
		}
		if(e.getSource() == btn_delete){
			
		}
	}

}
