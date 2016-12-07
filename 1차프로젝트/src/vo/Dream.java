package vo;

import java.util.ArrayList;

public class Dream {
	private String dream_id;
	private String dream_name;
	private String start_date;
	private String end_date;
	private int money; // 목표금액

	private ArrayList<String> memberIDList = new ArrayList<>();
	
	public Dream(String dream_id, String dream_name, String start_date, String end_date, int money,
			ArrayList<String> memberList) {
		this.dream_id = dream_id;
		this.dream_name = dream_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.money = money;
		this.memberIDList = memberList;
	}

	public String getDream_id() {
		return dream_id;
	}

	public void setDream_id(String dream_id) {
		this.dream_id = dream_id;
	}

	public String getDream_name() {
		return dream_name;
	}

	public void setDream_name(String dream_name) {
		this.dream_name = dream_name;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public ArrayList<String> getMemberList() {
		return memberIDList;
	}

	public void setMemberList(ArrayList<String> memberIDList) {
		this.memberIDList = memberIDList;
	}
	
	
}
