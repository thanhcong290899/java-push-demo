package fa.training.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class SuDungMay {
	
	@ManyToOne
	@JoinColumn(name = "maMay", referencedColumnName = "maMay", insertable = false, updatable = false)
	private May may;
	@ManyToOne
	@JoinColumn(name = "maKH", referencedColumnName = "maKH", insertable = false, updatable = false)
	private KhachHang khach;
	@Column(insertable = false, updatable = false)
	
	private Date ngayBatDau;
	@Column(insertable = false, updatable = false)
	private int gioBatDau;
	@NotBlank(message = "Vui lòng không được để trống")
	private String thoiGianSuDung;
	
	@EmbeddedId
	private SuDungMayID mayID;
	
	
	public May getMay() {
		return may;
	}
	public void setMay(May may) {
		this.may = may;
	}
	public KhachHang getKhach() {
		return khach;
	}
	public void setKhach(KhachHang khach) {
		this.khach = khach;
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
	public SuDungMayID getMayID() {
		return mayID;
	}
	public void setMayID(SuDungMayID mayID) {
		this.mayID = mayID;
	}

	public SuDungMay(May may, KhachHang khach, Date ngayBatDau, int gioBatDau, String thoiGianSuDung,
			SuDungMayID mayID) {
		super();
		this.may = may;
		this.khach = khach;
		this.ngayBatDau = ngayBatDau;
		this.gioBatDau = gioBatDau;
		this.thoiGianSuDung = thoiGianSuDung;
		this.mayID = mayID;
	}
	public SuDungMay() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SuDungMay [thoiGianSuDung=" + thoiGianSuDung + ", mayID=" + mayID + "]";
	}
	
	
}
