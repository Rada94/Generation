<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Práctica 6 - APIs</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Práctica 6 - APIs</h2>
    <%-- <%= out.println("Testo") %> --%>
    <c:out value="Testo"></c:out>
    
    <%-- <%! String mensaje="Hola"; %> --%>
    <c:set var="miMensaje" value="Hola"></c:set>
    <c:out value="${miMensaje}"></c:out>
    
   <%--  <%for(int i=0; i<10; i++)
    	{
    		out.println("Numero: "+i);
    	}
    	%> --%>
    
    <table class="table">
    <thead>
    	<tr><th>Descripción</th></tr>
    </thead>
    <tbody>
    	<c:forEach var="j" begin="1" end="10">
    		<tr>
    			<td>Numero: <c:out value="${j}"></c:out></td>
    		</tr>
    	</c:forEach>
    </tbody>
    </table>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="scripts/script.js"></script>
</body>
</html>