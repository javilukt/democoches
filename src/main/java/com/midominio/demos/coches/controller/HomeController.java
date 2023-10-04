package com.midominio.demos.coches.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class HomeController {
	
	@GetMapping({"/", "/home"})
	public String homeHandler(Model model) {
		model.addAttribute("titulo", "Inicio2");
		model.addAttribute("tituloH1", "Página de inicio de la aplicación de coches");
		model.addAttribute("parrafo", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus consequat sapien, eu vulputate leo interdum sit amet. Aliquam sapien quam, molestie id sem et, rhoncus vestibulum est. Proin interdum, nisl vel imperdiet malesuada, quam ligula consectetur massa, at dignissim ante diam eu urna. Quisque arcu risus, lacinia non tortor ac, faucibus volutpat eros. Cras eu ex id orci mattis vestibulum at in orci. Donec molestie ex non augue dapibus consequat. Integer semper ante lorem, vulputate pellentesque metus fermentum nec. Ut et auctor magna. Phasellus rhoncus lacinia varius.");
		return "home";
	}  

}
