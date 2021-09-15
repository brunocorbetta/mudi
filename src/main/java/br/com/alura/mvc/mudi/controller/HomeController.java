package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller //aqui seria a action, ela que vai se comunicar com a view
public class HomeController {
	
	@Autowired //injeção de dependencia
	private PedidoRepository repository;
	
	@GetMapping("/home") //para qual pagina leva
	public String home(Model model) {
		List<Pedido> pedidos = repository.findAll(); //pega a lista de pedidos
		model.addAttribute("pedidos", pedidos);
		return "home"; //retorna o templete
	}
}
