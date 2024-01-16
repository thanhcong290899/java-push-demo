package fa.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.training.entities.May;

public interface MayRepository extends JpaRepository<May, String> {
	May findByMaMay(String id);

	List<May> findByMaMayContainingOrTrangThaiContainingOrViTriContaining(String inputSearch,
			String inputSearch2, String inputSearch3);
	
	
}
