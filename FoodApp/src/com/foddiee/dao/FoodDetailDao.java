package com.foddiee.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.foodiee.model.FoodDetail;
import com.mysql.jdbc.Connection;

public class FoodDetailDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/foodiee", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static List<FoodDetail> getItemDetail() {
		List<FoodDetail> list = new ArrayList<>();
		try {
			Connection con = getConnection();
			PreparedStatement ps = con
					.prepareStatement("select * from itemdetail");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FoodDetail fd = new FoodDetail();
				fd.setSno(rs.getString("SNo"));
				fd.setItemtype(rs.getString("Itemtype"));
				fd.setItemname(rs.getString("Itemname"));
				fd.setItemprice(rs.getString("Itemprice"));
				list.add(fd);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;

	}
}
