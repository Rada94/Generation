<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Document</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">
			<form action="Practica3Servlet" method="GET">
				<label for="txtNombre">Nombre</label>
				<input class="form-control" type="text" id="txtNombre" name="txtNombre"></br>
				<label for="txtApellidoP">Apellido Paterno</label>
				<input class="form-control" type="text" id="txtApellidoP" name="txtApellidoP"></br>
				<label for="txtApellidoM">Apellido Materno</label>
				<input class="form-control" type="text" id="txtApellidoM" name="txtApellidoM"></br>
				<label for="txtDomicilio">Domicilio</label>
				<input class="form-control" type="text" id="txtDomicilio" name="txtDomicilio"></br>
				<label for="txtCorreo">Correo</label>
				<input class="form-control" type="txt" id="txtCorreo" name="txtCorreo"></br>
				<label for="txtTelefono">Teléfono</label>
				<input class="form-control" type="text" id="txtTelefono" name="txtTelefono"></br>
				<label for="txtRFC">RFC</label>
				<input class="form-control" type="text" id="txtRFC" name="txtRFC"></br>
				<label for="txtRFC">Estatura</label>
				<input class="form-control" type="text" id="txtEstatura" name="txtEstatura"></br>
				<input class="btn btn-dark" id="btnDale" type="button" value="Dale">
			</form>
		</div>
		<div id="divResultado"></div>
	</div>
</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script type="text/javascript" src="scripts/practica3.js"></script>
</body>
</html>