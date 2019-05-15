<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="../createPropsServlet" method="POST">
        <p>
            <label for="txtNombreProducto">Nombre del Producto</label>
            <input class="form-control" type="text" name="txtNombreProducto" id="txtNombreProducto">
        </p>
        <p>
            <label for="txtPrecioProducto">Precio del producto</label>
            <input class="form-control" type="text" name="txtPrecioProducto" id="txtPrecioProducto">
        </p>
        <p>
            <label for="txtExistenciaProducto">Existencias</label>
            <input class="form-control" type="text" name="txtExistenciaProducto" id="txtExistenciaProducto">
        </p>
        <p>
            <input class="btn btn-primary" type="submit" value="Crear">
        </p>
    </form>
</body>
</html>