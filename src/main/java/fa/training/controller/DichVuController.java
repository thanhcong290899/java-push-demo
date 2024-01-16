package fa.training.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fa.training.entities.DichVu;
import fa.training.service.DichVuService;

@Controller
public class DichVuController {
	@Autowired
	private DichVuService dichVuService;

	// cái này là mapping từ href menu sang
	@RequestMapping("/createService")
	public String createService(Model model) {
		DichVu dichVu = new DichVu();
		model.addAttribute("dichvu", dichVu);
		return "newservice";
	}

	@PostMapping("/addservice")
	public String addService(@ModelAttribute("dichvu") @Valid DichVu dichVu, BindingResult result) {
		if (dichVuService.isIdExists(dichVu.getMaDV())) {
			result.rejectValue("maDV", "error.maDV", "ID đã tồn tại");
			return "newservice";
		}
		if (result.hasErrors()) {
			return "newservice";
		}
		dichVuService.addService(dichVu);
		return "redirect:/serviceList";
	}

//cái này là mapping từ href menu sang
	@RequestMapping("/serviceList")
	public String listService(Model model) {
		List<DichVu> serviceList = new ArrayList<DichVu>();
		serviceList = dichVuService.listAll();
		model.addAttribute("serviceList", serviceList);
		return "listservice";
	}

	@RequestMapping("/serviceEdit")
	public String editService(@RequestParam String id, Model model) {
		DichVu dichvu = dichVuService.findByByMaDV(id);
		model.addAttribute("dichvu", dichvu);
		return "editservice";

	}

	@PostMapping("/updateservice")
	public String updateService(@ModelAttribute("dichvu") DichVu dichvu) {
		dichVuService.addService(dichvu);
		return "redirect:/serviceList";
	}

// mapping tìm thg id từ js
	@RequestMapping("/delete2")
	public String delete(@RequestParam String id) {
		dichVuService.delete(id);
		return "redirect:/serviceList";
	}

	@GetMapping("/searchService")
	public String search(@RequestParam String inputSearch, Model model) {
		List<DichVu> dichVu = new ArrayList<DichVu>();
		dichVu = dichVuService.searchAll(inputSearch);
		model.addAttribute("serviceList", dichVu);
		model.addAttribute("inputSearch", inputSearch);
		return "listservice";
	}

}
