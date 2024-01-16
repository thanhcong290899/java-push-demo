package fa.training.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fa.training.entities.KhachHang;
import fa.training.entities.May;
import fa.training.entities.SuDungMay;
import fa.training.service.KhachHangService;
import fa.training.service.MayService;
import fa.training.service.SuDungMayService;

@Controller
public class SuDungMayController {
	@Autowired
	private SuDungMayService dungMayService;
	@Autowired
	private KhachHangService khachHangService;
	@Autowired
	private MayService mayService;

	@RequestMapping("/viewsSdMay")
	public String viewsSuDungMay(Model model) {
		List<KhachHang> khachHangs = khachHangService.listAll();
		model.addAttribute("khachHangs", khachHangs);
		model.addAttribute("SuDungMay", new SuDungMay());
		List<May> mays = mayService.listMay();
		model.addAttribute("mays", mays);
		
		return "registerMay";
	}

	@RequestMapping("/listSdMay")
	public String listSdMay(Model model) {
		List<SuDungMay> sdMay = new ArrayList<SuDungMay>();
		sdMay = dungMayService.listAll();
		model.addAttribute("sdMay", sdMay);
	
		return "listregistermay";

	}

	@PostMapping("/createMay")
	public String createSdMayID(@ModelAttribute("SuDungMay") @Valid SuDungMay suDungMay, BindingResult result) {
		if (result.hasErrors()) {
			return "registerMay";
		}
		dungMayService.registerSdMay(suDungMay);
		return "redirect:/listSdMay";
	}
}
