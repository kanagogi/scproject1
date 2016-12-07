package vo;

import java.util.ArrayList;

public class AccountManager {
	private Account_Book accountbook;
	private ArrayList<String> accountList;

	public AccountManager(){
			accountbook = new Account_Book();
			accountList = new ArrayList<>();
		}
		
		public boolean accountInsert(String accountbook){
			boolean result = false;
			result = accountList.add(accountbook);
			return result;
		}
		
		public void accountUpdate(String accountbook){
			/*for(int i = 0; i<accountList.get(i))
			accountList.set(index, accountbook);*/
		}
		
		public boolean accountDelete(String accountbook){
			boolean result = false;
			result = accountList.remove(accountbook);
			return result;
		}
		public static void main(String[] args) {
			new Account_BookGUI();
		}
}
