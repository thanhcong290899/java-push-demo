package fa.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fa.training.entities.Dto;
import fa.training.service.DtoService;

@Controller
public class DtoController {
	@Autowired
	private DtoService dtoService;

	@RequestMapping("/listAll")
	public String allList(Model model) {
		List<Dto> lisAllDto = new ArrayList<Dto>();
		lisAllDto = dtoService.listAll();
		model.addAttribute("lisAllDto", lisAllDto);
		return "listalldto";
	}
}
