package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;

import entity.NhaCungCap;

public class DAO_NhaCungCap {
	List<NhaCungCap> nhaCungCap = new ArrayList<>();
	public List<NhaCungCap> getAllNhaCungCap() {
		List<NhaCungCap> nhaCungCap = new ArrayList<>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		Statement stmt1= null;
		try {
			String sql= "Select * from NhaCungCap";
			stmt1= con.createStatement();
			ResultSet rs= stmt1.executeQuery(sql);
			while(rs.next()) {
				nhaCungCap.add(new NhaCungCap(rs.getString(1), rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nhaCungCap;
	}
	
	public boolean create(NhaCungCap nhaCungCap) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n=0;
		try {
			stmt = con.prepareStatement("insert into NhaCungCap values(?,?,?,?)");
			stmt.setString(1, nhaCungCap.getMaNCC());
			stmt.setString(2, nhaCungCap.getTenNCC());
			stmt.setString(3, nhaCungCap.getDiaChi());
			stmt.setInt(4, nhaCungCap.getsDT());
			n= stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return n>0;
	}
	
	public boolean delete (String MaNCC) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("delete from NhaCungCap where MaNCC = ?");
			stmt.setString(1, MaNCC);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return n >0;
	}
	
	public boolean update( NhaCungCap nCC) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt2= null;
		int n = 0;
		
			try {
				stmt2 = con.prepareStatement("update NhaCungCap set MaNCC=?, TenNCC=?, DiaChi=?, SoDienThoai=? where MaNCC=?");
				stmt2.setString(1, nCC.getMaNCC());
				stmt2.setString(2, nCC.getTenNCC());
				stmt2.setString(3, nCC.getDiaChi());
				stmt2.setInt(4, nCC.getsDT());
				stmt2.setString(5, nCC.getMaNCC());
				n = stmt2.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	return n>0;
	}

	public ArrayList<NhaCungCap> timTheoMa(String maNCC) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from NhaCungCap where MaNCC = ?";
			stmt= con.prepareStatement(sql);
			stmt.setString(1,maNCC);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String ma= rs.getString(1);
				String ten = rs.getString(2);
				String diaChi= rs.getString(3);
				int soDienThoai = rs.getInt(4);
				nhaCungCap.add(new NhaCungCap(ma, ten,diaChi, soDienThoai));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<NhaCungCap>) nhaCungCap;
	}
}
