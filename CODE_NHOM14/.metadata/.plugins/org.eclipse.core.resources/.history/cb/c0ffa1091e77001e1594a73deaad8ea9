package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_QuanLiKhachHang extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMakhachhang;
	private JTextField txtHoten;
	private JTextField txtStd;
	private JTextField txtNamsinh;
	private JTable tblThongTinKhachHang;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public GUI_QuanLiKhachHang() {
		setLayout(null);
		setBackground(new Color(0, 64, 64));
		JLabel lblTieuDe = new JLabel("Quản lí khách hàng");
		lblTieuDe.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
		lblTieuDe.setForeground(new Color(135, 206, 235));
		lblTieuDe.setBounds(472, 11, 362, 80);
		add(lblTieuDe);
		
		String gioiTinh[]= {"Nam","Nữ"};
		
		JScrollPane scrThongTinKhachHang = new JScrollPane();
		scrThongTinKhachHang.setBounds(82, 386, 1116, 202);
		add(scrThongTinKhachHang);
		
		tblThongTinKhachHang = new JTable();
		scrThongTinKhachHang.setViewportView(tblThongTinKhachHang);
		tblThongTinKhachHang.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Mã khách hàng", "Họ và tên", "Số điện thoại", "Năm sinh", "Giới tính"
			}
		));
		
		JPanel pnlNhapThongTinKhachHang = new JPanel();
		pnlNhapThongTinKhachHang.setBounds(103, 87, 1066, 244);
		add(pnlNhapThongTinKhachHang);
		pnlNhapThongTinKhachHang.setLayout(null);
		
		JLabel lblMakhachhang = new JLabel("Mã khách hàng");
		lblMakhachhang.setBounds(45, 28, 142, 22);
		pnlNhapThongTinKhachHang.add(lblMakhachhang);
		lblMakhachhang.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		txtMakhachhang = new JTextField();
		txtMakhachhang.setBounds(217, 24, 245, 26);
		pnlNhapThongTinKhachHang.add(txtMakhachhang);
		txtMakhachhang.setColumns(10);
		
		JLabel lblHoten = new JLabel("Họ và tên");
		lblHoten.setBounds(45, 64, 108, 37);
		pnlNhapThongTinKhachHang.add(lblHoten);
		lblHoten.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		txtHoten = new JTextField();
		txtHoten.setBounds(217, 70, 245, 26);
		pnlNhapThongTinKhachHang.add(txtHoten);
		txtHoten.setColumns(10);
		
		JLabel lblSodienthoai = new JLabel("Số điện thoại");
		lblSodienthoai.setBounds(45, 115, 144, 32);
		pnlNhapThongTinKhachHang.add(lblSodienthoai);
		lblSodienthoai.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		txtStd = new JTextField();
		txtStd.setBounds(217, 118, 245, 26);
		pnlNhapThongTinKhachHang.add(txtStd);
		txtStd.setColumns(10);
		
		JLabel lblNamsinh = new JLabel("Năm sinh");
		lblNamsinh.setBounds(632, 19, 98, 41);
		pnlNhapThongTinKhachHang.add(lblNamsinh);
		lblNamsinh.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		txtNamsinh = new JTextField();
		txtNamsinh.setBounds(755, 24, 245, 26);
		pnlNhapThongTinKhachHang.add(txtNamsinh);
		txtNamsinh.setColumns(10);
		
		JLabel lblGioitinh = new JLabel("Giới tính");
		lblGioitinh.setBounds(632, 62, 98, 41);
		pnlNhapThongTinKhachHang.add(lblGioitinh);
		lblGioitinh.setFont(new Font("Tahoma", Font.BOLD, 18));
		JComboBox cmbGioitinh = new JComboBox(gioiTinh);
		cmbGioitinh.setBounds(755, 68, 98, 26);
		pnlNhapThongTinKhachHang.add(cmbGioitinh);
		cmbGioitinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmbGioitinh.setToolTipText("");
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setBounds(632, 115, 144, 32);
		pnlNhapThongTinKhachHang.add(lblDiaChi);
		lblDiaChi.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setBounds(755, 120, 245, 26);
		pnlNhapThongTinKhachHang.add(textField);
		textField.setColumns(10);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(75, 185, 171, 49);
		pnlNhapThongTinKhachHang.add(btnThem);
		btnThem.setForeground(new Color(0, 255, 0));
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(307, 185, 171, 49);
		pnlNhapThongTinKhachHang.add(btnXoa);
		btnXoa.setForeground(Color.GREEN);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setBounds(559, 185, 171, 49);
		pnlNhapThongTinKhachHang.add(btnSua);
		btnSua.setForeground(Color.GREEN);
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnXoatrang = new JButton("Xóa trắng");
		btnXoatrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoatrang.setBounds(801, 185, 171, 49);
		pnlNhapThongTinKhachHang.add(btnXoatrang);
		btnXoatrang.setForeground(Color.GREEN);
		btnXoatrang.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblDanhSachKhachHang = new JLabel("Danh sách khách hàng");
		lblDanhSachKhachHang.setForeground(new Color(135, 206, 235));
		lblDanhSachKhachHang.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblDanhSachKhachHang.setBounds(81, 341, 231, 55);
		add(lblDanhSachKhachHang);
		
		
	}
}

