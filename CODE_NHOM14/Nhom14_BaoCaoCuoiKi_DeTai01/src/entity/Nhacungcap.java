package entity;

import java.util.Objects;

public class Nhacungcap {
	private String maNCC;
	private String tenNCC;
	private String diaChi;
	private String sDT;
	public String getMaNCC() {
		return maNCC;
	}
	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}
	public String getTenNCC() {
		return tenNCC;
	}
	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public Nhacungcap(String maNCC, String tenNCC, String diaChi, String sDT) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.diaChi = diaChi;
		this.sDT = sDT;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diaChi, maNCC, sDT, tenNCC);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nhacungcap other = (Nhacungcap) obj;
		return Objects.equals(diaChi, other.diaChi) && Objects.equals(maNCC, other.maNCC)
				&& Objects.equals(sDT, other.sDT) && Objects.equals(tenNCC, other.tenNCC);
	}
	@Override
	public String toString() {
		return "Nhacungcap [maNCC=" + maNCC + ", tenNCC=" + tenNCC + ", diaChi=" + diaChi + ", sDT=" + sDT + "]";
	}
	public Nhacungcap() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
