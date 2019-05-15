<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Prepared Statement</h2>
	<form action="CreatePreparedStatementServlet" method="POST">
		<p>
			<label for="txtNombreProducto">Nombre Producto</label>
			<input type="text" name="txtNombreProducto" id="txtNombreProducto">
		</p>
		<p>
			<label for="txtPrecioProducto">Precio</label>
			<input type="text" name="txtPrecioProducto" id="txtPrecioProducto">
		</p>
		<p>
			<label for="txtExistenciaProducto">Existencias</label>
			<input type="text" name="txtExistenciaProducto" id="txtExistenciaProducto">
		</p>
		<p>
			<input type="submit" value="A darle">
		</p>
	</form>
</body>
</html>