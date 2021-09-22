package aula05;

import java.util.ArrayList;

import aula05.contaBancaria.Conta;
import aula05.contaBancaria.ContaCorrente;
import aula05.contaBancaria.ContaPoupanca;
import aula05.contaBancaria.dao.ContaDAO;
import aula05.contaBancaria.dao.ContaDAOBanco;
import aula05.contaBancaria.dao.ContaDAOMemoria;

public class App {
    public static void main(String[] args) {
        ContaCorrente contaCorrenteUm = new ContaCorrente("888686-7", "005774", 0.0, 100.0);
        ContaCorrente contaCorrenteDois = new ContaCorrente("888686-8", "005774", 0.0, 100.0);
        ContaPoupanca contaPoupancaUm = new ContaPoupanca("888686-9", "005774", 100.0);

        // ArrayList<Conta> listaContas = new ArrayList<Conta>();

        // listaContas.add(contaCorrenteUm);
        // listaContas.add(contaCorrenteDois);
        // listaContas.add(contaPoupancaUm);

        // Banco bancoSantander = new Banco(454, "Santander", listaContas);
    
        // bancoSantander.tranferir("888686-7", "888686-9", 100.0);
        // System.out.println("Saldo conta corrente um: " + contaCorrenteUm.getSaldo());
        // System.out.println("Saldo conta contaPoupancaUm: " + contaPoupancaUm.getSaldo());

        // bancoSantander.tranferir("888686-8", "345", "435345-8", "5656", "44499988845", "Daniel", 100.0);
        // System.out.println("Saldo conta contaCorrenteDois: " + contaCorrenteDois.getSaldo());

        // System.out.println("");

        // Conta contaGenrica = new Conta("888686-7", "005774", 5000000.00);
        boolean ambienteTeste = true;

        // Inicializa a classe de acesso aos dados
        ContaDAO contaDAO = null;

        if(ambienteTeste) {
            contaDAO = new ContaDAOMemoria();
        } else {
            contaDAO = new ContaDAOBanco();
        }

        // Grava contas
        contaDAO.salvar(contaCorrenteDois);
        contaDAO.salvar(contaCorrenteDois);
        contaDAO.salvar(contaCorrenteDois);
        contaDAO.salvar(contaCorrenteUm);
        contaDAO.salvar(contaPoupancaUm);

        // Recuperou a conta
        Conta contaDOCliente = contaDAO.buscar("888686-7");
        System.out.println("Buscou a conta: " + contaDOCliente);
        
        // Atualizar
        contaDOCliente.creditarSaldo(100.00);
        System.out.println("Creditou 100 da conta: " + contaDOCliente);

        // Grava conta com novo saldo
        contaDAO.atualizar(contaDOCliente);

        // Buscou para confirmar alterações
        Conta contaDOClienteAtualizada = contaDAO.buscar("888686-7");
        System.out.println("Buscou a conta atualizada: " + contaDOClienteAtualizada);

        System.out.println("Total de contas em memória: " + contaDAO.listar().size());

        // ArrayList<Conta> listaContas = contaDAO.listarContasDoBanco(454, "Santander");
        // Banco bancoSantander = new Banco(454, "Santander", listaContas);

    }
}
