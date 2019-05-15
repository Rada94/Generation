var xhr=new XMLHttpRequest();

window.onload=function main()
{
	document.getElementById("btnAcepta").addEventListener("click", miSubmit);
}

function miSubmit()
{
	//Preparo mis datos
	xhr.onreadystatechange=callBack;
	var nombre=document.getElementById("txtNombre");
	var miFormulario=new FormData();

	//Preparo mi prceso asincrono
	miFormulario.append("txtNombre", nombre.value);
	xhr.open("POST", "Practica2Servlet", true);
	xhr.send(miFormulario);
}

function callBack()
{
	if(xhr.readyState==4 && xhr.status==200)
	{
		document.getElementById("divResultado").innerHTML=xhr.responseText;
	}
}