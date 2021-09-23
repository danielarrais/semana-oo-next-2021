package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
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
            } catch (ArithmeticException e) {
                System.out.println("Você não pode dividir zero por zero");
            } catch (InputMismatchException e) {
                System.out.println("Você não informou um número");
            } finally { // inutil
                System.out.println("Esse mensagem sempre será mostrada com erro ou sem");
            }
        } while(!pararExecucao);
    }
}