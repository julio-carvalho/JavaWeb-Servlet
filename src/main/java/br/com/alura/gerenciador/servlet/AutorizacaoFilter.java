package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter("/entrada")
public class AutorizacaoFilter extends HttpFilter implements Filter {
       
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("AutorizacaoFilter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");
		
		HttpSession session = request.getSession();
		boolean validaUsuario = (session.getAttribute("usuarioLogado") == null);
		boolean acaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
        if(acaoProtegida & validaUsuario) {
            response.sendRedirect("entrada?acao=LoginForm");
            return;
        }
		chain.doFilter(request, response);
	}


}
