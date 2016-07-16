package main.java.com.anncode.transportesspringhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BienvenidaController {
	
	@RequestMapping("/bienvenida")
	public ModelAndView mostrarBienvenida() {
		String mensaje = "<h1>Bienvenidos jajaja</h1>";
		return new ModelAndView("bienvenida", "mensaje", mensaje);
	}

}
