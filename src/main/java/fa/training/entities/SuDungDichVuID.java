package fa.training.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Embeddable;

@Embeddable
public class SuDungDichVuID implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String maKH;
	private String maDV;
	private Date ngaySuDung;
	private int gioSuDung;
	
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public SuDungDichVuID() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SuDungDichVuID [maKH=" + maKH + ", maDV=" + maDV + ", ngaySuDung=" + ngaySuDung + ", gioSuDung="
				+ gioSuDung + "]";
	}

	

	
}
