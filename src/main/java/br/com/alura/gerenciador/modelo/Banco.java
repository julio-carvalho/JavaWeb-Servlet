package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
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
		
		Usuario u1 = new Usuario();
		u1.setLogin("julio");
		u1.setSenha("1234");
		
		Usuario u2 = new Usuario();
		u2.setLogin("joice");
		u2.setSenha("senha123");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
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

	public Usuario consultaUsuario(String login, String senha) {
		for(Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}

}
