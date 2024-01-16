package fa.training.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import fa.training.entities.May;
import fa.training.repository.MayRepository;

@Service
public class MayService {
	@Autowired
	private MayRepository mayRepository;

	public void addMay(May may) {
		May crMay = new May();
		crMay.setMaMay(may.getMaMay());
		crMay.setTrangThai(may.getTrangThai());
		crMay.setViTri(may.getViTri());
		mayRepository.save(crMay);
	}

	public List<May> listMay() {
		List<May> mayList = new ArrayList<May>();
		mayList = mayRepository.findAll();
		return mayList;
	}

	public May findByMaMay(String id) {
		May listMaMay = mayRepository.findByMaMay(id);
		return listMaMay;
	}

	public void updateMay(May may) {

		mayRepository.save(may);
	}

	@Transactional
	public void delete(@RequestParam String id) {
		May idMay = mayRepository.findByMaMay(id);
		if (idMay != null) {
			mayRepository.delete(idMay);
		}
	}

	public List<May> searchMay(String inputSearch) {
		List<May> may = new ArrayList<May>();
		if (inputSearch.trim().equals("")) {
			may = mayRepository.findAll();

		}

		may = mayRepository.findByMaMayContainingOrTrangThaiContainingOrViTriContaining(inputSearch,
				inputSearch, inputSearch);
		return may;

	}
	@Transactional
	public boolean isIdExists(String id) {
		return mayRepository.existsById(id);
	}

}
