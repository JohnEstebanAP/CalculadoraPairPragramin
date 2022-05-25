package com.sofka.software;
/**
 * [Realizar operaciones aritmeticas basicas para 2 datos.
 *
 * @version 1.0.0
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *         John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @since Esta presente desde la version 1.0.0
 */
public class Calculadora {
  private Double dato1;
  private Double dato2;

  /**
   * [Constructor con parametros de la clase Calculadura.]
   *
   * @param dato1 elemento de tipo Double que realiza la operación.
   * @param dato2 elemento de tipo Double que realiza la operación.
   * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
   *         John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
   * @since [1.0.0]
   */
  public Calculadora(Double dato1, Double dato2) {
    this.dato1 = dato1;
    this.dato2 = dato2;
  }

  /**
   * [Realizar la operación aritmética de la suma.]
   *
   * @return Suma de números
   * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com John Esteban Alvarez
   *     Piedrahita - esteban.ea145@gmail.com
   * @since [1.0.0]
   */
  public Double sumar() {
    return this.dato1 + this.dato2;
  }

  /**
   * [Realizar la operación aritmética de la Resta.]
   *
   * @return Suma de números
   * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com John Esteban Alvarez
   *     Piedrahita - esteban.ea145@gmail.com
   * @since [1.0.0]
   */
  public Double restar() {
    return this.dato1 - this.dato2;
  }

  /**
   * [Realizar la operación aritmética de la Multiplicación.]
   *
   * @return Suma de números
   * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com John Esteban Alvarez
   *     Piedrahita - esteban.ea145@gmail.com
   * @since [1.0.0]
   */
  public Double multiplicar() {
    return this.dato1 * this.dato2;
  }

  /**
   * [Realizar la operación aritmética de la División.]
   *
   * @return Suma de números
   * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com John Esteban Alvarez
   *     Piedrahita - esteban.ea145@gmail.com
   * @since [1.0.0]
   */
  public Double dividir() {
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
