<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista Camiones</h1>

	<c:forEach items="${listCamiones}" var="camion">
		<li>${camion.matricula}</li>
		<li>${camion.modelo}</li>
		<li>${camion.tipo}</li>
		<li>${camion.potencia}</li>
		<br>
	</c:forEach>

</body>
</html>