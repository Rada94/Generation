window.onload=function()
{
    document.getElementById("btnMensaje").addEventListener("click", monstrarMensaje);
    document.getElementById("btnSumar").addEventListener("click", sumaNumeros);
    document.getElementById("btnGenerarNombre").addEventListener("click", generarNombre);
}

function monstrarMensaje()
{
    var mensaje=document.getElementById("txtMensaje").value;
    alert(mensaje);
}

function sumaNumeros()
{
    var numero1=parseInt(document.getElementById("txtNumero1").value);
    var numero2=parseInt(document.getElementById("txtNumero2").value);
    alert("El resultado es: "+(numero1+numero2));
}

function generarNombre()
{
    var nombreCompleto=document.getElementById("txtNombre").value+" "+document.getElementById("txtApellidoP").value+" "+document.getElementById("txtApellidoM").value;
    alert("El nombre completo es: "+nombreCompleto);
}