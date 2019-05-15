window.onload=function main()
{
    //Ejercicio 1
    var misVerduras=["Platano", "Pepino", "Berenjenda","Caña"];

    var misVerdurasJson=JSON.stringify(misVerduras);
    console.log(misVerduras);
    console.log(misVerdurasJson);

    var miCadena="{\"nombre\":\"Salvador\",\"apellidoP\":\"Rada\",\"apellidoM\":\"Vaca\",\"domicilio\":\"Pizarra\",\"correo\":\"j.j.virus@hotmail.com\",\"telefono\":\"31805447\",\"rfc\":\"SVAR758493HFJDH\",\"estatura\":\"1.85\"}";
    var miCadenaJson=JSON.parse(miCadena);

    console.log(miCadena);
    console.log(miCadenaJson);
}