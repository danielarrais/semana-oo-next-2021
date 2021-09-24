package aula05;

import java.util.ArrayList;

import aula05.contaBancaria.camadaDados.ContaDAO;
import aula05.contaBancaria.camadaDados.ContaDAOBanco;
import aula05.contaBancaria.camadaDados.ContaDAOMemoria;
import aula05.contaBancaria.camadaModel.Conta;
import aula05.contaBancaria.camadaModel.ContaCorrente;
import aula05.contaBancaria.camadaModel.ContaPoupanca;
import aula05.contaBancaria.exceptions.FalhaTransacaoException;
import aula05.contaBancaria.exceptions.NumeroNulloException;
import aula05.contaBancaria.exceptions.RegistroNaoEncontradoException;
import aula05.contaBancaria.exceptions.SaldoInsuficienteParaSaqueException;

public class App {
    public static void main(String[] args) throws SaldoInsuficienteParaSaqueException {
        ContaCorrente contaCorrenteUm = new ContaCorrente("888686-7", "005774", 0.0, 100.0);
        ContaCorrente contaCorrenteDois = new ContaCorrente("888686-8", "005774", 0.0, 100.0);
        ContaPoupanca contaPoupancaUm = new ContaPoupanca("888686-9", "005774", 100.0);

        try {
            contaPoupancaUm.debitarSaldo(150.0);
        } catch (SaldoInsuficienteParaSaqueException e) {
            System.out.println(e.getMessage());
            System.out.println("Saldo atual da conta: " + e.getSaldoAtual());
        } catch (FalhaTransacaoException e) {
            System.out.println(e.getMessage());
            System.out.println("Tipo de transacao que deu erro: " + e.getTipoTransacao());
        }

        // contaPoupancaUm.debitarSaldo(150.0);

        // ArrayList<Conta> listaContas = new ArrayList<Conta>();

        // listaContas.add(contaCorrenteUm);
        // listaContas.add(contaCorrenteDois);
        // listaContas.add(contaPoupancaUm);

        // Banco bancoSantander = new Banco(454, "Santander", listaContas);

        // bancoSantander.tranferir("888686-7", "888686-9", 100.0);
        // System.out.println("Saldo conta corrente um: " + contaCorrenteUm.getSaldo());
        // System.out.println("Saldo conta contaPoupancaUm: " +
        // contaPoupancaUm.getSaldo());

        // bancoSantander.tranferir("888686-8", "345", "435345-8", "5656",
        // "44499988845", "Daniel", 100.0);
        // System.out.println("Saldo conta contaCorrenteDois: " +
        // contaCorrenteDois.getSaldo());

        // System.out.println("");

        // Conta contaGenrica = new Conta("888686-7", "005774", 5000000.00);
        // boolean ambienteTeste = true;

        // Inicializa a classe de acesso aos dados
        // ContaDAO contaDAO = null;

        // if (ambienteTeste) {
        //     contaDAO = new ContaDAOMemoria();
        // } else {
        //     contaDAO = new ContaDAOBanco();
        // }

        // // Grava contas
        // contaDAO.salvar(contaCorrenteDois);
        // contaDAO.salvar(contaCorrenteDois);
        // contaDAO.salvar(contaCorrenteDois);
        // contaDAO.salvar(contaCorrenteUm);
        // contaDAO.salvar(contaPoupancaUm);

        // // Recuperou a conta
        // try {
        //     Conta contaDOCliente = contaDAO.buscar("8886865-7");
        //     System.out.println("Buscou a conta: " + contaDOCliente);

        //     // Atualizar
        //     contaDOCliente.creditarSaldo(100.00);
        //     System.out.println("Creditou 100 da conta: " + contaDOCliente);

        //     // Grava conta com novo saldo
        //     contaDAO.atualizar(contaDOCliente);
        // } catch (RegistroNaoEncontradoException e) {
        //     System.out.println(e.getMessage());
        // }

        // try {
        //     contaDAO.buscar(null);
        // } catch (NumeroNulloException e){
        //     e.printStackTrace();
        //     System.out.println(e.getMessage());
        // }

        // // Buscou para confirmar alterações
        // Conta contaDOClienteAtualizada = contaDAO.buscar("888686-7");
        // System.out.println("Buscou a conta atualizada: " + contaDOClienteAtualizada);

        // System.out.println("Total de contas em memória: " + contaDAO.listar().size());

        // ArrayList<Conta> listaContas = contaDAO.listarContasDoBanco(454,
        // "Santander");
        // Banco bancoSantander = new Banco(454, "Santander", listaContas);

    }
}
