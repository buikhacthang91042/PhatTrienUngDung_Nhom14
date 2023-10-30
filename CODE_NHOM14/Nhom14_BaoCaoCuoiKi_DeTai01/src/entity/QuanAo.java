package entity;



public class QuanAo {
	private String maQuanAo;
	private String tenQuanAo;
	private Nhacungcap tenNCC;
	private String kinhThuoc;
	private int soLuongTon;
	private float gia;
	
	
	public QuanAo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QuanAo [maQuanAo=" + maQuanAo + ", tenQuanAo=" + tenQuanAo + ", tenNCC=" + tenNCC + ", kinhThuoc="
				+ kinhThuoc + ", soLuongTon=" + soLuongTon + ", gia=" + gia + "]";
	}
	public QuanAo(String maQuanAo, String tenQuanAo, Nhacungcap tenNCC, String kinhThuoc, int soLuongTon, float gia) {
		super();
		this.maQuanAo = maQuanAo;
		this.tenQuanAo = tenQuanAo;
		this.tenNCC = tenNCC;
		this.kinhThuoc = kinhThuoc;
		this.soLuongTon = soLuongTon;
		this.gia = gia;
	}
	public String getMaQuanAo() {
		return maQuanAo;
	}
	public void setMaQuanAo(String maQuanAo) {
		this.maQuanAo = maQuanAo;
	}
	public String getTenQuanAo() {
		return tenQuanAo;
	}
	public void setTenQuanAo(String tenQuanAo) {
		this.tenQuanAo = tenQuanAo;
	}
	public Nhacungcap getTenNCC() {
		return tenNCC;
	}
	public void setTenNCC(Nhacungcap tenNCC) {
		this.tenNCC = tenNCC;
	}
	public String getKinhThuoc() {
		return kinhThuoc;
	}
	public void setKinhThuoc(String kinhThuoc) {
		this.kinhThuoc = kinhThuoc;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	

}
