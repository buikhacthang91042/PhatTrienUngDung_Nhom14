/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main extends JFrame {
    private JPanel pnlThongTin;
    private JPanel pnlTieuDe;
    private JPanel pnlMenu;
    private JLabel lblTieuDe;
    private JPanel pnlNhanVien;
    private JMenuBar mnuNhanVien;
    private JMenu mnNhanVien;
    private JMenuItem mniBanHang,mniCapNhatNhanVien,mniTimKiemNhanVien,mniCapNhatQuanAo;
    private JPanel pnlKhachHang;
    private JMenuBar mnuKhachHang, mnuQuanAo;
    private JMenu mnKhachHang,mnQuanAo;
    private JPanel pnlQuanAo;
    private JMenuItem mniTimNhanVien;
    private JMenuItem mniTimKiemQuanAo;
    private JMenuItem mniTimKiemKhachHang;
    private JPanel pnlHoaDon;
    private JMenuBar mnuHoaDon;
    private JMenu mnHoaDon;
    private JMenuItem mniHoaDonBanHang;
    private JPanel pnlThongKe;
    private JMenuBar mnuThongKe;
    private JMenu mnThongKe;
    private JMenuItem mniDoanhThu;
    private JMenuItem mniTimKiemNhaCungCap;
    private JMenuItem mniDatHangTruoc;
    private JMenuItem mniLoaiQuanAo;
    
    public Main() {
    	setTitle("Cửa hàng quần áo thời trang");
    	setSize(new Dimension(871, 473));
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Import các GUI
        GUI_CapNhatNhanVien capNhatNhanVien = new GUI_CapNhatNhanVien();
        capNhatNhanVien.setBounds(0, 0, 1308, 710);
        GUI_TimKiemQuanAo timKiemQuanAo = new GUI_TimKiemQuanAo();
        timKiemQuanAo.setBounds(0, 0, 1308, 710);
        GUI_BanHang banHang = new GUI_BanHang();
        banHang.setBounds(0, 0, 1308, 710);
        GUI_NhaCungCap nhaCungCap= new GUI_NhaCungCap();
        nhaCungCap.setBounds(0, 0, 1308, 710);
        GUI_QuanLiKhachHang capNhatKhachHang = new GUI_QuanLiKhachHang();
        capNhatKhachHang.setBounds(0, 0, 1308, 710);
        GUI_CapNhatQuanAo capNhatQuanAo = new GUI_CapNhatQuanAo();
        capNhatQuanAo.setBounds(0, 0, 1308, 710);
        GUI_TimKiemNhanVien timKiemNhanVien = new GUI_TimKiemNhanVien();
        timKiemNhanVien.setBounds(0, 0, 1308, 710);
        GUI_TimKiemKhachHang timKiemKhachHang = new GUI_TimKiemKhachHang();
        timKiemKhachHang.setBounds(0, 0, 1308, 710);
        GUI_HoaDon danhSachHoaDon = new GUI_HoaDon();
        danhSachHoaDon.setBounds(0, 0, 1308, 710);
        GUI_ThongKeDoanhThu thongKeDoanhThu = new GUI_ThongKeDoanhThu();
        thongKeDoanhThu.setBounds(0, 0, 1308, 710);
        GUI_TimKiemNhaCungCap timKiemNhaCungCap = new GUI_TimKiemNhaCungCap();
        timKiemNhaCungCap.setBounds(0, 0, 1308, 710);
        GUI_DatHangTruoc datHangTruoc = new GUI_DatHangTruoc();
        datHangTruoc.setBounds(0, 0, 1308, 710);
        GUI_LoaiQuanAo loaiQuanAo = new GUI_LoaiQuanAo();
        loaiQuanAo.setBounds(0, 0, 1308, 710);;
        
        capNhatQuanAo.setVisible(false);
        capNhatNhanVien.setVisible(false);
        timKiemQuanAo.setVisible(false);
        banHang.setVisible(false);
        nhaCungCap.setVisible(false);
        capNhatKhachHang.setVisible(false);
        timKiemNhanVien.setVisible(false);
        timKiemKhachHang.setVisible(false);
        danhSachHoaDon.setVisible(false);
        thongKeDoanhThu.setVisible(false);
        timKiemNhaCungCap.setVisible(false);
        datHangTruoc.setVisible(false);
        loaiQuanAo.setVisible(false);
        
        
        //Tạo panel chứa các thông tin
        
        pnlThongTin = new JPanel();
        pnlThongTin.setBackground(Color.BLACK);
        getContentPane().add(pnlThongTin, BorderLayout.CENTER);
        pnlThongTin.setLayout(null);
        
        JLabel lblHinhNen = new JLabel("");
        lblHinhNen.setIcon(new ImageIcon(Main.class.getResource("/Image/img_TrangChu(1).jpg")));
        lblHinhNen.setBounds(0, 0, 1300, 740);
        pnlThongTin.add(lblHinhNen);
        pnlThongTin.add(capNhatNhanVien);
        pnlThongTin.add(timKiemQuanAo);
        pnlThongTin.add(banHang);
        pnlThongTin.add(nhaCungCap);
        pnlThongTin.add(capNhatKhachHang);
        pnlThongTin.add(capNhatQuanAo);
        pnlThongTin.add(timKiemNhanVien);
        pnlThongTin.add(timKiemKhachHang);
        pnlThongTin.add(danhSachHoaDon);
        pnlThongTin.add(thongKeDoanhThu);
        pnlThongTin.add(timKiemNhaCungCap);
        pnlThongTin.add(datHangTruoc);
        pnlThongTin.add(loaiQuanAo);
        
        //Panel tiêu đề
        pnlTieuDe = new JPanel();
        pnlTieuDe.setBackground(new Color(0, 0, 160));
        pnlTieuDe.setPreferredSize(new Dimension(561, 80));
	    pnlTieuDe.setLayout(null);
        
	    //Tạo tên Tiêu đề
        lblTieuDe = new JLabel("CỬA HÀNG QUẦN ÁO THỜI TRANG");
        lblTieuDe.setForeground(Color.GREEN);
        lblTieuDe.setBackground(new Color(0, 0, 0));
        lblTieuDe.setFont(new Font("Arial", Font.BOLD, 36));
        lblTieuDe.setBounds(500, 10, 700, 50);
        pnlTieuDe.add(lblTieuDe);
        getContentPane().add(pnlTieuDe, BorderLayout.NORTH);
        
        //Panel Menu bên trái
        pnlMenu = new JPanel();
        pnlMenu.setBackground(new Color(0, 0, 64));
        pnlMenu.setPreferredSize(new Dimension(250, 384));
        
       
        
        getContentPane().add(pnlMenu, BorderLayout.WEST);
        pnlMenu.setLayout(null);
        
        
        //Tên nhóm
        JLabel lblTenNhom = new JLabel("Nhóm 14");
        lblTenNhom.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		loaiQuanAo.setVisible(false);
        		datHangTruoc.setVisible(false);
        		timKiemNhaCungCap.setVisible(false);
        		thongKeDoanhThu.setVisible(false);
        		danhSachHoaDon.setVisible(false);
        		timKiemKhachHang.setVisible(false);
        		timKiemNhanVien.setVisible(false);
        		lblHinhNen.setVisible(true);
        		banHang.setVisible(false);
        		capNhatKhachHang.setVisible(false);
        		capNhatNhanVien.setVisible(false);
        		nhaCungCap.setVisible(false);
        		timKiemQuanAo.setVisible(false);
        	}
        });
        lblTenNhom.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
        lblTenNhom.setForeground(new Color(0, 255, 0));
        lblTenNhom.setBounds(51, 22, 146, 37);
        pnlMenu.add(lblTenNhom);
        
        
        //Panel cho MenuBar Nhân viên     
        pnlNhanVien = new JPanel();
        pnlNhanVien.setBounds(0, 110, 250, 37);
        pnlMenu.add(pnlNhanVien);
        pnlNhanVien.setLayout(null);
        
        //MenuBar Nhân viên
        mnuNhanVien = new JMenuBar();
        mnuNhanVien.setBounds(0, 0, 250, 37);
        pnlNhanVien.add(mnuNhanVien);
        
        //Menu Nhân viên
        mnNhanVien = new JMenu("Nhân Viên");
        mnNhanVien.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_nhanvien1.png")));
        mnNhanVien.setMargin(new Insets(2, 70, 2, 70));
        mnNhanVien.setFont(new Font("Arial",Font.BOLD,24));
        mnuNhanVien.add(mnNhanVien);
        
        //MenuItem Bán hàng
        mniBanHang = new JMenuItem("Bán Hàng");
        mniBanHang.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_BanHang.png")));
        mniBanHang.setFont(new Font("Arial",Font.PLAIN , 20));
        mniBanHang.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		loaiQuanAo.setVisible(false);
        		datHangTruoc.setVisible(false);
        		timKiemNhaCungCap.setVisible(false);
        		thongKeDoanhThu.setVisible(false);
        		danhSachHoaDon.setVisible(false);
        		timKiemKhachHang.setVisible(false);
        		timKiemNhanVien.setVisible(false);
        		lblHinhNen.setVisible(false);
        		capNhatQuanAo.setVisible(false);
        		nhaCungCap.setVisible(false);
        		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
	    		
        		pnlThongTin.add(new GUI_BanHang());
        		banHang.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
        	}
        });
        mnNhanVien.add(mniBanHang);
        
            
      //MenuItem Cập nhật nhân viên
	    mniCapNhatNhanVien = new JMenuItem("Cập nhật");
	    mniCapNhatNhanVien.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_CapNhat.png")));
	    mniCapNhatNhanVien.setFont(new Font("Arial",Font.PLAIN , 20));
		
		mniCapNhatNhanVien.addActionListener(new ActionListener() { 
			public void	actionPerformed(ActionEvent e) {
				loaiQuanAo.setVisible(false);
				datHangTruoc.setVisible(false);
				timKiemNhaCungCap.setVisible(false);
				thongKeDoanhThu.setVisible(false);
				danhSachHoaDon.setVisible(false);
				timKiemKhachHang.setVisible(false);
				timKiemNhanVien.setVisible(false);
				lblHinhNen.setVisible(false);
				capNhatQuanAo.setVisible(false);
				nhaCungCap.setVisible(false);
				timKiemQuanAo.setVisible(false);
        		banHang.setVisible(false);
        		capNhatKhachHang.setVisible(false);
        		
        		pnlThongTin.add(new GUI_CapNhatNhanVien());
        		capNhatNhanVien.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
		} });
		 
	    mnNhanVien.add(mniCapNhatNhanVien);
	    
	    //MenuItem Tìm nhân viên
	    mniTimNhanVien = new JMenuItem("Tìm kiếm");
	    mniTimNhanVien.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
				lblHinhNen.setVisible(false);
				capNhatQuanAo.setVisible(false);
				nhaCungCap.setVisible(false);
				timKiemQuanAo.setVisible(false);
        		banHang.setVisible(false);
        		capNhatKhachHang.setVisible(false);
        		
        		pnlThongTin.add(new GUI_TimKiemNhanVien());
        		timKiemNhanVien.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    		
	    	}
	    });
	    mniTimNhanVien.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_TimKiem_nho.png")));
	    mniTimNhanVien.setFont(new Font("Arial", Font.PLAIN, 20));
	    mnNhanVien.add(mniTimNhanVien);
	    
	    //Panel Nhà cung cấp
	    JPanel pnlNhaCungCap = new JPanel();
	    pnlNhaCungCap.setLayout(null);
	    pnlNhaCungCap.setBounds(0, 190, 250, 37);
	    pnlMenu.add(pnlNhaCungCap);
	    
	    JMenuBar mnuNhaCungCap = new JMenuBar();
	    mnuNhaCungCap.setBounds(0, 0, 250, 37);
	    pnlNhaCungCap.add(mnuNhaCungCap);
	    
	    JMenu mnNhaCungCap = new JMenu("Nhà cung cấp");
	    mnNhaCungCap.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_NhaCC.png")));
	     mnNhaCungCap.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuNhaCungCap.add(mnNhaCungCap);
	    
	    JMenuItem mniCapNhatNhaCC = new JMenuItem("Cập nhật");
	    mniCapNhatNhaCC.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_CapNhat.png")));
	    mniCapNhatNhaCC.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
        		pnlThongTin.add(new GUI_NhaCungCap());
        		nhaCungCap.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniCapNhatNhaCC.setFont(new Font("Arial", Font.PLAIN, 20));
	    mnNhaCungCap.add(mniCapNhatNhaCC);
	    
	    mniTimKiemNhaCungCap = new JMenuItem("Tìm kiếm");
	    mniTimKiemNhaCungCap.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
        		pnlThongTin.add(new GUI_TimKiemNhaCungCap());
        		timKiemNhaCungCap.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniTimKiemNhaCungCap.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_TimKiem_nho.png")));
	    mniTimKiemNhaCungCap.setFont(new Font("Arial", Font.PLAIN, 20));
	    mnNhaCungCap.add(mniTimKiemNhaCungCap);
	    
	    //Panel Khách hàng
	    pnlKhachHang = new JPanel();
	    pnlKhachHang.setLayout(null);
	    pnlKhachHang.setBounds(0, 270, 250, 37);
	    pnlMenu.add(pnlKhachHang);
	    
	    mnuKhachHang = new JMenuBar();
	    mnuKhachHang.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuKhachHang.setBounds(0, 0, 250, 37);
	    pnlKhachHang.add(mnuKhachHang);
	    
	    mnKhachHang = new JMenu("Khách hàng");
	    mnKhachHang.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_KhachHang.png")));
	    mnKhachHang.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuKhachHang.add(mnKhachHang);
	    
	    JMenuItem mniCapNhatKhachHang = new JMenuItem("Cập nhật");
	    mniCapNhatKhachHang.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_CapNhat.png")));
	    mniCapNhatKhachHang.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		
        		pnlThongTin.add(new GUI_QuanLiKhachHang());
        		capNhatKhachHang.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniCapNhatKhachHang.setFont(new Font("Arial", Font.PLAIN, 20));
	    mnKhachHang.add(mniCapNhatKhachHang);
	    
	    mniTimKiemKhachHang = new JMenuItem("Tìm kiếm");
	    mniTimKiemKhachHang.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		
        		pnlThongTin.add(new GUI_TimKiemKhachHang());
        		timKiemKhachHang.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniTimKiemKhachHang.setFont(new Font("Arial", Font.PLAIN, 20));
	    mniTimKiemKhachHang.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_TimKiem_nho.png")));
	    mnKhachHang.add(mniTimKiemKhachHang);
	    
	    mniDatHangTruoc = new JMenuItem("Đặt hàng trước");
	    mniDatHangTruoc.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		
        		pnlThongTin.add(new GUI_DatHangTruoc());
        		datHangTruoc.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniDatHangTruoc.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_DatHangTruoc.png")));
	    mniDatHangTruoc.setFont(new Font("Arial", Font.PLAIN, 20));
	    mnKhachHang.add(mniDatHangTruoc);
	    
	    
	    //Panel Quần áo
	    pnlQuanAo = new JPanel();
	    pnlQuanAo.setLayout(null);
	    pnlQuanAo.setBounds(0, 350, 250, 37);
	    pnlMenu.add(pnlQuanAo);
	    
	    mnuQuanAo = new JMenuBar();
	    mnuQuanAo.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuQuanAo.setBounds(0, 0, 250, 37);
	    pnlQuanAo.add(mnuQuanAo);
	    
	    mnQuanAo = new JMenu("Quần áo");
	    mnQuanAo.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_QuanAo.png")));
	    mnQuanAo.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuQuanAo.add(mnQuanAo);
	    
	    JMenuItem mniCapNhatQuanAo = new JMenuItem("Cập nhật");
	    mniCapNhatQuanAo.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_CapNhat.png")));
	    mniCapNhatQuanAo.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
	    		
        		pnlThongTin.add(new GUI_CapNhatQuanAo());
        		capNhatQuanAo.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniCapNhatQuanAo.setFont(new Font("Arial", Font.PLAIN, 20));
	    mnQuanAo.add(mniCapNhatQuanAo);
	    
	    mniTimKiemQuanAo = new JMenuItem("Tìm kiếm ");
	    mniTimKiemQuanAo.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
	    		
        		pnlThongTin.add(new GUI_TimKiemQuanAo());
        		timKiemQuanAo.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniTimKiemQuanAo.setFont(new Font("Arial", Font.PLAIN, 20));
	    mniTimKiemQuanAo.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_TimKiem_nho.png")));
	    mnQuanAo.add(mniTimKiemQuanAo);
	    
	    mniLoaiQuanAo = new JMenuItem("Loại quần áo");
	    mniLoaiQuanAo.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_LoaiQuanAo.png")));
	    mniLoaiQuanAo.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		timKiemQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
	    		
        		pnlThongTin.add(new GUI_LoaiQuanAo());
        		loaiQuanAo.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniLoaiQuanAo.setFont(new Font("Arial", Font.PLAIN, 20));
	    mnQuanAo.add(mniLoaiQuanAo);
	    
	    
	    //Panel Hóa đơn
	    pnlHoaDon = new JPanel();
	    pnlHoaDon.setLayout(null);
	    pnlHoaDon.setBounds(0, 430, 250, 37);
	    pnlMenu.add(pnlHoaDon);
	    
	    mnuHoaDon = new JMenuBar();
	    mnuHoaDon.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuHoaDon.setBounds(0, 0, 250, 37);
	    pnlHoaDon.add(mnuHoaDon);
	    
	    mnHoaDon = new JMenu("Hóa Đơn");
	    mnHoaDon.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_HoaDon.png")));
	    mnHoaDon.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuHoaDon.add(mnHoaDon);
	    
	    mniHoaDonBanHang = new JMenuItem("Hóa đơn bán hàng");
	    mniHoaDonBanHang.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_HoaDonBanHang.png")));
	    mniHoaDonBanHang.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		thongKeDoanhThu.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
	    		
        		pnlThongTin.add(new GUI_HoaDon());
        		danhSachHoaDon.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mniHoaDonBanHang.setFont(new Font("Arial", Font.PLAIN, 20));
	    mnHoaDon.add(mniHoaDonBanHang);
	    
	    
	    //Panel Thống kê
	    pnlThongKe = new JPanel();
	    pnlThongKe.setLayout(null);
	    pnlThongKe.setBounds(0, 510, 250, 37);
	    pnlMenu.add(pnlThongKe);
	    
	    mnuThongKe = new JMenuBar();
	    mnuThongKe.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuThongKe.setBounds(0, 0, 250, 37);
	    pnlThongKe.add(mnuThongKe);
	    
	    mnThongKe = new JMenu("Thống kê");
	    mnThongKe.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_ThongKe.png")));
	    mnThongKe.setFont(new Font("Arial", Font.BOLD, 24));
	    mnuThongKe.add(mnThongKe);
	    
	    mniDoanhThu = new JMenuItem("Doanh thu");
	    mniDoanhThu.setIcon(new ImageIcon(Main.class.getResource("/Image/icon_DoanhThu.png")));
	    mniDoanhThu.setFont(new Font("Arial", Font.PLAIN, 20));
	    mniDoanhThu.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		loaiQuanAo.setVisible(false);
	    		datHangTruoc.setVisible(false);
	    		timKiemNhaCungCap.setVisible(false);
	    		danhSachHoaDon.setVisible(false);
	    		capNhatQuanAo.setVisible(false);
	    		timKiemKhachHang.setVisible(false);
	    		timKiemNhanVien.setVisible(false);
	    		lblHinhNen.setVisible(false);
	    		nhaCungCap.setVisible(false);
	    		timKiemQuanAo.setVisible(false);
	    		capNhatNhanVien.setVisible(false);
	    		banHang.setVisible(false);
	    		capNhatKhachHang.setVisible(false);
	    		
	    		
        		pnlThongTin.add(new GUI_ThongKeDoanhThu());
        		thongKeDoanhThu.setVisible(true);
            	pnlThongTin.repaint();
            	pnlThongTin.revalidate();
	    	}
	    });
	    mnThongKe.add(mniDoanhThu);
    }
    	
	    

        
    public static void main(String args[]) {
            
                new Main().setVisible(true);
            }
}
