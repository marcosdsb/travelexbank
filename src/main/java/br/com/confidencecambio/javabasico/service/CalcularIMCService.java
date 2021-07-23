package br.com.confidencecambio.javabasico.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class CalcularIMCService {
	
	
	public String calcularImc(Float peso, Float altura) {
		
		Float alturaQuadrado = (float) Math.pow(altura, 2);
		Float Imc = peso / alturaQuadrado;
		
		DecimalFormat df = new DecimalFormat("0.00");
		String imcFormatado = df.format(Imc);
		
		return imcFormatado.replace(",", ".");
		
	}
	

}
