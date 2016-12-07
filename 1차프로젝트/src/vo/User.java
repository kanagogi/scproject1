package vo;

import java.util.ArrayList;

public class User {
	private String id;
	private int pwd;
	private String name;
	
	private ArrayList<Dream> dreamList = new ArrayList<>();
	
	public User(String _id, int _pwd, String _name) {
		id = _id;
		pwd = _pwd;
		name = _name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
