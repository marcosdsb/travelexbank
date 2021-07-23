package br.com.confidencecambio.javabasico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.confidencecambio.javabasico.entity.Pessoa;

@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) {
		/*
		 * Para questão de exemplo, estou testado só com a classe Pessoa
		 * Pode ser moficado para rodar com as outras classe
		 */
		
		
		rodarPessoa();
		SpringApplication.run(JavaBasicoApplication.class, args);
		
		
	}

	private static void rodarPessoa() {
		
		Pessoa pessoa = new Pessoa("  Marcos de Sousa Barbosa  ");
		imprimirPrimeiroNome(pessoa.getNome());
		imprimirUltimoNome(pessoa.getNome());
		
	}

	private static String eliminarEspacosInicioFim(String nome) {
		return nome.trim();
	}

	private static boolean verificarNuloEEspacos(String nome) {
		boolean retorno = false;
		if( (nome == null) || (nome.equals(""))   ) {
			retorno = true;
		}
		return retorno;
	}
	
	private static void imprimirPrimeiroNome(String nome) {
		
		if(( verificarNuloEEspacos(nome))) {
			System.out.println("Nome não pode ser nulo");
			return;
		}
		
		String nomeSemEspaco = eliminarEspacosInicioFim(nome);
		
		String[] nomes = nomeSemEspaco.split(" ");
		System.out.println("Retornar primeiro nome: ====> " + nomes[0].toUpperCase() );
	}
	
	private static void imprimirUltimoNome(String nome) {
		
		if(( verificarNuloEEspacos(nome))) {
			System.out.println("Nome não pode ser nulo");
			return;
		}
		
		String nomeSemEspaco = eliminarEspacosInicioFim(nome);
		
		String[] nomes = nomeSemEspaco.split(" ");
		
		List<String> list = new ArrayList<String>(Arrays.asList(nomes));
		list.remove(0);
		
		String sobreNomes="";
		for(String item : list) {
			sobreNomes = sobreNomes+" "+item;
		}

		System.out.println("Retornar sobre nomes ====> " +   sobreNomes.toUpperCase());
		
	}

}
