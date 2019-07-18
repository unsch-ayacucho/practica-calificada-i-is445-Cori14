package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.service.CargaAcademicaService;
import pe.edu.unsch.service.CargaAcademicaServiceImpl;

@Controller
@RequestMapping("/view")
public class IndexController {
	
	@Autowired
	private CargaAcademicaService cargaAcademicaService;

	@GetMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("cargas", cargaAcademicaService.listarPorDocente());
		
		return "/view/index";
	}
}
