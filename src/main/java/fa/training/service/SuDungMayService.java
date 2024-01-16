package fa.training.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.entities.SuDungMay;
import fa.training.entities.SuDungMayID;
import fa.training.repository.SuDungMayRepository;

@Service
public class SuDungMayService {
	@Autowired
	private SuDungMayRepository dungMayRepository;

	public List<SuDungMay> listAll() {
		List<SuDungMay> sdMay = new ArrayList<SuDungMay>();
		sdMay = dungMayRepository.findAll();
		return sdMay;
	}


	public void registerSdMay(SuDungMay suDungMay) {
		SuDungMay addSdMay = new SuDungMay();
		SuDungMayID Ids = new SuDungMayID();
		Ids.setMaKH(suDungMay.getKhach().getMaKH());
		Ids.setMaMay(suDungMay.getMay().getMaMay());
		Ids.setNgayBatDau(suDungMay.getNgayBatDau());
		Ids.setGioBatDau(suDungMay.getGioBatDau());
		addSdMay.setThoiGianSuDung(suDungMay.getThoiGianSuDung());
		addSdMay.setMayID(Ids);
		dungMayRepository.save(addSdMay);
	}
}
