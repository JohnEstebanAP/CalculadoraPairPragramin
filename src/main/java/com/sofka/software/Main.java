package com.sofka.software;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(5.0,8.0);
        boolean opcion = true;
        while (opcion) {
            logger.info("Binevenido a la calculadora");
            logger.info("Escoja la opcion deseada");
            logger.info("1. Sumar");
            logger.info("2. Restar");
            logger.info("3. Multiplicar");
            logger.info("4. Dividir");
            int op = 0;
            switch (op) {
                case 1:
                    break;
            }


        }


    }
}