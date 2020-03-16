<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crud java</title>
<style>
body, th, td {
	font-family: arial;
	padding: 10px;
	text-align: center;
}

html, body {
	width: 100%;
}

table {
	margin: 0 auto;
}
</style>
</head>
<body>
	<div>
		<h1>Crud java</h1>

		<table border="1">
			<tr>
				<td><a href="productos?opcion=crear"> Crear un Producto</a></td>
			</tr>
			<tr>
				<td><a href="productos?opcion=listar"> Listar Productos</a></td>
			</tr>
		</table>
	</div>
</body>
</html>