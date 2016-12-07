package vo;

public class Account_Book {
	
	private String ID;
	private String type;
	private String contents;
	private String deposit;
	private String withdraw;
	private String date;
	
	
	public Account_Book(String ID, String type, String contents,
			String deposit, String withdraw, String date) {
		this.ID = ID;
		this.type = type;
		this.contents = contents;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.date = date;
	}

	public Account_Book(){
		
	}
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getDeposit() {
		return deposit;
	}


	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}


	public String getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Account_Book [ID=" + ID + ", type=" + type + ", contents="
				+ contents + ", deposit=" + deposit + ", withdraw=" + withdraw
				+ ", date=" + date + "]";
	}
	
	
	
}
