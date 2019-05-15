var xhr=XMLHttpRequest();
window.onload=function main()
{
	document.getElementById("btnDale").addEventListener("click", btnDale);
}

function btnDale()
{	
	xhr.onreadystatechange=callBack;

	var nombre=document.getElementById("txtNombre").value;
	var apellidoP=document.getElementById("txtApellidoP").value;
	var apellidoM=document.getElementById("txtApellidoM").value;
	var correo=document.getElementById("txtCorreo").value;

	var formulario=new FormData();
	formulario.append("txtNombre", nombre.value);
	formulario.append("txtApellidoP", apellidoP.value);
	formulario.append("txtApellidoM", apellidoM.value);
	formulario.append("txtCorreo", correo.value);

	xhr.open("POST", "CreaetePersonaServlet");
	xhr.send(formulario);
}

function callBack()
{
	if(xhr.status==200)
	{
		document.getElementById("divResultado").innerHTML=xhr.responseText;
	}
}