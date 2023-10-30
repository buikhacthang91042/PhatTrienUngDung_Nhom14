package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GUI_DatHangTruoc extends JPanel{
	private JTextField txtTimKiemDonHang;
	private JTable table;
	private JTextField txtTenKhachHang;
	private JTextField txtSoDienThoai;
	private JTextField textField;
	private JTextField txtTongTien;


    public GUI_DatHangTruoc() {
    	setBounds(new Rectangle(0, 0, 1308, 678));
    	setLayout(null);
        setBackground(new Color(0, 64, 64));
        JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 92, 1265, 416);
		add(scrollPane);
		
		table = new JTable();
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
				 "Mã hóa đơn", "Mã quần áo", "Tên khách hàng", "Mã nhân viên","Tên quần áo","Thành tiền"
				}
		));
		
		JLabel lblDanhSachDonHangDatTruoc = new JLabel("Danh sách đơn hàng đặt trước");
		lblDanhSachDonHangDatTruoc.setForeground(new Color(135, 206, 235));
		lblDanhSachDonHangDatTruoc.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblDanhSachDonHangDatTruoc.setBounds(21, 60, 304, 32);
		add(lblDanhSachDonHangDatTruoc);
		
		JLabel lblTimKiemDonHang = new JLabel("Tìm kiếm đơn hàng");
		lblTimKiemDonHang.setForeground(new Color(135, 206, 235));
		lblTimKiemDonHang.setBounds(21, 518, 189, 32);
		add(lblTimKiemDonHang);
		lblTimKiemDonHang.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		
		txtTimKiemDonHang = new JTextField();
		txtTimKiemDonHang.setBounds(214, 518, 225, 32);
		add(txtTimKiemDonHang);
		txtTimKiemDonHang.setColumns(10);
		
		JButton btnTimKiemHoaDon = new JButton("TÌM");
		btnTimKiemHoaDon.setBackground(new Color(0, 64, 0));
		btnTimKiemHoaDon.setForeground(new Color(255, 255, 255));
		btnTimKiemHoaDon.setFont(new Font("Arial", Font.PLAIN, 20));
		btnTimKiemHoaDon.setBounds(449, 518, 104, 30);
		add(btnTimKiemHoaDon);
		
		JPanel pnlThongTinKhachHang = new JPanel();
		pnlThongTinKhachHang.setBounds(21, 560, 771, 108);
		add(pnlThongTinKhachHang);
		pnlThongTinKhachHang.setLayout(null);
		
		JLabel lblTenKhacHang = new JLabel("Tên khách hàng");
		lblTenKhacHang.setBounds(10, 10, 152, 24);
		lblTenKhacHang.setForeground(new Color(0, 0, 0));
		lblTenKhacHang.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		pnlThongTinKhachHang.add(lblTenKhacHang);
		
		txtTenKhachHang = new JTextField();
		txtTenKhachHang.setColumns(10);
		txtTenKhachHang.setBounds(141, 10, 225, 24);
		pnlThongTinKhachHang.add(txtTenKhachHang);
		
		JLabel lblSoDienThoai = new JLabel("Số điện thoại");
		lblSoDienThoai.setForeground(Color.BLACK);
		lblSoDienThoai.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSoDienThoai.setBounds(10, 44, 152, 24);
		pnlThongTinKhachHang.add(lblSoDienThoai);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(141, 44, 225, 24);
		pnlThongTinKhachHang.add(txtSoDienThoai);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setForeground(Color.BLACK);
		lblDiaChi.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblDiaChi.setBounds(10, 74, 152, 24);
		pnlThongTinKhachHang.add(lblDiaChi);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(141, 78, 225, 24);
		pnlThongTinKhachHang.add(textField);
		
		JLabel lblTongTien = new JLabel("Tổng tiền");
		lblTongTien.setForeground(new Color(255, 0, 0));
		lblTongTien.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblTongTien.setBounds(447, 10, 102, 29);
		pnlThongTinKhachHang.add(lblTongTien);
		
		txtTongTien = new JTextField();
		txtTongTien.setBounds(544, 15, 129, 19);
		pnlThongTinKhachHang.add(txtTongTien);
		txtTongTien.setColumns(10);
		
		JButton btnInThanhToan = new JButton("THANH TOÁN");
		btnInThanhToan.setBounds(457, 55, 180, 30);
		pnlThongTinKhachHang.add(btnInThanhToan);
		btnInThanhToan.setForeground(Color.WHITE);
		btnInThanhToan.setFont(new Font("Arial", Font.PLAIN, 20));
		btnInThanhToan.setBackground(new Color(0, 64, 0));
    }
}
