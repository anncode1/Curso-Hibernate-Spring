package main.java.com.anncode.transportesspringhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.com.anncode.transportesspringhibernate.model.Camion;
import main.java.com.anncode.transportesspringhibernate.service.CamionService;

@Controller
public class CamionController {
	
	private CamionService camionService;
	
	@RequestMapping(value="/camiones", method=RequestMethod.GET)
	public String listCamiones(Model model) {
		model.addAttribute("camion", new Camion());
		model.addAttribute("listCamiones", this.camionService.listCamion());
		return "camion";
	}

}
