package fa.training.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SuDungDichVu {
	@ManyToOne
	@JoinColumn(name = "maDV", referencedColumnName = "maDV", insertable = false, updatable = false)
	private DichVu dichvu;
	@ManyToOne
	@JoinColumn(name = "maKH", referencedColumnName = "maKH", insertable = false, updatable = false)
	private KhachHang khach;
	@Column(insertable = false, updatable = false)
	private Date ngaySuDung;
	@Column(insertable = false, updatable = false)
	private int gioSuDung;
	private int soLuong;
	@EmbeddedId
	private SuDungDichVuID dichVuID;
	
	public DichVu getDichvu() {
		return dichvu;
	}
	public void setDichvu(DichVu dichvu) {
		this.dichvu = dichvu;
	}
	
	public KhachHang getKhach() {
		return khach;
	}
	public void setKhach(KhachHang khach) {
		this.khach = khach;
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
	public SuDungDichVuID getDichVuID() {
		return dichVuID;
	}
	public void setDichVuID(SuDungDichVuID dichVuID) {
		this.dichVuID = dichVuID;
	}
	public SuDungDichVu(int soLuong, SuDungDichVuID dichVuID) {
		super();
		this.soLuong = soLuong;
		this.dichVuID = dichVuID;
	}
	public SuDungDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SuDungDichVu [soLuong=" + soLuong + ", dichVuID=" + dichVuID + "]";
	}
	
}
