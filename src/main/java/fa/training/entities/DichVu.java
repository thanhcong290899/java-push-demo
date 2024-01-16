package fa.training.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Range;

@Entity
public class DichVu {
	@Id
	@NotBlank(message = "Vui lòng không được để trống")
	@Pattern(regexp = "^DV+[0-9]{3}$", message = "vui lòng nhập mã khách hàng đúng định dạng KHxxx (x: ký tự số)")
	private String maDV;
	@NotBlank(message = "Vui lòng không được để trống")
	private String tenDV;
	@NotBlank(message = "Vui lòng không được để trống")
	private String donViTinh;
	@NotNull(message = "Vui lòng không được để trống")
	@Positive(message = "Vui long chi nhap so nguyen duong")
	@Range(min = 0, max = 1000,message = "asds")
	private int donGia;
	@OneToMany(mappedBy = "dichvu",cascade = CascadeType.ALL)
	List<SuDungDichVu> sdDichVu;
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public String getTenDV() {
		return tenDV;
	}
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public List<SuDungDichVu> getSdDichVu() {
		return sdDichVu;
	}
	public void setSdDichVu(List<SuDungDichVu> sdDichVu) {
		this.sdDichVu = sdDichVu;
	}

	public DichVu(String maDV, String tenDV, String donViTinh, int donGia) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.donViTinh = donViTinh;
		this.donGia = donGia;
	}
	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DichVu [maDV=" + maDV + ", tenDV=" + tenDV + ", donViTinh=" + donViTinh + ", donGia=" + donGia + "]";
	}
	
}
