<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Nova Empresa</title>
</head>
<body>
	
	<!--  Método Post -->
	<form action="${linkServletNovaEmpresa}"  method="post">
		
		Nome da empresa: <input type="text" name="nome"><br /><br />
		Data abertura: <input type="text" name="data"><br /><br />
		<input type="submit">
	</form>

</body>
</html>