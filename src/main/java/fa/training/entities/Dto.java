package fa.training.entities;

import java.util.Date;

public class Dto {
	
	private String maKH;
	private String tenKH;
	private String maMay;
	private String viTri;
	private String trangThai;
	private Date ngayBatDau;
	private int gioBatDau;
	private String thoiGianSuDung;
	private String maDV;
	private Date ngaySuDung;
	private int gioSuDung;
	private int soLuong;
	private int donGia;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getMaMay() {
		return maMay;
	}
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public int getGioBatDau() {
		return gioBatDau;
	}
	public void setGioBatDau(int gioBatDau) {
		this.gioBatDau = gioBatDau;
	}
	public String getThoiGianSuDung() {
		return thoiGianSuDung;
	}
	public void setThoiGianSuDung(String thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public Date getNgaySuDung() {
		return ngaySuDung;
	}
	public void setNgaySuDung(Date ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}
	public int getGioSuDung() {
		return gioSuDung;
	}
	public void setGioSuDung(int gioSuDung) {
		this.gioSuDung = gioSuDung;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getTongTien() {
		return donGia;
	}
	public void setTongTien(int tongTien) {
		this.donGia = tongTien;
	}

	public Dto(String maKH, String tenKH, String maMay, String viTri, String trangThai, Date ngayBatDau, int gioBatDau,
			String thoiGianSuDung, String maDV, Date ngaySuDung, int gioSuDung, int soLuong, int donGia) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
		this.ngayBatDau = ngayBatDau;
		this.gioBatDau = gioBatDau;
		this.thoiGianSuDung = thoiGianSuDung;
		this.maDV = maDV;
		this.ngaySuDung = ngaySuDung;
		this.gioSuDung = gioSuDung;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	public Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dto [maKH=" + maKH + ", tenKH=" + tenKH + ", maMay=" + maMay + ", viTri=" + viTri + ", trangThai="
				+ trangThai + ", ngayBatDau=" + ngayBatDau + ", gioBatDau=" + gioBatDau + ", thoiGianSuDung="
				+ thoiGianSuDung + ", maDV=" + maDV + ", ngaySuDung=" + ngaySuDung + ", gioSuDung=" + gioSuDung
				+ ", soLuong=" + soLuong + ", donGia=" + donGia + "]";
	}
	
}
