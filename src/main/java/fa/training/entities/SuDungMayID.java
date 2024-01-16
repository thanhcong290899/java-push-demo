package fa.training.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Embeddable;
@Embeddable
public class SuDungMayID implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String maKH;
	private String maMay;
	private Date ngayBatDau;
	private int gioBatDau;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getMaMay() {
		return maMay;
	}
	public void setMaMay(String maMay) {
		this.maMay = maMay;
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
	public SuDungMayID() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuDungMayID(String maKH, String maMay, Date ngayBatDau, int gioBatDau) {
		super();
		this.maKH = maKH;
		this.maMay = maMay;
		this.ngayBatDau = ngayBatDau;
		this.gioBatDau = gioBatDau;
	}
	@Override
	public String toString() {
		return "SuDungMayID [maKH=" + maKH + ", maMay=" + maMay + ", ngayBatDau=" + ngayBatDau + ", gioBatDau="
				+ gioBatDau + "]";
	}
	
}
