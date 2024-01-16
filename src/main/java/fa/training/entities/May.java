package fa.training.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class May {
	@Id
	private String maMay;
	
	private String viTri;
	@NotBlank(message = "Trạng thái không được trống")
	private String trangThai;
	@OneToMany(mappedBy = "may",cascade = CascadeType.ALL)
	List<SuDungMay> sdMay;
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
	public List<SuDungMay> getSdMay() {
		return sdMay;
	}
	public void setSdMay(List<SuDungMay> sdMay) {
		this.sdMay = sdMay;
	}
	
	public May(String maMay, String viTri, String trangThai) {
		super();
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
	}
	public May() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "May [maMay=" + maMay + ", viTri=" + viTri + ", trangThai=" + trangThai + "]";
	}
	
}
