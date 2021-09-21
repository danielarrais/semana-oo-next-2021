package aula05;

import java.util.ArrayList;

import aula05.contaBancaria.Banco;
import aula05.contaBancaria.Conta;
import aula05.contaBancaria.ContaCorrente;
import aula05.contaBancaria.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        ContaCorrente contaCorrenteUm = new ContaCorrente("888686-7", "005774", 0.0, 100.0);
        ContaCorrente contaCorrenteDois = new ContaCorrente("888686-8", "005774", 0.0, 100.0);
        ContaPoupanca contaPoupancaUm = new ContaPoupanca("888686-9", "005774", 100.0);

        ArrayList<Conta> listaContas = new ArrayList<Conta>();

        listaContas.add(contaCorrenteUm);
        listaContas.add(contaCorrenteDois);
        listaContas.add(contaPoupancaUm);

        Banco bancoSantander = new Banco(454, "Santander", listaContas);
    
        bancoSantander.tranferir("888686-7", "888686-9", 100.0);
        System.out.println("Saldo conta corrente um: " + contaCorrenteUm.getSaldo());
        System.out.println("Saldo conta contaPoupancaUm: " + contaPoupancaUm.getSaldo());


        bancoSantander.tranferir("888686-8", "345", "435345-8", "5656", "44499988845", "Daniel", 100.0);
        System.out.println("Saldo conta contaCorrenteDois: " + contaCorrenteDois.getSaldo());

    }
}
