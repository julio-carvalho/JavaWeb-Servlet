<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formul�rio Login</title>
</head>
<body>
	
	<!--  M�todo Post -->
	<form action="${linkEntradaServlet}"  method="post">
		
		Login: <input type="text" name="login"><br /><br />
		Senha: <input type="password" name="senha"><br /><br />
		
		<input type="hidden" name="acao" value="Login" /> 
		<input type="submit">
	</form>

</body>
</html>