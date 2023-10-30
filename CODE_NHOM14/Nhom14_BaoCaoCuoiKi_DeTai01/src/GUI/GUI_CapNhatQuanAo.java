package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class GUI_CapNhatQuanAo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTenquanao;
	private JTextField txtDongia;
	private JTextField txtSoluong;
	private JTable table;
	private JTextField txtTiemkiem;

	/**
	 * Create the panel.
	 */
	public GUI_CapNhatQuanAo() {
		setLayout(null);
		setBackground(new Color(0, 64, 64));
		JLabel lblTieude = new JLabel("Quản lí quần áo ");
		lblTieude.setForeground(new Color(135, 206, 235));
		lblTieude.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
		lblTieude.setBounds(518, 0, 277, 50);
		add(lblTieude);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 408, 1139, 249);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Tên quàn áo", "Giá ", "Số lượng", "Loại sản phẩm", "Kích thước", "Nhà cung cấp"
			}
		));
		
		JPanel pnlThongTinQuanAo = new JPanel();
		pnlThongTinQuanAo.setBounds(167, 57, 979, 311);
		add(pnlThongTinQuanAo);
		pnlThongTinQuanAo.setLayout(null);
		
		JLabel lblTenquanao = new JLabel("Tên quần áo ");
		lblTenquanao.setBounds(54, 75, 118, 25);
		pnlThongTinQuanAo.add(lblTenquanao);
		lblTenquanao.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		txtTenquanao = new JTextField();
		txtTenquanao.setBounds(206, 73, 216, 37);
		pnlThongTinQuanAo.add(txtTenquanao);
		txtTenquanao.setColumns(10);
		
		JLabel lblDongia = new JLabel("Giá");
		lblDongia.setBounds(54, 130, 82, 37);
		pnlThongTinQuanAo.add(lblDongia);
		lblDongia.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		txtDongia = new JTextField();
		txtDongia.setBounds(206, 134, 216, 37);
		pnlThongTinQuanAo.add(txtDongia);
		txtDongia.setColumns(10);
		
		JLabel lblSoluong = new JLabel("Số lượng ");
		lblSoluong.setBounds(41, 191, 90, 37);
		pnlThongTinQuanAo.add(lblSoluong);
		lblSoluong.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		txtSoluong = new JTextField();
		txtSoluong.setBounds(206, 191, 216, 37);
		pnlThongTinQuanAo.add(txtSoluong);
		txtSoluong.setColumns(10);
		
		JLabel lblDanhmuc = new JLabel("Loại quần áo ");
		lblDanhmuc.setBounds(575, 69, 127, 37);
		pnlThongTinQuanAo.add(lblDanhmuc);
		lblDanhmuc.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		JComboBox cmbDanhmuc = new JComboBox();
		cmbDanhmuc.setBounds(733, 75, 170, 33);
		pnlThongTinQuanAo.add(cmbDanhmuc);
		
		JLabel lblKichco = new JLabel("Kích thước");
		lblKichco.setBounds(575, 130, 124, 37);
		pnlThongTinQuanAo.add(lblKichco);
		lblKichco.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		JComboBox cmbKichco = new JComboBox();
		cmbKichco.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL", "2XL"}));
		cmbKichco.setBounds(733, 130, 170, 33);
		pnlThongTinQuanAo.add(cmbKichco);
		
		JLabel lblNCC = new JLabel("Nhà cung cấp");
		lblNCC.setBounds(575, 191, 141, 37);
		pnlThongTinQuanAo.add(lblNCC);
		lblNCC.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		JComboBox cmbNCC = new JComboBox();
		cmbNCC.setBounds(733, 197, 170, 33);
		pnlThongTinQuanAo.add(cmbNCC);
		
		JButton btnThem = new JButton("THÊM");
		btnThem.setBounds(175, 264, 113, 37);
		pnlThongTinQuanAo.add(btnThem);
		btnThem.setForeground(new Color(60, 179, 113));
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnXoa = new JButton("XÓA");
		btnXoa.setBounds(322, 264, 113, 37);
		pnlThongTinQuanAo.add(btnXoa);
		btnXoa.setForeground(new Color(60, 179, 113));
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnSua = new JButton("SỬA");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSua.setBounds(475, 264, 113, 37);
		pnlThongTinQuanAo.add(btnSua);
		btnSua.setForeground(new Color(60, 179, 113));
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnXoatrang = new JButton("XÓA TRẮNG");
		btnXoatrang.setBounds(628, 264, 152, 37);
		pnlThongTinQuanAo.add(btnXoatrang);
		btnXoatrang.setForeground(new Color(60, 179, 113));
		btnXoatrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTimkiemquanao = new JLabel("Tìm kiếm quần áo");
		lblTimkiemquanao.setBounds(230, 21, 188, 25);
		pnlThongTinQuanAo.add(lblTimkiemquanao);
		lblTimkiemquanao.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		txtTiemkiem = new JTextField();
		txtTiemkiem.setBounds(417, 19, 204, 33);
		pnlThongTinQuanAo.add(txtTiemkiem);
		txtTiemkiem.setColumns(10);
		
		JButton btnTimkiem = new JButton("");
		btnTimkiem.setSelectedIcon(new ImageIcon(GUI_CapNhatQuanAo.class.getResource("/Image/icon_TimKiem.png")));
		btnTimkiem.setBounds(632, 18, 46, 33);
		pnlThongTinQuanAo.add(btnTimkiem);
		btnTimkiem.setIcon(new ImageIcon(GUI_CapNhatQuanAo.class.getResource("/Image/icon_TimKiem.png")));
		
		JLabel lblDanhSchQun = new JLabel("Danh sách quần áo");
		lblDanhSchQun.setForeground(new Color(135, 206, 235));
		lblDanhSchQun.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblDanhSchQun.setBounds(75, 378, 199, 37);
		add(lblDanhSchQun);

	}
}

