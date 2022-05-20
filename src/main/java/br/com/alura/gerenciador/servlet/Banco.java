package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static Integer contadorId = 1;
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Foursys");
		empresa1.setId(contadorId++);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Bradesco");
		empresa2.setId(contadorId++);
		
		Empresa empresa3 = new Empresa();
		empresa3.setNome("Alura");
		empresa3.setId(contadorId++);
		
		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.contadorId++);
		listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaId(Integer id) {
		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;	
	}

}
