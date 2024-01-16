package fa.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.training.entities.DichVu;

public interface DichVuRepository extends JpaRepository<DichVu, String> {
	DichVu findByMaDV(String id);

	List<DichVu> findByMaDVContainingOrTenDVContainingOrDonViTinhContaining(String inputSearch1,
			String inputSearch2, String inputSearch3);
}
