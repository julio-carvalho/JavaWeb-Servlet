<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listas Empresas Cadastradas - Curso Java Web</title>
</head>
<body>
	
	<c:import url="logout-parcial.jsp" />
	
	Usuario Logado: ${usuarioLogado.login}
	
	<br>
	<br>
	
	<c:if test="${not empty empresa}">
		Empresa ${empresa} cadastrada com sucesso! PARAB�NS
	</c:if>
	<br />
	Lista de empresas cadastradas: <br />
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			
			<li>
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">Editar</a>
				<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">Remover</a>
			</li>
		</c:forEach>
	</ul>		
</body>
</html>