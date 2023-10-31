package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.QuanAo;
import entity.NhaCungCap;
import entity.LoaiQuanAo;
public class DAO_QuanAo {
	List<QuanAo> dsQuanAo = new ArrayList<>();
	public List<QuanAo> getAllQuanAo() {
		List<QuanAo> dsQuanAo = new ArrayList<>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		Statement stmt1= null;
		try {
			String sql= "Select * from QuanAo";
			stmt1= con.createStatement();
			ResultSet rs= stmt1.executeQuery(sql);
			while(rs.next()) {
				String maQuanAo= rs.getString(1);
				String tenQuanAo= rs.getString(2);
				String tenNhaCC = rs.getString(3);
				String loaiQuanAo = rs.getString(4);
				String kichThuoc = rs.getString(5);
				int soLuongTon = rs.getInt(6);
				float gia = rs.getFloat(7);
				dsQuanAo.add(new QuanAo(maQuanAo,tenQuanAo,new NhaCungCap(tenNhaCC),new LoaiQuanAo(loaiQuanAo),kichThuoc,soLuongTon,gia));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsQuanAo;
	}
	
	public boolean create(QuanAo quanAo) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n=0;
		try {
			stmt = con.prepareStatement("insert into QuanAo values(?,?,?,?,?,?,?)");
			stmt.setString(1, quanAo.getMaQuanAo());
			stmt.setString(2, quanAo.getTenQuanAo());
			stmt.setString(3, quanAo.getTenNCC().getTenNCC());
			stmt.setString(4, quanAo.getLoaiQuanAo().getTenLoai());
			stmt.setString(5, quanAo.getKinhThuoc());
			stmt.setInt(6, quanAo.getSoLuongTon());
			stmt.setFloat(7, quanAo.getGia());
			n= stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return n>0;
	}
	
	public boolean delete (String MaQuanAo) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("delete from QuanAo where MaQuanAo = ?");
			stmt.setString(1, MaQuanAo);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return n >0;
	}
	
	public boolean update( QuanAo quanAo) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt2= null;
		int n = 0;
		
			try {
				stmt2 = con.prepareStatement("update QuanAo set MaQuanAo=?, TenQuanAo=?, TenNCC=?,LoaiQuanAo=?, KichThuoc=?, SoLuongTon=?, Gia= ? where MaQuanAo=?");
				stmt2.setString(1, quanAo.getMaQuanAo());
				stmt2.setString(2, quanAo.getTenQuanAo());
				stmt2.setString(3, quanAo.getTenNCC().getTenNCC());
				stmt2.setString(4, quanAo.getLoaiQuanAo().getTenLoai());
				stmt2.setString(5, quanAo.getKinhThuoc());
				stmt2.setInt(6, quanAo.getSoLuongTon());
				stmt2.setFloat(7, quanAo.getGia());
				stmt2.setString(8, quanAo.getMaQuanAo());
				n = stmt2.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	return n>0;
	}

	public ArrayList<QuanAo> timTheoTen(String ten) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from QuanAo where TenQuanAo like ?";
			stmt= con.prepareStatement(sql);
			stmt.setString(1,"%"+ten+"%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maQuanAo= rs.getString(1);
				String tenQuanAo= rs.getString(2);
				String tenNhaCC = rs.getString(3);
				String loaiQuanAo = rs.getString(4);
				String kichThuoc = rs.getString(5);
				int soLuongTon = rs.getInt(6);
				float gia = rs.getFloat(7);
				dsQuanAo.add(new QuanAo(maQuanAo,tenQuanAo,new NhaCungCap(tenNhaCC),new LoaiQuanAo(loaiQuanAo),kichThuoc,soLuongTon,gia));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<QuanAo>) dsQuanAo;
	}
}
