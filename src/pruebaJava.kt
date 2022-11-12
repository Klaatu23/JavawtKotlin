fun main()
{
    /*Asignación de la instancia a una variable inmutable llamada indice
      se emplea el constructor de la clase Java BMI y se pasan los argumentos */
    val indice = BMI(80.70,1.70)

   /*Una vez instanciada la clase se emplea el metodo de la clase BMI, showResult()*/
    var showIndex = indice.showResult()
    /*se da formato al resultado, indicando solo se muestre un digito flotante*/
    var result =String.format("%.1f",showIndex);
    //impresion del resultado con formato
    print(result)
}