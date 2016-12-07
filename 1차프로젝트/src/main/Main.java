package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import client.Account_BookGUI;
import client.DreamClient;

import java.awt.GridLayout;

public class Main extends JFrame{
	private Account_BookGUI accountbookgui;
	private DreamClient dreamclient;
	
	public Main() {
		this.setSize(1500, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(2, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		accountbookgui = new Account_BookGUI();
		JPanel panel_accountbookgui = accountbookgui.GUIForBookGUI();
		panel_2 = panel_accountbookgui;
		getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		dreamclient = new DreamClient();
		JPanel panel_dreamclient = dreamclient.GUIForDreamClient();
		panel_5 = panel_dreamclient;
		getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		getContentPane().add(panel_6);
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();

	}


}
