<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Nova Empresa</title>
</head>
<body>
	
	<c:import url="logout-parcial.jsp" />
	
	<!--  Método Post -->
	<form action="${linkEntradaServlet}"  method="post">
		
		Nome da empresa: <input type="text" name="nome"><br /><br />
		Data abertura: <input type="text" name="data"><br /><br />
		
		<input type="hidden" name="acao" value="NovaEmpresa" /> 
		<input type="submit">
	</form>

</body>
</html>