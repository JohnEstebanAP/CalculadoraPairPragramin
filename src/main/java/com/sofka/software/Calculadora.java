package com.sofka.software;

public class Calculadora {
    private Double dato1;
    private Double dato2;

    /**
     * [Realizar operaciones aritmeticas basicas para 2 datos.
     *
     *
     *
     * @version 1.0.0
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *         John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     *
     * @since Esta presente desde la version 1.0.0
     *
     */
    public Calculadora(Double dato1, Double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public Calculadora() {
        this.dato1 = 0.0;
        this.dato2 = 0.0;
    }

    /**
     * [Detalle el objetivo del método.
     *
     * incorpore indicaciones de uso del mismo para facilitar su compresión.
     * ej.:
     *
     *   ...;
     *   clase.unaLogicaDeNegocioDeterminada(valor1, valor2);
     *   ValorDeRespuesta valor = clase.execute();
     * ]
     *
     * @param arg
     * @param arg2
     * @return
     * @throws Exception
     *
     * @author [Ingrese nombre, apellido y correo electrónico del autor.
     *            ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
     *
     * @since [Ingrese desde que versión del sistema está presente el método]
     *
     * @see [Indique si existe código que deba ser consultado como material de apoyo a este código
     * Para consultar sobre el uso de este tag, visite la siguiente dirección
     * <a href="http://download.oracle.com/javase/1.5.0/docs/tooldocs/windows/javadoc.html#@see">javadoc - The Java API Documentation Generator</a>]
     *
     * @deprecated [Indique si el método es obsoleto, a partir de cuando será discontinuado
     *               y provea un link al, o los, método que lo reemplazará.
     *               ej: {@link #remove(int)} and {@link #removeAll()}
     *               Para consultar sobre el uso del tag link, visite la siguiente dirección
     *               <a href="http://download.oracle.com/javase/1.5.0/docs/tooldocs/windows/javadoc.html#{@link}">javadoc - The Java API Documentation Generator</a>
     *               ATENCION!: BORRE ESTE TAG SI NO APLICA!!!!!.]
     *
     */
    public Double sumar(){
        return this.dato1 + this.dato2;
    }

    public Double restar(){
        return this.dato1 - this.dato2;
    }

    public Double multiplicar(){
        return this.dato1 * this.dato2;
    }

    public Double dividir(){
        return this.dato1 / this.dato2;
    }

    public Double getDato1() {
        return dato1;
    }

    public void setDato1(Double dato1) {
        this.dato1 = dato1;
    }

    public Double getDato2() {
        return dato2;
    }

    public void setDato2(Double dato2) {
        this.dato2 = dato2;
    }
}
