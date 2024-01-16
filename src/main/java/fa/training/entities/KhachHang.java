package fa.training.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class KhachHang {
	@Id
	@NotBlank(message = "Mã khách hàng không được để trống")
	@Pattern(regexp = "^KH+[0-9]{5}$", message = "vui lòng nhập mã khách hàng đúng định dạng KHxxxxx (x: ký tự số)")
	private String maKH;
	@NotBlank(message = "Tên khách hàng không được để trống")
	private String tenKH;
	@NotBlank(message = "Địa chỉ khách hàng không được để trống")
	private String diaChi;
	@NotBlank(message = "Số điện thoại không được để trống")
	@Pattern(regexp = "^((090)|(091))[0-9]{7}$", message = "vui lòng nhập SĐT đúng định dạng")
	private String soDienThoai;
	@NotBlank(message = "Email hàng không được để trống")
	@Pattern(regexp ="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",message = "vui lòng nhập SĐT đúng định dạng")
	private String email;
	@OneToMany(mappedBy = "khach",cascade = CascadeType.ALL)
	List<SuDungMay> sdMay;
	@OneToMany(mappedBy = "khach",cascade = CascadeType.ALL)
	List<SuDungDichVu> shDichVu;

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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<SuDungMay> getSdMay() {
		return sdMay;
	}

	public void setSdMay(List<SuDungMay> sdMay) {
		this.sdMay = sdMay;
	}

	public List<SuDungDichVu> getShDichVu() {
		return shDichVu;
	}

	public void setShDichVu(List<SuDungDichVu> shDichVu) {
		this.shDichVu = shDichVu;
	}

	public KhachHang(String maKH, String tenKH, String diaChi, String soDienThoai, String email) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.email = email;
	}

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai
				+ ", email=" + email + "]";
	}
	
	public String getLabel() {
		return maKH+" - "+tenKH;
	}

}
