package br.com.confidencecambio.javabasico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.CalcularIMCService;

@RestController
@RequestMapping("api/imc/")
public class CalcularIMCController {
	
	
	@Autowired
	private CalcularIMCService service;
	
	@GetMapping("{peso}/{altura}")
	public String calcularImc(@PathVariable @NonNull Float peso, @PathVariable @NonNull Float altura){
		
		return service.calcularImc(peso, altura) ;
	}

}
