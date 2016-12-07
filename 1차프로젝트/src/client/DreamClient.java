package client;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DreamClient extends JFrame implements ActionListener{
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel dtm;
	private JButton btnSelectDream;
	private JButton btnDeleteDream;
	private JButton btnCreateDream;
	
	public DreamClient() {
		this.setSize(500, 500);
		this.setTitle("Dream - List");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		scroll = new JScrollPane();
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		table = new JTable();
		String title[] = {"��ǥ����", "�޼���"};
		dtm = new DefaultTableModel(title, 0);
		table.setModel(dtm);
		scroll.setViewportView(table);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnSelectDream = new JButton("\uC0C1\uC138\uBCF4\uAE30");
		btnSelectDream.addActionListener(this);
		panel.add(btnSelectDream);
		
		btnDeleteDream = new JButton("\uBAA9\uD45C\uC0AD\uC81C");
		btnDeleteDream.addActionListener(this);
		panel.add(btnDeleteDream);
		
		btnCreateDream = new JButton("\uBAA9\uD45C\uC0DD\uC131");
		btnCreateDream.addActionListener(this);
		panel.add(btnCreateDream);
		
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new DreamClient();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//��ǥ �󼼺��� ��ư
		if(e.getSource() == btnSelectDream){
			new DetailDreamClient("�ӽ� �帲 ���̵�");
		}
		
		else if(e.getSource() == btnDeleteDream){
			System.out.println("d");
		}
		
		//��ǥ ���� ��ư
		else if(e.getSource() == btnCreateDream){
			new CreateDreamClient();
		}
		
	}

}
