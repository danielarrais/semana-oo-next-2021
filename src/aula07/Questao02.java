package aula07;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Eu sei dividir!");
        System.out.print("Informe o primeiro valor: ");
        int x = teclado.nextInt();

        System.out.print("Informe o segundo valor: ");
        int y = teclado.nextInt();
        double r = (x / y);

        System.out.println("O resultado da soma é " + r);
    }
}
