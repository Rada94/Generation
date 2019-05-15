window.onload=function()
{
    var miParrafo=document.getElementById("pLorem").addEventListener("click", mandarFormulario);
}

function mandarFormulario()
{
    alert("Se dio click en el parrafo");
    var miFormulario=document.forms["fnSuma"];
    miFormulario.submit();
}