<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVCPráctica 5</title>
</head>
<body>
	<h2>Práctica 5 MVC - Scriptlets</h2>
	<table>
	<thead>
		<tr><th>Id</th><th>Nombre</th></tr>
	</thead>
	<tbody>
	<%
		for(int i=1;i<=100; i++)
		{
			out.println("<tr><td>"+i+"</td><td>El macho castigador!!</td></tr>");
		}
	%>
	</tbody>
	</table>
	
	<jsp:scriptlet>
		out.println("Donec sit amet tortor sem. Vestibulum fermentum velit sed mauris congue, a commodo tortor pretium. Cras quis massa dignissim risus ultrices iaculis luctus a nisi. Aliquam vitae ligula a sapien mollis bibendum sed id felis. Praesent tincidunt vulputate ornare. Aliquam imperdiet malesuada odio, vitae euismod quam posuere vitae. Fusce porta nibh ut dolor sollicitudin, non tempor turpis cursus. Vestibulum volutpat mattis enim, et ornare arcu porta volutpat. Donec non sodales urna. Sed mi metus, interdum quis viverra et, finibus ut turpis. Etiam quis enim nunc.");
	</jsp:scriptlet>
	
</body>
</html>