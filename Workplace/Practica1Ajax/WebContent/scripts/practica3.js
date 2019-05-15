var xhr=new XMLHttpRequest();
window.onload=function main()
{
    document.getElementById("btnDale").addEventListener("click", miSubmit);
}

function miSubmit()
{
    var nombre=document.getElementById("txtNombre").value;
	var apellidoP=document.getElementById("txtApellidoP").value;
	var apellidoM=document.getElementById("txtApellidoM").value;
	var domicilio=document.getElementById("txtDomicilio").value;
	var correo=document.getElementById("txtCorreo").value;
	var telefono=document.getElementById("txtTelefono").value;
	var rfc=document.getElementById("txtRFC").value;
	var estatura=document.getElementById("txtEstatura").value;
    xhr.open("GET", "Practica3Servlet?txtNombre="+nombre+"&txtApellidoP="+apellidoP+"&txtApellidoM="+apellidoM+"&txtDomicilio="+domicilio+"&txtCorreo="+correo+"&txtTelefono="+telefono+"&txtRFC="+rfc+"&txtEstatura="+estatura);
    xhr.onload=callBack;
    xhr.send(null);
}

function callBack()
{
	if(xhr.status==200)
	{
		document.getElementById("divResultado").innerHTML=xhr.responseText;
	}
}