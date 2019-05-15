var xhr=new XMLHttpRequest();

window.onload=function main()
{
    document.getElementById("btnPresioname").addEventListener("click", procesaAjax);
}

function procesaAjax()
{
    xhr.open("get", "resultado.html", true);
    xhr.onreadystatechange=functionCallBack;
    xhr.send();
}

function functionCallBack()
{
    if(xhr.readyState==1)
    {
        console.log("Estamos en estado 1");
    }
    else
    {
        if(xhr.readyState==2)
        {
            console.log("Estamos en estado 2");
        }
        else
        {
            if(xhr.readyState==3)
            {
                console.log("Estamos en estado 3");
            }
            else
            {
                if(xhr.readyState==4 && xhr.status==200)
                {
                    console.log("Estamos en estado 4");
                    document.getElementById("divResultado").innerHTML=xhr.responseText;
                }
            }
        }
    }
}
