package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;

//@WebServlet("/entrada")
public class GerenciadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		
//		HttpSession session = request.getSession();
//		boolean validaUsuario = (session.getAttribute("usuarioLogado") == null);
//		boolean acaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
//        if(acaoProtegida & validaUsuario) {
//            response.sendRedirect("entrada?acao=LoginForm");
//            return;
//        }
		
		
		String nomeClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeClasse); //Carregamento da classe
			Acao acao = (Acao) classe.newInstance();
			System.out.println(nomeClasse);
			nome = acao.execute(request, response);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] tipoLink =  nome.split(":");
		if (tipoLink[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/" + tipoLink[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoLink[1]);
		}
		/*
		if(paramAcao.equals("ListaEmpresas")) {    
		    ListaEmpresas acao = new ListaEmpresas();
		    link = acao.execute(request, response);
		
		} else if(paramAcao.equals("RemoveEmpresa")) {
		    RemoveEmpresa acao = new RemoveEmpresa();
		    link = acao.execute(request, response);
		
		} else if(paramAcao.equals("MostraEmpresa")) {
		    MostraEmpresa acao = new MostraEmpresa();
		    link = acao.execute(request, response);
		
		} else if(paramAcao.equals("EditaEmpresa")) {

		    EditaEmpresa acao = new EditaEmpresa();
		    link = acao.execute(request, response);
		
		} else if(paramAcao.equals("NovaEmpresa")) {

		    NovaEmpresa acao = new NovaEmpresa();
		    link = acao.execute(request, response);
		} else if(paramAcao.equals("NovaEmpresaForm")) {
			
		    NovaEmpresaForm acao = new NovaEmpresaForm();
		    link = acao.execute(request, response);
		}
		*/
	}
}
