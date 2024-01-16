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

import fa.training.entities.May;
import fa.training.service.MayService;

@Controller
public class Maycontroller {
	@Autowired
	private MayService mayService;

	@RequestMapping("/createMay")
	public String createMay(Model model) {
		May may = new May();
		model.addAttribute("may", may);
		return "newmay";
	}

	@PostMapping("/addmay")
	public String addMay(@ModelAttribute("may") @Valid May may, BindingResult result) {
		if (mayService.isIdExists(may.getMaMay())) {
			result.rejectValue("maMay", "error.maMay", "ID đã tồn tại");
			return "newmay";
		}
		if (result.hasErrors()) {
			return "newmay";
		}

		mayService.addMay(may);
		return "redirect:/maylist";
	}

	@RequestMapping("/maylist")
	public String listMay(Model model) {
		List<May> mayList = new ArrayList<May>();
		mayList = mayService.listMay();
		model.addAttribute("mayList", mayList);
		return "listmay";
	}

// từ link views action
	@RequestMapping("/mayEdit")
	public String editMay(@RequestParam String id, Model model) {
		May may = mayService.findByMaMay(id);
		model.addAttribute("may", may);
		return "editmay";
	}

	@PostMapping("/updatemay")
	public String updateMay(@ModelAttribute("may") May may) {

		mayService.updateMay(may);
		return "redirect:/maylist";
	}

	@RequestMapping("/delete")
	public String deleteMay(@RequestParam("id") String id) {
		mayService.delete(id);
		return "redirect:/maylist";

	}

	@GetMapping("/searchMay")
	public String search(@RequestParam String inputSearch, Model model) {
		List<May> may = new ArrayList<May>();
		may = mayService.searchMay(inputSearch);
		System.out.println(may.toString());
		model.addAttribute("mayList", may);
		model.addAttribute("inputSearch", inputSearch);

		return "listmay";

	}
}
