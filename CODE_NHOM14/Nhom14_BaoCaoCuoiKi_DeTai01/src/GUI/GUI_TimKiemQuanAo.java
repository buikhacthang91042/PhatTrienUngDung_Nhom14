package GUI;

import javax.swing.JPanel;

import java.awt.Rectangle;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_TimKiemQuanAo extends JPanel {
	private JTextField txtTenQuanAo;

	
	public GUI_TimKiemQuanAo() {
		setBounds(new Rectangle(0, 0, 1308, 678));
		setBackground(new Color(0, 64, 64));
		setLayout(null);
		
		JPanel pnForm = new JPanel();
		pnForm.setBounds(71, 58, 1168, 200);
		add(pnForm);
		pnForm.setLayout(null);
		
		JLabel lblTenQuanAo = new JLabel("Tên quần áo");
		lblTenQuanAo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTenQuanAo.setBounds(79, 30, 225, 32);
		pnForm.add(lblTenQuanAo);
		
		txtTenQuanAo = new JTextField();
		txtTenQuanAo.setColumns(10);
		txtTenQuanAo.setBounds(353, 30, 225, 32);
		pnForm.add(txtTenQuanAo);
		
		JLabel lblHang = new JLabel("Hãng quần áo");
		lblHang.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblHang.setBounds(78, 84, 225, 32);
		pnForm.add(lblHang);
		
		JComboBox cboHang = new JComboBox();
		cboHang.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cboHang.setBounds(353, 84, 225, 32);
		pnForm.add(cboHang);
		
		JLabel lblLoaiQuanAo = new JLabel("Loại quần áo");
		lblLoaiQuanAo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblLoaiQuanAo.setBounds(79, 144, 225, 32);
		pnForm.add(lblLoaiQuanAo);
		
		JComboBox cboLoaiQuanAo = new JComboBox();
		cboLoaiQuanAo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cboLoaiQuanAo.setBounds(354, 144, 225, 32);
		pnForm.add(cboLoaiQuanAo);
		
		JLabel lblMaSP = new JLabel("Mã quần áo");
		lblMaSP.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMaSP.setBounds(691, 30, 225, 32);
		pnForm.add(lblMaSP);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTimKiem.setBackground(Color.ORANGE);
		btnTimKiem.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTimKiem.setBounds(691, 117, 180, 30);
		pnForm.add(btnTimKiem);
		
		JComboBox cboMaQuanAo = new JComboBox();
		cboMaQuanAo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cboMaQuanAo.setBounds(856, 30, 225, 32);
		pnForm.add(cboMaQuanAo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 313, 1232, 322);
		add(scrollPane);
		
		JTable table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				 "Mã quần áo", "Tên quần áo", "Đơn giá", "Số lượng","Kích thước","Hãng quần áo"
				}
		));
		
		JLabel lblTieuDeTimKiemQuanAo = new JLabel("Tìm kiếm quần áo");
		lblTieuDeTimKiemQuanAo.setForeground(new Color(135, 206, 235));
		lblTieuDeTimKiemQuanAo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
		lblTieuDeTimKiemQuanAo.setBounds(463, 10, 295, 35);
		add(lblTieuDeTimKiemQuanAo);
		
		JLabel lblDanhSchQun = new JLabel("Danh sách quần áo");
		lblDanhSchQun.setForeground(new Color(135, 206, 235));
		lblDanhSchQun.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblDanhSchQun.setBounds(38, 278, 189, 35);
		add(lblDanhSchQun);

	}
}
