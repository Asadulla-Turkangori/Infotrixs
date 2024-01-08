package com.quoteimp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.copy.Quotedao;
import com.modules.Quote;

public class Quotedaoimp implements Quotedao{
	
	static String url = "jdbc:mysql://localhost:3306/quotes";
	static String username = "root";
	static String password = "8050";
	static PreparedStatement prepareStatement;
	static Connection con;
	static ResultSet res;
	
	static String SELECT_QUERY = "select * from quote where id = ?"; 
	static String SELECTALL_QUERY = "select * from quote order by author asc";
	
	public Quotedaoimp() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Quote get(int id) {
		try {
			prepareStatement = con.prepareStatement(SELECT_QUERY);
			prepareStatement.setInt(1, id);
			res = prepareStatement.executeQuery();
			
			while(res.next()) {
				String author = res.getString(2);
				String value = res.getString(3);
				Quote q = new Quote(id, author, value);
				return q;
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Quote> getall() {
		ArrayList<Quote> lst = new ArrayList<>();
		try {
			prepareStatement = con.prepareStatement(SELECTALL_QUERY);
			res = prepareStatement.executeQuery();
			
			while(res.next()) {
				int id = res.getInt(1);
				String auth_name = res.getString(2);
				String value = res.getString(3);
				
				Quote q = new Quote(id, auth_name, value);
				lst.add(q);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
}
