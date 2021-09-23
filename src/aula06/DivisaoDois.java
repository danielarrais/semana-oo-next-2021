package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoDois {
    public static void main(String[] args) {
        boolean pararExecucao = false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
    
                System.out.print("Informe o primeiro numero: ");
                int primeiroNumero = scanner.nextInt();
    
                System.out.print("Informe o segundo numero: ");
                int segundoNumero = scanner.nextInt();
    
                System.out.println("O resultado da divisão é " + (primeiroNumero / segundoNumero));
                pararExecucao = true;
                scanner.close();
            } catch (Exception e) {
                System.out.println("Alguma coisa de errada não deu certo!");
            } finally { // inutil
                System.out.println("Esse mensagem sempre será mostrada com erro ou sem");
            }
        } while(!pararExecucao);
    }
}