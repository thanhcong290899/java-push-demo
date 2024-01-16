package fa.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import fa.training.entities.KhachHang;
import fa.training.entities.May;
import fa.training.repository.KhachHangRepository;

@Service
public class KhachHangService {
	@Autowired
	private KhachHangRepository khachHangRepository;

	public void addCustomer(KhachHang khachHang) {
		KhachHang addCustomer = new KhachHang();
		addCustomer.setMaKH(khachHang.getMaKH());
		addCustomer.setTenKH(khachHang.getTenKH());
		addCustomer.setDiaChi(khachHang.getDiaChi());
		addCustomer.setSoDienThoai(khachHang.getSoDienThoai());
		addCustomer.setEmail(khachHang.getEmail());
		khachHangRepository.save(addCustomer);
	}

	public List<KhachHang> listAll() {
		List<KhachHang> listCustomer = new ArrayList<KhachHang>();
		listCustomer = khachHangRepository.findAll();
		return listCustomer;
	}

	public KhachHang findByMaKH(String id) {
		KhachHang customer = khachHangRepository.findByMaKH(id);
		return customer;
	}

	public void updateCustomer(KhachHang khachHang) {
		khachHangRepository.save(khachHang);
	}

	public void delete(String id) {
		KhachHang khachHang = khachHangRepository.findByMaKH(id);
		khachHangRepository.delete(khachHang);
	}

	public List<KhachHang> searchAll(String inputSearch) {
		List<KhachHang> khachHang = new ArrayList<KhachHang>();
		if (inputSearch.trim().equals("")) {
			khachHang = khachHangRepository.findAll();

		}

		khachHang = khachHangRepository
				.findByMaKHContainingOrTenKHContainingOrDiaChiContainingOrSoDienThoaiContainingOrEmailContaining(
						inputSearch, inputSearch, inputSearch, inputSearch, inputSearch);
		return khachHang;
	}
	public boolean isIdExists(String id) {
		return khachHangRepository.existsById(id);
	}
}
