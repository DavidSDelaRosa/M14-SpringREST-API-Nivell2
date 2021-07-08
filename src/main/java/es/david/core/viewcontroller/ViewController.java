package es.david.core.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("/view-tiendas")
	public String listarTiendas() {
		return "vista-tiendas-ajax";
	}
	
	@RequestMapping("/add-tienda")
	public String addTienda() {
		return "add-tienda";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "template";
	}

}
