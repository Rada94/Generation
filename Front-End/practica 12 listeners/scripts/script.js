var temp=0;

window.onload=function()
{
    var miBotoncito=0;
    miBotoncito=document.getElementById("btnBoton");
    miBotoncito.addEventListener("click", miFuncion);

    document.getElementById("btnBorrar").addEventListener("click", borrarTesto);
    document.getElementById("btnRegresar").addEventListener("click", regresarTesto);
    document.getElementById("btnRojo").addEventListener("click", cambiarRojo);
}

function miFuncion()
{
    console.log("Diste en el botón!!!");
}

function borrarTesto()
{
    temp=document.getElementById("parrafo").innerHTML;
    document.getElementById("parrafo").innerHTML="";
}

function regresarTesto()
{
    document.getElementById("parrafo").innerHTML=temp;
}

function cambiarRojo()
{
    document.getElementById("parrafo").style.backgroundColor="Red";
}