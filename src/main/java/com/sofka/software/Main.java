package com.sofka.software;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger(Main.class.getName());
    Scanner scanner = new Scanner(System.in);
    Calculadora calculadora;
    int opcion = 1;
    double num1;
    double num2;

    final String requestData1 = "Por favor Ingreso el número 1";
    final String requestData2 = "Por favor Ingreso el número 2";
    final String separator = "\n---------------------------------\n";

    try {
      while (opcion != 5) {
        logger.info(
            "Binevenido a la calculadora \n"
                + "Escoja la opcion deseada \n"
                + "1. Sumar \n"
                + "2. Restar "
                + "\n3. Multiplicar "
                + "\n4. Dividir "
                + "\n5. Salir");

        opcion = scanner.nextInt();
        switch (opcion) {
          case 1:
            logger.info(requestData1);
            num1 = scanner.nextDouble();
            logger.info(requestData2);
            num2 = scanner.nextDouble();

            calculadora = new Calculadora(num1, num2);
            logger.log(
                Level.INFO,
                "{1}"
                    + "     Resultado =  suma {0}    "
                    + "\n{1}",
                    new Object[] {calculadora.sumar(), separator});
            break;
          case 2:
            logger.info(requestData1);
            num1 = scanner.nextDouble();
            logger.info(requestData2);
            num2 = scanner.nextDouble();

            calculadora = new Calculadora(num1, num2);
            logger.log(
                Level.INFO,
                "{1}"
                    + "     Resultado =  Resta {0}    "
                    + "{1}",
                new Object[] {calculadora.restar(), separator});
            break;
          case 3:
            logger.info(requestData1);
            num1 = scanner.nextDouble();
            logger.info(requestData2);
            num2 = scanner.nextDouble();

            calculadora = new Calculadora(num1, num2);
            logger.log(
                Level.INFO,
                "{1}"
                    + "     Resultado =  Multiplicación {0}    "
                    + "{1}",
                    new Object[] {calculadora.multiplicar(), separator});
            break;
          case 4:
            logger.info(requestData1);
            num1 = scanner.nextDouble();
            logger.info(requestData2);
            num2 = scanner.nextDouble();

            calculadora = new Calculadora(num1, num2);
            logger.log(
                Level.INFO,
                "{1}"
                    + "     Resultado =  División {0}    "
                    + "{1}",
                    new Object[] {calculadora.dividir(), separator});
            break;
          case 5:
            break;
          default:
            logger.log(Level.WARNING,
                "{0}"
                    + "  La opcion es incorrecta."
                    + "\n{0}", separator);
            break;
        }
      }
    } catch (InputMismatchException ex) {
      logger.severe("ingrese un valor correcto " + ex.getMessage());
    }
  }



}
