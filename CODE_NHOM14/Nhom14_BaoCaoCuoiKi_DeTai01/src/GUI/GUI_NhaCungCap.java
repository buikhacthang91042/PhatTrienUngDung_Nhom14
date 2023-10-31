package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

import DAO.DAO_LoaiQuanAo;
import DAO.DAO_NhaCungCap;
import DAO.DAO_QuanAo;
import connect.ConnectDB;
import entity.LoaiQuanAo;
import entity.NhaCungCap;

import javax.swing.JScrollPane;

public class GUI_NhaCungCap extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMaNCC;
	private JTextField txtTenNCC;
	private JTextField txtDiachi;
	private JTextField txtSdt;
	private JTable tblThongTinNhaCC;
	private DefaultTableModel modelThongTinNhaCungCap;
	private String ma;
	private List<NhaCungCap> list;
	public GUI_NhaCungCap() {
		setBackground(new Color(0, 64, 64));
		setLayout(null);
		
		JLabel lblNhacungcap = new JLabel("Nhà cung cấp");
		lblNhacungcap.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
		lblNhacungcap.setBounds(512, 0, 256, 69);
		lblNhacungcap.setForeground(new Color(135, 206, 235));
		add(lblNhacungcap);
		
		//ConnectDB
 		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String [] tieude={"Mã nhà cung cấp","Tên nhà cung cấp","Địa chỉ","Số điện thoại"};
 		modelThongTinNhaCungCap = new DefaultTableModel(tieude,0);
 		JScrollPane scrThongTinNhaCungCap = new JScrollPane();
		scrThongTinNhaCungCap.setBounds(75, 415, 1126, 177);
		add(scrThongTinNhaCungCap);
		
		scrThongTinNhaCungCap.setViewportView(tblThongTinNhaCC = new  JTable(modelThongTinNhaCungCap));
		scrThongTinNhaCungCap.setViewportView(tblThongTinNhaCC);
		tblThongTinNhaCC.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent e) {
				
				  int row = tblThongTinNhaCC.getSelectedRow();
				  txtMaNCC.setText(tblThongTinNhaCC.getValueAt(row, 0).toString());
				  txtTenNCC.setText(tblThongTinNhaCC.getValueAt(row, 1).toString());
				  txtDiachi.setText(tblThongTinNhaCC.getValueAt(row, 2).toString());
				  txtSdt.setText(tblThongTinNhaCC.getValueAt(row, 3).toString());
 				
 			}
 		});
		
		JPanel pnlNhapThongTinNCC = new JPanel();
		pnlNhapThongTinNCC.setBounds(181, 79, 912, 267);
		add(pnlNhapThongTinNCC);
		pnlNhapThongTinNCC.setLayout(null);
		
		JButton btnthem = new JButton("THÊM");
		btnthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaNCC.setText(taoMa());
				themNhaCC();
			}
		});
		btnthem.setBounds(81, 193, 101, 42);
		pnlNhapThongTinNCC.add(btnthem);
		btnthem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnthem.setForeground(new Color(50, 205, 50));
		btnthem.setBackground(new Color(0, 250, 154));
		
		JButton btnxoa = new JButton("XÓA");
		btnxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoaNhaCungCap();
			}
		});
		btnxoa.setBounds(257, 193, 101, 42);
		pnlNhapThongTinNCC.add(btnxoa);
		btnxoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnxoa.setForeground(new Color(50, 205, 50));
		btnxoa.setBackground(new Color(0, 250, 154));
		
		JButton btnsua = new JButton("SỬA");
		btnsua.setBounds(500, 193, 101, 42);
		pnlNhapThongTinNCC.add(btnsua);
		btnsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				suaNhaCungCap();
			}
		});
		btnsua.setForeground(new Color(50, 205, 50));
		btnsua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnsua.setBackground(new Color(0, 250, 154));
		
		JButton btnxoatrang = new JButton("XÓA TRẮNG");
		btnxoatrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoaTrang();
			}
		});
		btnxoatrang.setBounds(680, 193, 123, 42);
		pnlNhapThongTinNCC.add(btnxoatrang);
		btnxoatrang.setForeground(new Color(50, 205, 50));
		btnxoatrang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnxoatrang.setBackground(new Color(0, 250, 154));
		
		JLabel lblMaNCC = new JLabel("Mã nhà cung cấp");
		lblMaNCC.setBounds(47, 10, 145, 51);
		pnlNhapThongTinNCC.add(lblMaNCC);
		lblMaNCC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtMaNCC = new JTextField();
		txtMaNCC.setBounds(197, 13, 240, 51);
		txtMaNCC.setEditable(false);
		txtMaNCC.setText(taoMa());
		pnlNhapThongTinNCC.add(txtMaNCC);
		txtMaNCC.setColumns(10);
		
		JLabel lblDiachi = new JLabel("Địa chỉ");
		lblDiachi.setBounds(500, 10, 145, 51);
		pnlNhapThongTinNCC.add(lblDiachi);
		lblDiachi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtDiachi = new JTextField();
		txtDiachi.setBounds(618, 13, 240, 51);
		pnlNhapThongTinNCC.add(txtDiachi);
		txtDiachi.setColumns(10);
		
		JLabel lblTenNCC = new JLabel("Tên nhà cung cấp");
		lblTenNCC.setBounds(47, 105, 151, 51);
		pnlNhapThongTinNCC.add(lblTenNCC);
		lblTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtTenNCC = new JTextField();
		txtTenNCC.setBounds(197, 108, 240, 51);
		pnlNhapThongTinNCC.add(txtTenNCC);
		txtTenNCC.setColumns(10);
		
		JLabel lblSdt = new JLabel("Số điện thoại");
		lblSdt.setBounds(499, 105, 145, 51);
		pnlNhapThongTinNCC.add(lblSdt);
		lblSdt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtSdt = new JTextField();
		txtSdt.setBounds(618, 108, 240, 51);
		pnlNhapThongTinNCC.add(txtSdt);
		txtSdt.setColumns(10);
		
		JLabel lblDanhSchNh = new JLabel("Danh sách nhà cung cấp");
		lblDanhSchNh.setForeground(new Color(135, 206, 235));
		lblDanhSchNh.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblDanhSchNh.setBounds(75, 372, 256, 49);
		add(lblDanhSchNh);
		updateData();

	}
	public void themNhaCC() {
		DAO_NhaCungCap NhaCC_dao = new DAO_NhaCungCap();
		String maNCC = txtMaNCC.getText().trim();
		String tenNCC = txtTenNCC.getText().trim();
		String diaChi = txtDiachi.getText().trim();
		int soDienThoai = Integer.parseInt(txtSdt.getText());
		NhaCungCap NCC = new NhaCungCap(maNCC,tenNCC,diaChi,soDienThoai) ;
		if(NhaCC_dao.create(NCC)) {
			Object [] data = {maNCC,tenNCC,diaChi,soDienThoai};
			modelThongTinNhaCungCap.addRow(data);
		}
	}
	
	public void updateData() {
		DAO_NhaCungCap dao= new DAO_NhaCungCap();
		List<NhaCungCap> list = dao.getAllNhaCungCap();
		for(NhaCungCap ncc : list) {
			Object [] data = {ncc.getMaNCC(),ncc.getTenNCC(),ncc.getDiaChi(),ncc.getsDT()};
			modelThongTinNhaCungCap.addRow(data);
		}
		
	}
	public void xoaTrang() {
		txtMaNCC.setText("");
		txtTenNCC.setText("");
		txtDiachi.setText("");
		txtSdt.setText("");
	}
	
	public void xoaNhaCungCap() {
		DAO_NhaCungCap dao = new DAO_NhaCungCap();
		int row = tblThongTinNhaCC.getSelectedRow();
		String maNCC = (String) tblThongTinNhaCC.getValueAt(row, 0);
		if(dao.delete(maNCC)) {
			modelThongTinNhaCungCap.removeRow(row);
		}

	}
	public void suaNhaCungCap() {
		DAO_NhaCungCap dao = new DAO_NhaCungCap();
		String maNCC = txtMaNCC.getText().trim();
		String tenNCC = txtTenNCC.getText().trim();
		String diaChi = txtDiachi.getText().trim();
		String soDienThoai = txtSdt.getText().trim();
		NhaCungCap NCC = new NhaCungCap(maNCC,tenNCC,diaChi,Integer.parseInt(soDienThoai)) ;
		if(dao.update(NCC)) {
			JOptionPane.showMessageDialog(this, "Sửa thành công");
			String [] data = {maNCC,tenNCC,diaChi,soDienThoai};
			modelThongTinNhaCungCap.addRow(data);
			int row = tblThongTinNhaCC.getSelectedRow();
			modelThongTinNhaCungCap.removeRow(row);
		}

	}
	public String taoMa() {

		DAO_NhaCungCap dao = new DAO_NhaCungCap();
		
		int n = dao.getAllNhaCungCap().size();
		if(n<9) {
		do {
			 n=n+1;
			
			ma = "NCC00" + String.valueOf(n);
			list = dao.getAllNhaCungCap();
		} while (list.contains(ma));
		
	}else if(n<99) {
		do {
			 n=n+1;
			
			ma = "NCC0" + String.valueOf(n);
			list = dao.getAllNhaCungCap();
		} while (list.contains(ma));
	}
	else if(n<999) {
		do {
			 n=n+1;
			
			ma = "NCC" + String.valueOf(n);
			list = dao.getAllNhaCungCap();
		} while (list.contains(ma));
	}
		return ma;
	}
}

