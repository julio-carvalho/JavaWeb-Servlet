<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Edita Empresa</title>
</head>
<body>
	
	<!--  Método Post -->
	<form action="${linkServletNovaEmpresa}"  method="post">
		
		Nome da empresa: <input type="text" name="nome" value="${empresa.nome}"><br /><br />
		Data abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"><br /><br />
		<input type="hidden" name="id" value="${empresa.id}">
		<input type="submit">
	</form>

</body>
</html>