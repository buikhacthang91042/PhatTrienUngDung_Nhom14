package GUI;

import javax.swing.JPanel;

import DAO.DAO_LoaiQuanAo;
import DAO.DAO_NhaCungCap;
import connect.ConnectDB;
import entity.LoaiQuanAo;
import entity.NhaCungCap;

import java.awt.Rectangle;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class GUI_ThongKeDoanhThu extends JPanel {
	JComboBox cboLoaiQuanAo,cboNhaCungCap;

	public GUI_ThongKeDoanhThu() {
		setBackground(new Color(0, 64, 64));
		setBounds(new Rectangle(0, 0, 1308, 678));
		setLayout(null);
		
		//ConnectDB
 		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel pnForm = new JPanel();
		pnForm.setLayout(null);
		pnForm.setBackground(SystemColor.controlHighlight);
		pnForm.setBounds(10, 20, 1288, 260);
		add(pnForm);
		
		JLabel lblLoaiThoiGian = new JLabel("Loại thời gian");
		lblLoaiThoiGian.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblLoaiThoiGian.setBounds(72, 31, 225, 32);
		pnForm.add(lblLoaiThoiGian);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox.setBounds(312, 31, 225, 32);
		pnForm.add(comboBox);
		
		JLabel lblNgayBatDau = new JLabel("Ngày bắt đầu");
		lblNgayBatDau.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNgayBatDau.setBounds(72, 90, 225, 32);
		pnForm.add(lblNgayBatDau);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_1.setBounds(312, 91, 225, 32);
		pnForm.add(comboBox_1);
		
		JLabel lblNgayKetThuc = new JLabel("Ngày kết thúc");
		lblNgayKetThuc.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNgayKetThuc.setBounds(72, 152, 225, 32);
		pnForm.add(lblNgayKetThuc);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_2.setBounds(312, 156, 225, 32);
		pnForm.add(comboBox_2);
		
		JLabel lblLoaiQuanAo = new JLabel("Loại quần áo");
		lblLoaiQuanAo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblLoaiQuanAo.setBounds(773, 34, 223, 32);
		pnForm.add(lblLoaiQuanAo);
		
		cboLoaiQuanAo = new JComboBox();
		cboLoaiQuanAo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cboLoaiQuanAo.setBounds(1003, 31, 225, 32);
		pnForm.add(cboLoaiQuanAo);
		
		JLabel lblHangQuanAo = new JLabel("Hãng quần áo");
		lblHangQuanAo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblHangQuanAo.setBounds(773, 94, 225, 32);
		pnForm.add(lblHangQuanAo);
		
		cboNhaCungCap = new JComboBox();
		cboNhaCungCap.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cboNhaCungCap.setBounds(1003, 91, 225, 32);
		pnForm.add(cboNhaCungCap);
		
		JButton btnTmKim = new JButton("THỐNG KÊ");
		btnTmKim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTmKim.setFont(new Font("Arial", Font.PLAIN, 20));
		btnTmKim.setForeground(Color.WHITE);
		btnTmKim.setBackground(new Color(0, 64, 0));
		btnTmKim.setBounds(773, 167, 200, 45);
		pnForm.add(btnTmKim);
		
		JPanel pnSoLieu = new JPanel();
		pnSoLieu.setLayout(null);
		pnSoLieu.setBackground(SystemColor.controlHighlight);
		pnSoLieu.setBounds(0, 290, 1308, 147);
		add(pnSoLieu);
		
		JLabel lblHienThiDoanhThu = new JLabel("0");
		lblHienThiDoanhThu.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblHienThiDoanhThu.setAlignmentX(0.5f);
		lblHienThiDoanhThu.setBounds(91, 50, 150, 30);
		pnSoLieu.add(lblHienThiDoanhThu);
		
		JLabel lblDoanhThu = new JLabel("Doanh Thu");
		lblDoanhThu.setForeground(SystemColor.controlDkShadow);
		lblDoanhThu.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDoanhThu.setBounds(91, 90, 140, 30);
		pnSoLieu.add(lblDoanhThu);
		
		JLabel lblHienThiGiaVon = new JLabel("0");
		lblHienThiGiaVon.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblHienThiGiaVon.setAlignmentX(0.5f);
		lblHienThiGiaVon.setBounds(547, 50, 150, 30);
		pnSoLieu.add(lblHienThiGiaVon);
		
		JLabel lblGiaVon = new JLabel("Tổng giá vốn");
		lblGiaVon.setForeground(SystemColor.controlDkShadow);
		lblGiaVon.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblGiaVon.setBounds(547, 90, 140, 30);
		pnSoLieu.add(lblGiaVon);
		
		JLabel lblHienThiLoiNhuan = new JLabel("0");
		lblHienThiLoiNhuan.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblHienThiLoiNhuan.setAlignmentX(0.5f);
		lblHienThiLoiNhuan.setBounds(1100, 50, 150, 30);
		pnSoLieu.add(lblHienThiLoiNhuan);
		
		JLabel lblLoiNhuan = new JLabel("Lợi nhuận");
		lblLoiNhuan.setForeground(SystemColor.controlDkShadow);
		lblLoiNhuan.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLoiNhuan.setBounds(1100, 90, 140, 30);
		pnSoLieu.add(lblLoiNhuan);
		
		updateComboLoaiQuanAo();
		updateComboNhaCungCap();
	}
	 public void updateComboLoaiQuanAo() {
			DAO_LoaiQuanAo dao = new DAO_LoaiQuanAo();
			for(LoaiQuanAo loai : dao.getAllLoaiQuanAo()) {
				cboLoaiQuanAo.addItem(loai.getTenLoai());
			}
		}
		
		public void updateComboNhaCungCap() {
			DAO_NhaCungCap dao = new DAO_NhaCungCap();
			for(NhaCungCap loai : dao.getAllNhaCungCap()) {
				cboNhaCungCap.addItem(loai.getTenNCC());
			}
		}
}
