package fa.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fa.training.entities.DichVu;
import fa.training.entities.KhachHang;
import fa.training.entities.SuDungDichVu;
import fa.training.service.DichVuService;
import fa.training.service.KhachHangService;
import fa.training.service.SuDungDichVuService;

@Controller
public class SuDungDichVuController {
	@Autowired
	private KhachHangService khachHangService;
	@Autowired
	private DichVuService dichVuService;
	@Autowired
	private SuDungDichVuService dungDichVuService;

	@RequestMapping("/viewsSdDichVu")
	public String viewsRegisterDichVu(Model model) {
		List<KhachHang> khachHangs = khachHangService.listAll();
		model.addAttribute("khachHangs", khachHangs);
		model.addAttribute("SuDungDichVu", new SuDungDichVu());
		List<DichVu> dichVus = dichVuService.listAll();
		model.addAttribute("dichVus", dichVus);

		return "registerdichvu";
	}

	@PostMapping("/registerDichVu")
	public String createSuDungDichVu(@ModelAttribute("SuDungDichVu") SuDungDichVu suDungDichVu) {
		dungDichVuService.createSuDungDichVu(suDungDichVu);
		return "redirect:/listDkDv";
	}
	@RequestMapping("/listDkDv")
	public String showAll(Model model) {
		List<SuDungDichVu> listAll= new ArrayList<SuDungDichVu>();
		listAll= dungDichVuService.listAll();
		model.addAttribute("listAll", listAll);
		return "listregisterdichvu";
	}
}
