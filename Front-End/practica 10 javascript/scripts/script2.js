

/*console.log(HolaMundo());
console.log("Hola, Soy el macho castigador");
console.log(suma(2, 3));

var num1=parseInt(prompt("Introduce un número entero"));
var num2=parseInt(prompt("Introduce un otro número entero"));
console.log(suma(num1, num2));

var numero1=parseInt(prompt("Introduce un número entero"));
console.log("Es número primo?: "+isPrimo(numero1));

function HolaMundo()
{
    return "Hola Mundo";
}

function Saludar(mensaje)
{
    return mensaje;
}

function suma(num1, num2)
{
    return num1+num2;
}

function isPrimo(numero)
{
    var isprimo=true;
    for(var i=numero-1; i>1; i--)
    {
        if(numero%2==0)
        {
            isprimo=false;
        }
    }
    return isprimo;
}*/

//Comprobar pares e impares
console.log("-Pares / Impares");
var tamUsuario=parseInt(prompt("Introduzca la cantidad de números que desea ingresar"));
var array=[];

for(var i=0; i<tamUsuario; i++)
{
    array[i]=parseInt(prompt("No "+(i+1)));
}
console.log("Datos dentro del arreglo: "+array);
console.log("Tiene "+Impar(array)+" número(s) impar(es)");
console.log("Tiene "+Par(array)+" número(s) par(es)");
console.log("Tiene "+Nans(array)+" número(s) NaN(s)");

function Impar(array=[])
{
    var contImpares=0;
    for(var i=0; i<array.length; i++)
    {
        if(array[i]%2!=0)
        {
            contImpares++;
        }
    }
    return contImpares;
}

function Par(array=[], tamUsuario)
{
    var contPares=0;
    for(var i=0; i<array.length; i++)
    {
        if(array[i]%2==0)
        {
            contPares++;
        }
    }
    return contPares;
}

function Nans(array=[])
{
    var contNan=0;
    for(var i=0; i<array.length; i++)
    {
        if(isNaN(array[i]))
        {
            contNan++;
        }
    }
    return contNan;
}

//Factorial
console.log("-Factorial");
var numUsuario=parseInt(prompt("Ingrese un número"));
console.log("El factorial es: "+factorial(numUsuario));


function factorial(numUsuario)
{
    var resultado=1;
    for(var i=numUsuario; i>0; i--)
    {
        resultado*=i;
    }
    return resultado;
}

//Fibonacci
console.log("-Fibonacci");
var numUsuario=parseInt(prompt("Ingrese el la posicion que desea saber"));
console.log("En la posicion "+numUsuario+" esta un "+fibonacci(numUsuario));

function fibonacci(numUsuario)
{
    var des=1;
    var ant=1;
    var temp=0;

    for(var i=des+ant; i<numUsuario; i++)
    {
        temp=des;
        des=des+ant;
        ant=temp;
    }
    return des;
}

//Triangulo de pascal
console.log("-Triángulo de Pascal");
var numUsuario=parseInt(prompt("Ingrese el limite de columnas"));
for(var i=0; i<=numUsuario; i++)
{
    console.log(trianguloPascal(i));
}

function trianguloPascal(numFila)
{
    var array=[];
    for(var i=0; i<=numFila; i++)
    {
        array[i]=combinacion(numFila, i);
    }
    return array;
}

function combinacion(n, r)
{
    if(r==1)
    {
        return n;
    }
    else
    {
        if(n==r)
        {
            return 1;
        }
        else
        {
            return factorial(n) / (factorial(r) * factorial(n-r));
        }
    }
}

//Generar numeros aleatorios
console.log("-Numeros Aleatorios");
const TAMANIO_VECTOR=10;
var i=0;
var vector1=[TAMANIO_VECTOR];
var vector2=[TAMANIO_VECTOR];
var vector3=[TAMANIO_VECTOR];
while(i<TAMANIO_VECTOR)
{
    vector1[i]=Math.random()*100;
    vector2[i]=Math.floor(Math.random()*100);
    vector3[i++]=Math.ceil(Math.random()*100);
}
console.log(vector1);
console.log(vector2);
console.log(vector3);

//