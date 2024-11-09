package org.example;

import java.util.Scanner;

public class Entradas {
    public static final Scanner sc = new Scanner(System.in);

    public static int lerInt(){
        int i = 0;
        boolean entradaValida = false;
        while (!entradaValida){
            try {
                i = sc.nextInt();
                entradaValida = true;
            }catch(Exception e) {
                System.out.println("Digite um numero inteiro.");
            }finally{
                sc.nextLine();
            }
        }
        return i;
    }

    public static double lerDouble(){
        double i = 0;
        boolean entradaValida = false;
        while (!entradaValida){
            try {
                i = sc.nextDouble();
                entradaValida = true;
            }catch(Exception e) {
                System.out.println("Digite um numero real.");
            }finally{
                sc.nextLine();
            }
        }
        return i;
    }

    public static String lerString(){
      String valor = "";
      valor = sc.nextLine();
      return valor;
    }


}
