package GUI;


import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


import DAO.DAO_NhaCungCap;
import connect.ConnectDB;

import entity.NhaCungCap;

import javax.swing.DefaultComboBoxModel;

public class GUI_TimKiemNhaCungCap extends JPanel {
	private JTextField txtTenNV;
	private JTextField txtSdt;
	private JTextField txtMaNV;
	private JComboBox cboMaNhaCungCap;
	private DefaultTableModel modelTimKiemNhaCC;
	private JTable tblNhaCC;
	public GUI_TimKiemNhaCungCap() {
		setBounds(new Rectangle(0, 0, 1308, 678));
		setLayout(null);
		setBackground(new Color(0, 64, 64));
		JPanel pnForm = new JPanel();
		pnForm.setBounds(134, 56, 1019, 200);
		add(pnForm);
		pnForm.setLayout(null);
		
		//ConnectDB
 		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel lblTenNhaCungCap = new JLabel("Tên nhà cung cấp");
		lblTenNhaCungCap.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTenNhaCungCap.setBounds(77, 35, 225, 32);
		pnForm.add(lblTenNhaCungCap);
		
		txtTenNV = new JTextField();
		txtTenNV.setColumns(10);
		txtTenNV.setBounds(217, 35, 225, 32);
		pnForm.add(txtTenNV);
		
		JLabel lblSdt = new JLabel("Số điện thoại");
		lblSdt.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSdt.setBounds(77, 96, 225, 32);
		pnForm.add(lblSdt);
		
		txtSdt = new JTextField();
		txtSdt.setColumns(10);
		txtSdt.setBounds(217, 96, 225, 32);
		pnForm.add(txtSdt);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDiaChi.setBounds(533, 96, 225, 32);
		pnForm.add(lblDiaChi);
		
		txtMaNV = new JTextField();
		txtMaNV.setColumns(10);
		txtMaNV.setBounds(673, 96, 225, 32);
		pnForm.add(txtMaNV);
		
		JLabel lblMaNhaCungCap = new JLabel("Mã nhà cung cấp");
		lblMaNhaCungCap.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaNhaCungCap.setBounds(533, 35, 129, 32);
		pnForm.add(lblMaNhaCungCap);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setForeground(UIManager.getColor("Button.light"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(102, 102, 255));
		btnNewButton.setBounds(673, 158, 180, 32);
		pnForm.add(btnNewButton);
		
		cboMaNhaCungCap = new JComboBox();
		cboMaNhaCungCap.setBounds(673, 43, 85, 21);
		pnForm.add(cboMaNhaCungCap);
		
			String[] tieude = {
				"Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"};
				
		modelTimKiemNhaCC = new DefaultTableModel(tieude,0);
		JScrollPane scrThongTinNhaCC = new JScrollPane();
		scrThongTinNhaCC.setBounds(54, 341, 1195, 310);
		add(scrThongTinNhaCC);
			
		scrThongTinNhaCC.setViewportView(tblNhaCC = new  JTable(modelTimKiemNhaCC));
		scrThongTinNhaCC.setViewportView(tblNhaCC);
		
		JLabel lblTieuDe = new JLabel("Tìm kiếm nhà cung cấp");
		lblTieuDe.setForeground(new Color(135, 206, 235));
		lblTieuDe.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblTieuDe.setBounds(527, 10, 224, 50);
		add(lblTieuDe);
		
		JLabel lblTieuDeThongTin = new JLabel("Danh sách nhà cung cấp");
		lblTieuDeThongTin.setForeground(new Color(135, 206, 235));
		lblTieuDeThongTin.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblTieuDeThongTin.setBounds(51, 295, 245, 50);
		add(lblTieuDeThongTin);
		
		updateComboMaNhaCungCap();
	}
	public void updateComboMaNhaCungCap() {
		DAO_NhaCungCap dao = new DAO_NhaCungCap();
		for(NhaCungCap loai : dao.getAllNhaCungCap()) {
			cboMaNhaCungCap.addItem(loai.getMaNCC());
		}
	}
}
