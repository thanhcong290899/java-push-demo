package fa.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.entities.DichVu;
import fa.training.entities.KhachHang;
import fa.training.repository.DichVuRepository;

@Service
public class DichVuService {
	@Autowired
	private DichVuRepository dichVuRepository;

	public void addService(DichVu dichVu) {
		DichVu addDV = new DichVu();
		addDV.setMaDV(dichVu.getMaDV());
		addDV.setTenDV(dichVu.getTenDV());
		addDV.setDonViTinh(dichVu.getDonViTinh());
		addDV.setDonGia(dichVu.getDonGia());
		dichVuRepository.save(addDV);
	}

	public List<DichVu> listAll() {
		List<DichVu> listService = new ArrayList<DichVu>();
		listService = dichVuRepository.findAll();
		return listService;
	}

	public DichVu findByByMaDV(String id) {
		DichVu dichvu = dichVuRepository.findByMaDV(id);
		return dichvu;
	}

	public void updateService(DichVu dichvu) {
		dichVuRepository.save(dichvu);
	}

	public void delete(String id) {
		DichVu dichVu = dichVuRepository.findByMaDV(id);
		dichVuRepository.delete(dichVu);
	}

	public List<DichVu> searchAll(String inputSearch) {
		List<DichVu> dichVu = new ArrayList<DichVu>();
		if (inputSearch.trim().equals("")) {
			dichVu = dichVuRepository.findAll();
		}
		dichVu = dichVuRepository.findByMaDVContainingOrTenDVContainingOrDonViTinhContaining(
				inputSearch, inputSearch, inputSearch);
		return dichVu;
	}
	public boolean isIdExists(String id) {
		return dichVuRepository.existsById(id);
	}
}
