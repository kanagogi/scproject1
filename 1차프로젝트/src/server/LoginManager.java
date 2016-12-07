package server;

import java.sql.*;
import java.util.ArrayList;

import vo.*;

public class LoginManager {
	
	public boolean enrollUser(User user){
		Connection connection = ConnectionManager.getConnection();
		String sql = "insert into MYUSER(ID, PWD, NAME) values(?, ?, ?)";
		
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setInt(2, user.getPwd());
			pstmt.setString(3, user.getName());
			
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			ConnectionManager.close(connection);
		}
		
		return true;
	}
	
	public boolean findUserById(String id){
		ArrayList<String> idList = new ArrayList<>();
		
		Connection connection = ConnectionManager.getConnection();
		String sql = "select ID from MYUSER";
		
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				idList.add(rs.getString(1));
			}
		} catch (SQLException e) {
			return true;
		}
		
		for(int i=0; i<idList.size(); i++){
			if(idList.get(i).equals(id)){
				return true;
			}
		}
		return false;
	}
	
	public boolean Login(String id, int pwd){
		boolean result = false;
		
		Connection connection = ConnectionManager.getConnection();
		String sql = "select ID, PWD from MYUSER";
		
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				if(rs.getString(1).equals(id) && rs.getInt(2) == pwd){
					result = true;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}


}
