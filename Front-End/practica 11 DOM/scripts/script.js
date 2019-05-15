window.onload= function()
{
    var miBotoncitoMatar=0;
    miBotoncitoMatar = document.getElementById("btnMatar");
    console.log(miBotoncitoMatar);
    miBotoncitoMatar.onclick=mensajeMatar;

    document.getElementById("divParrafo").onmouseenter=mensajeConsola;
    document.getElementById("divParrafo").onmouseleave=function()
    {
        console.log("Saliste de div");
    }
    document.getElementById("divParrafo").ondblclick=()=>
    {
        console.log("Diste doble click");
    }
}

function mensajeMatar()
{
    alert("La vas a matar Prro!!!");
}

function mensajeConsola()
{
    console.log("Entraste al div");
}

/*
$(()=>
{
    alert("TXT!!");
});


//Función fecha
window.onload=()=>
{
    alert("TXT!!");
}
*/
/*
Método clásico
window.onload=function()
{
    alert("TXT!!");
}
*/
/*
Mético vieja escuela
window.onload=main();

function main()
{
    alert("TXT!!");
}*/