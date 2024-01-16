package fa.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fa.training.entities.Dto;
import fa.training.entities.KhachHang;
@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String> {

	KhachHang findByMaKH(String id);

	List<KhachHang> findByMaKHContainingOrTenKHContainingOrDiaChiContainingOrSoDienThoaiContainingOrEmailContaining(
			String inputSearch1, String inputSearch2, String inputSearch3, String inputSearch4, String inputSearch5);

	@Query(value = "SELECT new fa.training.entities.Dto(k.maKH,k.tenKH,m.maMay,m.viTri,m.trangThai,sdm.mayID.ngayBatDau,sdm.mayID.gioBatDau,sdm.thoiGianSuDung,dv.maDV,"
			+ " sdv.dichVuID.ngaySuDung,sdv.dichVuID.gioSuDung,sdv.soLuong,dv.donGia)" 
			+ " from KhachHang k "
			+ " inner join k.sdMay sdm" 
			+ " inner join sdm.may m" 
			+ " inner join k.shDichVu sdv" 
			+ " inner join sdv.dichvu dv")
	List<Dto> getData();
	
	
	/*
	 * @Query(value =
	 * "SELECT new fa.training.entities.Dto(k.maKH,k.tenKH,m.maMay,m.viTri,m.trangThai,sdm.mayID.ngayBatDau,sdm.mayID.gioBatDau,sdm.thoiGianSuDung,dv.maDV,"
	 * + " sdv.dichVuID.ngaySuDung,sdv.dichVuID.gioSuDung,sdv.soLuong,dv.donGia)" +
	 * " from KhachHang k " + " inner join k.sdMay sdm" + " inner join sdm.may m" +
	 * " inner join k.shDichVu sdv" + " inner join sdv.dichvu dv" List<Dto>
	 * getData(@Param("inputSerach") String inpurSreach);
	 */
}
