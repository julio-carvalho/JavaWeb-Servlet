<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
	String nomeEmpresa = (String)request.getAttribute("empresa");
	System.out.println("Nome empresa: " + nomeEmpresa);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adicionando nova empresa - Curso Java Web</title>
</head>
<body>
	Empresa <%=nomeEmpresa%> cadastrada com sucesso!
</body>
</html>