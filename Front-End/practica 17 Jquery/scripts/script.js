/*$(document).ready(
    function()
    {
        alert("Text JQuery");
        $("p#Primero").hide();
        $("p.Tercero").hide();
    }
);*/

$(
    function(){
        alert("Texto en JQuery");
        $(".hola").click
        (
            function()
            {
                alert("Mi texto");
            }
        );
        $("#btnBoton1").click(msgOtroTesto);
        $("#btnBoton3").click(msgOtroTesto);
        $("p").click(msgOtroTesto);
    }
);

function msgOtroTesto()
{
    alert("Otro Texto");
}