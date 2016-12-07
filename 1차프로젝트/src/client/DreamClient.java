package client;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DreamClient extends JFrame implements ActionListener{
	private JPanel DCpanel = new JPanel(); // 전체를 담는 패널
	
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel dtm;
	private JButton btnSelectDream;
	private JButton btnDeleteDream;
	private JButton btnCreateDream;
	private JPanel panel_1;
	
	public DreamClient() {
		//this.setSize(500, 500);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		GUIForDreamClient();
		//this.getContentPane().add(GUIForDreamClient());
		//this.setVisible(true);
	}
	
	// gui 생성후 가장 상위 패널을 반환한다.
	public JPanel GUIForDreamClient(){
		String title[] = {"목표내용", "달성률"};
		dtm = new DefaultTableModel(title, 0);
		
		DCpanel = new JPanel();
		DCpanel.setLayout(new BoxLayout(DCpanel, BoxLayout.Y_AXIS));
		
		scroll = new JScrollPane();
		DCpanel.add(scroll);
		
		table = new JTable();
		table.setModel(dtm);
		scroll.setViewportView(table);
		
		JPanel panel = new JPanel();
		DCpanel.add(panel);
		
		btnSelectDream = new JButton("\uC0C1\uC138\uBCF4\uAE30");
		btnSelectDream.addActionListener(this);
		panel.add(btnSelectDream);
		
		btnDeleteDream = new JButton("\uBAA9\uD45C\uC0AD\uC81C");
		btnDeleteDream.addActionListener(this);
		panel.add(btnDeleteDream);
		
		btnCreateDream = new JButton("\uBAA9\uD45C\uC0DD\uC131");
		btnCreateDream.addActionListener(this);
		panel.add(btnCreateDream);
		
		return DCpanel;
	}
	
	

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}

	public JButton getBtnSelectDream() {
		return btnSelectDream;
	}

	public void setBtnSelectDream(JButton btnSelectDream) {
		this.btnSelectDream = btnSelectDream;
	}

	public JButton getBtnDeleteDream() {
		return btnDeleteDream;
	}

	public void setBtnDeleteDream(JButton btnDeleteDream) {
		this.btnDeleteDream = btnDeleteDream;
	}

	public JButton getBtnCreateDream() {
		return btnCreateDream;
	}

	public void setBtnCreateDream(JButton btnCreateDream) {
		this.btnCreateDream = btnCreateDream;
	}

	public static void main(String[] args) {
		new DreamClient();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//목표 상세보기 버튼
		if(e.getSource() == btnSelectDream){
			new DetailDreamClient("임시 드림 아이디");
		}
		
		else if(e.getSource() == btnDeleteDream){
		}
		
		//목표 생성 버튼
		else if(e.getSource() == btnCreateDream){
			new CreateDreamClient();
		}
		
	}

}
