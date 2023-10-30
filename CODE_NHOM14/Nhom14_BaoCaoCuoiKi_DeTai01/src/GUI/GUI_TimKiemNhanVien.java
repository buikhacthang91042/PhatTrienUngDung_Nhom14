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
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class GUI_TimKiemNhanVien extends JPanel {
	private JTextField txtTenNV;
	private JTextField txtSdt;
	private JTextField txtNgayVaoLam;

	/**
	 * Create the panel.
	 */
	public GUI_TimKiemNhanVien() {
		setBounds(new Rectangle(0, 0, 1308, 678));
		setLayout(null);
		setBackground(new Color(0, 64, 64));
		JPanel pnForm = new JPanel();
		pnForm.setBounds(134, 56, 1019, 200);
		add(pnForm);
		pnForm.setLayout(null);
		
		JLabel lblTenNhanVien = new JLabel("Tên nhân viên");
		lblTenNhanVien.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTenNhanVien.setBounds(77, 35, 225, 32);
		pnForm.add(lblTenNhanVien);
		
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
		
		JLabel lblMaNV = new JLabel("Mã nhân viên");
		lblMaNV.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMaNV.setBounds(533, 96, 225, 32);
		pnForm.add(lblMaNV);
		
		JLabel lblNgayVaoLam = new JLabel("Ngày vào làm");
		lblNgayVaoLam.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNgayVaoLam.setBounds(77, 155, 225, 32);
		pnForm.add(lblNgayVaoLam);
		
		txtNgayVaoLam = new JTextField();
		txtNgayVaoLam.setColumns(10);
		txtNgayVaoLam.setBounds(217, 155, 225, 32);
		pnForm.add(txtNgayVaoLam);
		
		JLabel lblGioiTinh = new JLabel("Giới tính");
		lblGioiTinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGioiTinh.setBounds(533, 35, 90, 32);
		pnForm.add(lblGioiTinh);
		
		JComboBox cboGioiTinh = new JComboBox();
		cboGioiTinh.addItem("Nam");
		cboGioiTinh.addItem("Nữ");
		cboGioiTinh.setBounds(672, 35, 225, 32);
		pnForm.add(cboGioiTinh);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setForeground(UIManager.getColor("Button.light"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(102, 102, 255));
		btnNewButton.setBounds(673, 155, 180, 32);
		pnForm.add(btnNewButton);
		
		JComboBox cboMaNhanVien = new JComboBox();
		cboMaNhanVien.setBounds(672, 96, 225, 32);
		pnForm.add(cboMaNhanVien);
		
		JScrollPane scrThongTinNhanVien = new JScrollPane();
		scrThongTinNhanVien.setBounds(54, 341, 1195, 310);
		add(scrThongTinNhanVien);
		
		JTable tblThongTinNhanVien = new JTable();
		tblThongTinNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrThongTinNhanVien.setViewportView(tblThongTinNhanVien);
		tblThongTinNhanVien.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Giới tính", "Ngày vào làm"}
		));
		
		JLabel lblTieuDe = new JLabel("Tìm kiếm nhân viên");
		lblTieuDe.setForeground(new Color(135, 206, 235));
		lblTieuDe.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblTieuDe.setBounds(527, 10, 224, 50);
		add(lblTieuDe);
		
		JLabel lblTieuDeThongTin = new JLabel("Danh sách nhân viên");
		lblTieuDeThongTin.setForeground(new Color(135, 206, 235));
		lblTieuDeThongTin.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblTieuDeThongTin.setBounds(50, 295, 224, 50);
		add(lblTieuDeThongTin);

	}
}
