package entity;



public class QuanAo {
	private String maQuanAo;
	private String tenQuanAo;
	private NhaCungCap tenNCC;
	private LoaiQuanAo loaiQuanAo;
	private String kinhThuoc;
	private int soLuongTon;
	private float gia;
	
	
	public QuanAo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuanAo(String maQuanAo) {
		
		this.maQuanAo = maQuanAo;
		
	}
	
	public QuanAo(String maQuanAo, String tenQuanAo, NhaCungCap tenNCC, LoaiQuanAo loaiQuanAo, String kinhThuoc,
			int soLuongTon, float gia) {
		super();
		this.maQuanAo = maQuanAo;
		this.tenQuanAo = tenQuanAo;
		this.tenNCC = tenNCC;
		this.loaiQuanAo = loaiQuanAo;
		this.kinhThuoc = kinhThuoc;
		this.soLuongTon = soLuongTon;
		this.gia = gia;
	}


	@Override
	public String toString() {
		return "QuanAo [maQuanAo=" + maQuanAo + ", tenQuanAo=" + tenQuanAo + ", tenNCC=" + tenNCC + ", loaiQuanAo="
				+ loaiQuanAo + ", kinhThuoc=" + kinhThuoc + ", soLuongTon=" + soLuongTon + ", gia=" + gia + "]";
	}


	public LoaiQuanAo getLoaiQuanAo() {
		return loaiQuanAo;
	}


	public void setLoaiQuanAo(LoaiQuanAo loaiQuanAo) {
		this.loaiQuanAo = loaiQuanAo;
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
	public NhaCungCap getTenNCC() {
		return tenNCC;
	}
	public void setTenNCC(NhaCungCap tenNCC) {
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
