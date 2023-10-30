package entity;

import java.sql.Date;
import java.util.Objects;

public class HoaDon {
	private String maHD;
	private QuanAo maQuanAo;
	private KhachHang maKH;
	private NhanVien maNV;
	private Date ngayMua;
	private QuanAo tenQuanAo;
	private int soLuong;
	private float gia;
	
	
	public HoaDon(String maHD, QuanAo maQuanAo, KhachHang maKH, NhanVien maNV, Date ngayMua, QuanAo tenQuanAo, int soLuong,
			float gia) {
		super();
		this.maHD = maHD;
		this.maQuanAo = maQuanAo;
		this.maKH = maKH;
		this.maNV = maNV;
		this.ngayMua = ngayMua;
		this.tenQuanAo = tenQuanAo;
		this.soLuong = soLuong;
		this.gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public QuanAo getMaQuanAo() {
		return maQuanAo;
	}
	public void setMaQuanAo(QuanAo maSP) {
		this.maQuanAo = maSP;
	}
	public KhachHang getMaKH() {
		return maKH;
	}
	public void setMaKH(KhachHang maKH) {
		this.maKH = maKH;
	}
	public NhanVien getMaNV() {
		return maNV;
	}
	public void setMaNV(NhanVien maNV) {
		this.maNV = maNV;
	}
	public Date getNgayMua() {
		return ngayMua;
	}
	public void setNgayMua(Date ngayMua) {
		this.ngayMua = ngayMua;
	}
	public QuanAo getTenSP() {
		return tenQuanAo;
	}
	public void setTenQuanAo(QuanAo tenQuanAo) {
		this.tenQuanAo = tenQuanAo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHD, maKH, maNV, maQuanAo, ngayMua, tenQuanAo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHD, other.maHD) && Objects.equals(maKH, other.maKH) && Objects.equals(maNV, other.maNV)
				&& Objects.equals(maQuanAo, other.maQuanAo) && Objects.equals(ngayMua, other.ngayMua)
				&& Objects.equals(tenQuanAo, other.tenQuanAo);
	}

	@Override
	public String toString() {
		return "Hoadon [maHD=" + maHD + ", maSP=" + maQuanAo + ", maKH=" + maKH + ", maNV=" + maNV + ", ngayMua=" + ngayMua
				+ ", tenSP=" + tenQuanAo + ", soLuong=" + soLuong + ", gia=" + gia + "]";
	}
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
