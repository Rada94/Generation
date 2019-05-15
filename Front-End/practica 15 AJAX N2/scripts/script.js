var xhr=new XMLHttpRequest();

window.onload=function main()
{
    document.getElementById("btnPresioname").addEventListener("click", procesaAjaxNivel2);
    var resultadoFuncion1=mensaje;
    var resultadoFuncion2=mensaje();

    console.log(resultadoFuncion1);
    console.log(resultadoFuncion2);

}

function procesaAjaxNivel2()
{
    xhr.open("get", "resultado.html");
    xhr.onload=functionCallBack;
    xhr.send(null);
}

function functionCallBack()
{
    if(xhr.status==200)
    {
        console.log("Petición procesada con éxito");
        document.getElementById("divResultado").innerHTML=xhr.responseText;
    }
}

function mensaje()
{
    var miVariable=2+2;
    return miVariable;
}