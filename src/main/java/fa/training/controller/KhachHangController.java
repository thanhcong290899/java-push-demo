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

import fa.training.entities.KhachHang;
import fa.training.service.KhachHangService;

@Controller
public class KhachHangController {
	@Autowired
	private KhachHangService khachHangService;

	@RequestMapping("/createCustomer")
	public String createCustomer(Model model) {
		KhachHang khachHang = new KhachHang();
		model.addAttribute("khachhang", khachHang);
		return "newcustomer";
	}

	@PostMapping("/addcustomer")
	public String addCustomer(@ModelAttribute("khachhang")  @Valid KhachHang khachHang, BindingResult result) {
		if(khachHangService.isIdExists(khachHang.getMaKH())) {
			result.rejectValue("maKH", "error.maKH", "Id đã tồn tại");
			return "newcustomer";
		}
		if(result.hasErrors()) {
			return "newcustomer";
		}
		khachHangService.addCustomer(khachHang);
		return "redirect:/customerList";
	}

	@RequestMapping("/customerList")
	public String customerList(Model model) {
		List<KhachHang> listCustomer = new ArrayList<KhachHang>();
		listCustomer = khachHangService.listAll();
		model.addAttribute("listCustomer", listCustomer);
		return "listcustomer";

	}

	@RequestMapping("/customerEdit")
	public String editCustomer(@RequestParam String id, Model model) {
		KhachHang customer = khachHangService.findByMaKH(id);
		model.addAttribute("khachhang", customer);
		return "editcustomer";
	}

	@PostMapping("/updatemcustomer")
	public String updateCustomer(@ModelAttribute("khachhang") KhachHang khachHang) {
		khachHangService.updateCustomer(khachHang);
		return "redirect:/customerList";
	}

	@RequestMapping("/delete1")
	public String delete(@RequestParam String id) {
		khachHangService.delete(id);
		return "redirect:/customerList";
	}

	@GetMapping("/searchCustomer")
	public String search(@RequestParam String inputSearch, Model model) {
		List<KhachHang> khachHang = new ArrayList<KhachHang>();
		khachHang = khachHangService.searchAll(inputSearch);
		model.addAttribute("listCustomer", khachHang);
		model.addAttribute("inputSearch", inputSearch);
		return "listcustomer";
	}
}
