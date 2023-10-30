package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

import connect.ConnectDB;

import javax.swing.JScrollPane;

public class GUI_NhaCungCap extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMaNCC;
	private JTextField txtTenNCC;
	private JTextField txtDiachi;
	private JTextField txtSdt;
	private JTable tblThongTinNhaCC;

	
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
		
		JScrollPane scrThongTinNhaCungCap = new JScrollPane();
		scrThongTinNhaCungCap.setBounds(75, 415, 1126, 177);
		add(scrThongTinNhaCungCap);
		
		tblThongTinNhaCC = new JTable();
		scrThongTinNhaCungCap.setViewportView(tblThongTinNhaCC);
		tblThongTinNhaCC.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
			}
		));
		tblThongTinNhaCC.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JPanel pnlNhapThongTinNCC = new JPanel();
		pnlNhapThongTinNCC.setBounds(181, 79, 912, 267);
		add(pnlNhapThongTinNCC);
		pnlNhapThongTinNCC.setLayout(null);
		
		JButton btnthem = new JButton("THÊM");
		btnthem.setBounds(81, 193, 101, 42);
		pnlNhapThongTinNCC.add(btnthem);
		btnthem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnthem.setForeground(new Color(50, 205, 50));
		btnthem.setBackground(new Color(0, 250, 154));
		
		JButton btnxoa = new JButton("XÓA");
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
			}
		});
		btnsua.setForeground(new Color(50, 205, 50));
		btnsua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnsua.setBackground(new Color(0, 250, 154));
		
		JButton btnxoatrang = new JButton("XÓA TRẮNG");
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

	}
}

