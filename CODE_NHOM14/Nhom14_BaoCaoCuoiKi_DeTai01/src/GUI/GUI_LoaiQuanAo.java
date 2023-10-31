package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import DAO.DAO_LoaiQuanAo;
import connect.ConnectDB;
import entity.LoaiQuanAo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_LoaiQuanAo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTenquanao;
	private JTable tblLoaiQuanAo;
	private JTextField txtTiemkiem;
	private JTextField txtMaLoaiQuanAo;
	public DefaultTableModel modelLoaiQuanAo;
	private String ma;
	private List<LoaiQuanAo> listLoai;
	public GUI_LoaiQuanAo() {
		setLayout(null);
		setBackground(new Color(0, 64, 64));
		JLabel lblTieude = new JLabel("Loại quần áo ");
		lblTieude.setForeground(new Color(135, 206, 235));
		lblTieude.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
		lblTieude.setBounds(518, 0, 277, 50);
		add(lblTieude);
		
		//ConnectDB
 		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		String [] tieude={"Mã loại quần áo","Tên loại quần áo"};
 		modelLoaiQuanAo = new DefaultTableModel(tieude,0);
 		JScrollPane scrThongTinLoaiQuanAo = new JScrollPane();
 		
 		scrThongTinLoaiQuanAo.setBounds(75, 382, 1139, 249);
		add(scrThongTinLoaiQuanAo);
		
		scrThongTinLoaiQuanAo.setViewportView(tblLoaiQuanAo = new  JTable(modelLoaiQuanAo));
		scrThongTinLoaiQuanAo.setViewportView(tblLoaiQuanAo);
		tblLoaiQuanAo.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent e) {
 				int row = tblLoaiQuanAo.getSelectedRow();
 				txtMaLoaiQuanAo.setText(tblLoaiQuanAo.getValueAt(row, 0).toString());
 				txtTenquanao.setText(tblLoaiQuanAo.getValueAt(row, 1).toString());
 				
 			}
 		});
		JPanel pnlThongTinQuanAo = new JPanel();
		pnlThongTinQuanAo.setBounds(167, 57, 912, 257);
		add(pnlThongTinQuanAo);
		pnlThongTinQuanAo.setLayout(null);
		
		JLabel lblTenLoaiQuanAo = new JLabel("Tên loại quần áo ");
		lblTenLoaiQuanAo.setBounds(477, 102, 170, 25);
		pnlThongTinQuanAo.add(lblTenLoaiQuanAo);
		lblTenLoaiQuanAo.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		txtTenquanao = new JTextField();
		txtTenquanao.setBounds(644, 100, 216, 37);
		pnlThongTinQuanAo.add(txtTenquanao);
		txtTenquanao.setColumns(10);
		
		JLabel lblMaLoaiQuanAo = new JLabel("Mã loại quần áo ");
		lblMaLoaiQuanAo.setBounds(26, 100, 159, 37);
		pnlThongTinQuanAo.add(lblMaLoaiQuanAo);
		lblMaLoaiQuanAo.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		//Thêm quần áo
		JButton btnThem = new JButton("THÊM");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaLoaiQuanAo.setText(taoMa());
				themQuanAo();			
				
			}
		});
		btnThem.setBounds(119, 181, 113, 37);
		pnlThongTinQuanAo.add(btnThem);
		btnThem.setForeground(new Color(60, 179, 113));
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnXoa = new JButton("XÓA");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoaLoaiQuanAo();
			
			}
		});
		btnXoa.setBounds(273, 181, 113, 37);
		pnlThongTinQuanAo.add(btnXoa);
		btnXoa.setForeground(new Color(60, 179, 113));
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnSua = new JButton("SỬA");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				suaLoaiQuanAo();
			}
		});
		btnSua.setBounds(436, 181, 113, 37);
		pnlThongTinQuanAo.add(btnSua);
		btnSua.setForeground(new Color(60, 179, 113));
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnXoatrang = new JButton("XÓA TRẮNG");
		btnXoatrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoaTrang();
			}
		});
		btnXoatrang.setBounds(603, 181, 152, 37);
		pnlThongTinQuanAo.add(btnXoatrang);
		btnXoatrang.setForeground(new Color(60, 179, 113));
		btnXoatrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTimKiemQuanAo = new JLabel("Tìm kiếm theo tên");
		lblTimKiemQuanAo.setBounds(211, 22, 196, 25);
		pnlThongTinQuanAo.add(lblTimKiemQuanAo);
		lblTimKiemQuanAo.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		txtTiemkiem = new JTextField();
		txtTiemkiem.setBounds(417, 19, 204, 33);
		pnlThongTinQuanAo.add(txtTiemkiem);
		txtTiemkiem.setColumns(10);
		
		JButton btnTimkiem = new JButton("");
		btnTimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timKiemLoaiQuanAo();
			}
		});
		btnTimkiem.setSelectedIcon(new ImageIcon(GUI_CapNhatQuanAo.class.getResource("/Image/icon_TimKiem.png")));
		btnTimkiem.setBounds(632, 18, 46, 33);
		pnlThongTinQuanAo.add(btnTimkiem);
		btnTimkiem.setIcon(new ImageIcon(GUI_CapNhatQuanAo.class.getResource("/Image/icon_TimKiem.png")));
		
		txtMaLoaiQuanAo = new JTextField();
		txtMaLoaiQuanAo.setColumns(10);
		txtMaLoaiQuanAo.setBounds(195, 100, 216, 37);
		txtMaLoaiQuanAo.setEditable(false);
		txtMaLoaiQuanAo.setText(taoMa());
		pnlThongTinQuanAo.add(txtMaLoaiQuanAo);
		
		JLabel lblDanhSachLoaiQuanAo = new JLabel("Danh sách loại quần áo");
		lblDanhSachLoaiQuanAo.setForeground(new Color(135, 206, 235));
		lblDanhSachLoaiQuanAo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblDanhSachLoaiQuanAo.setBounds(75, 349, 234, 37);
		add(lblDanhSachLoaiQuanAo);
		updateData();
	
	}
	
	public void themQuanAo() {
		DAO_LoaiQuanAo loaiQuanAo_dao = new DAO_LoaiQuanAo();
		String maLoai = txtMaLoaiQuanAo.getText().trim();
		String tenLoai = txtTenquanao.getText().trim();
		LoaiQuanAo loaiQuanAo = new LoaiQuanAo(maLoai, tenLoai);
		if(loaiQuanAo_dao.create(loaiQuanAo)) {
			Object [] data = {maLoai,tenLoai};
			modelLoaiQuanAo.addRow(data);
		}
	}
	
	public void updateData() {
		DAO_LoaiQuanAo dao= new DAO_LoaiQuanAo();
		List<LoaiQuanAo> list = dao.getAllLoaiQuanAo();
		for(LoaiQuanAo lqa : list) {
			Object [] data = {lqa.getMaLoai(),lqa.getTenLoai()};
			modelLoaiQuanAo.addRow(data);
		}
		
	}
	public void xoaTrang() {
		txtMaLoaiQuanAo.setText("");
		txtTenquanao.setText("");
		txtTiemkiem.setText("");
	}
	
	public void xoaLoaiQuanAo() {
		DAO_LoaiQuanAo dao = new DAO_LoaiQuanAo();
		int row = tblLoaiQuanAo.getSelectedRow();
		String maQuanAo = (String) tblLoaiQuanAo.getValueAt(row, 0);
		if(dao.delete(maQuanAo)) {
			modelLoaiQuanAo.removeRow(row);
		}

	}
	public void suaLoaiQuanAo() {
		DAO_LoaiQuanAo dao = new DAO_LoaiQuanAo();
		String maLoai= txtMaLoaiQuanAo.getText();
		String tenLoai= txtTenquanao.getText();
		LoaiQuanAo loai = new LoaiQuanAo(maLoai,tenLoai);
		if(dao.suaLoaiQuanAo(loai)) {
			JOptionPane.showMessageDialog(this, "Sửa thành công");
			String [] data = {maLoai,tenLoai};
			modelLoaiQuanAo.addRow(data);
			int row = tblLoaiQuanAo.getSelectedRow();
			modelLoaiQuanAo.removeRow(row);
		}

	}
	
	public void timKiemLoaiQuanAo() {
		DAO_LoaiQuanAo dao = new DAO_LoaiQuanAo();
		List<LoaiQuanAo> list = dao.timTheoTen(txtTiemkiem.getText());
		modelLoaiQuanAo.getDataVector().removeAllElements();
		for (LoaiQuanAo l : list) {
			Object[] data = {l.getMaLoai(),l.getTenLoai()};
			modelLoaiQuanAo.addRow(data);

	}

	}
	public String taoMa() {

		DAO_LoaiQuanAo dao = new DAO_LoaiQuanAo();
		
		int n = dao.getAllLoaiQuanAo().size();
		if(n<9) {
		do {
			 n=n+1;
			
			ma = "ML00" + String.valueOf(n);
			listLoai = dao.getAllLoaiQuanAo();
		} while (listLoai.contains(ma));
		}else {
			do {
				 n=n+1;
				
				ma = "ML0" + String.valueOf(n);
				listLoai = dao.getAllLoaiQuanAo();
			} while (listLoai.contains(ma));
		}
		return ma;
	}

	
	}




