package fa.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.entities.SuDungDichVu;
import fa.training.entities.SuDungDichVuID;
import fa.training.repository.SuDungDichVuRepository;

@Service
public class SuDungDichVuService {
	@Autowired
	private SuDungDichVuRepository suDungDichVuRepository;

	public void createSuDungDichVu(SuDungDichVu suDungDichVu) {
		SuDungDichVu addSdDv = new SuDungDichVu();
		SuDungDichVuID dvID = new SuDungDichVuID();
		dvID.setMaKH(suDungDichVu.getKhach().getMaKH());
		dvID.setMaDV(suDungDichVu.getDichvu().getMaDV());
		dvID.setNgaySuDung(suDungDichVu.getNgaySuDung());
		dvID.setGioSuDung(suDungDichVu.getGioSuDung());
		addSdDv.setSoLuong(suDungDichVu.getSoLuong());
		addSdDv.setDichVuID(dvID);
		suDungDichVuRepository.save(addSdDv);
	}
	public List<SuDungDichVu> listAll(){
		List<SuDungDichVu> sdDvAll = new ArrayList<SuDungDichVu>();
		sdDvAll = suDungDichVuRepository.findAll();
		return sdDvAll;
	}
}
