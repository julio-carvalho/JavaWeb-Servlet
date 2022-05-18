package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Foursys");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Bradesco");
		
		Empresa empresa3 = new Empresa();
		empresa3.setNome("Alura");
		
		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
	}
	
	public void adiciona(Empresa empresa) {
		listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}

}
