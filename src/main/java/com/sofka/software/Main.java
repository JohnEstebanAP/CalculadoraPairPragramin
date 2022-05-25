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
    Double num1;
    Double num2;

    final String requestData1 = "Por favor Ingreso el número 1";
    final String requestData2 = "Por favor Ingreso el número 2";

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
                "\n--------------------------\n"
                    + "     Resultado =  suma {0}    "
                    + "\n--------------------------\n",
                calculadora.sumar());
            break;
          case 2:
            logger.info(requestData1);
            num1 = scanner.nextDouble();
            logger.info(requestData2);
            num2 = scanner.nextDouble();

            calculadora = new Calculadora(num1, num2);
            logger.log(
                Level.INFO,
                "\n--------------------------\n"
                    + "     Resultado =  Resta {0}    "
                    + "\n--------------------------\n",
                calculadora.restar());
            break;
          case 3:
            logger.info(requestData1);
            num1 = scanner.nextDouble();
            logger.info(requestData2);
            num2 = scanner.nextDouble();

            calculadora = new Calculadora(num1, num2);
            logger.log(
                Level.INFO,
                "\n--------------------------\n"
                    + "     Resultado =  Multiplicación {0}    "
                    + "\n--------------------------\n",
                calculadora.multiplicar());
            break;
          case 4:
            logger.info(requestData1);
            num1 = scanner.nextDouble();
            logger.info(requestData2);
            num2 = scanner.nextDouble();

            calculadora = new Calculadora(num1, num2);
            logger.log(
                Level.INFO,
                "\n--------------------------\n"
                    + "     Resultado =  División {0}    "
                    + "\n--------------------------\n",
                calculadora.dividir());
            break;
          default:
            logger.warning(
                "\n--------------------------------\n"
                    + "  La opcion es incorrecta."
                    + "\n--------------------------------");
            break;
        }
      }
    } catch (InputMismatchException ex) {
      logger.severe("ingrese un valor correcto " + ex.getMessage());
    }
  }



}
