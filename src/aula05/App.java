package aula05;

import java.util.ArrayList;

import aula05.contaBancaria.camadaDados.ContaDAO;
import aula05.contaBancaria.camadaDados.ContaDAOBanco;
import aula05.contaBancaria.camadaDados.ContaDAOMemoria;
import aula05.contaBancaria.camadaModel.Conta;
import aula05.contaBancaria.camadaModel.ContaCorrente;
import aula05.contaBancaria.camadaModel.ContaPoupanca;
import aula05.contaBancaria.camadaNegocios.ContaService;
import aula05.contaBancaria.exceptions.ContaJaExisteException;
import aula05.contaBancaria.exceptions.FalhaTransacaoException;
import aula05.contaBancaria.exceptions.NumeroNulloException;
import aula05.contaBancaria.exceptions.RegistroNaoEncontradoException;
import aula05.contaBancaria.exceptions.SaldoInsuficienteParaSaqueException;

public class App {
    public static void main(String[] args) throws SaldoInsuficienteParaSaqueException {
        ContaCorrente contaCorrenteUm = new ContaCorrente("888686-7", "005774", 0.0, 100.0);
        ContaCorrente contaCorrenteDois = new ContaCorrente("888686-8", "005774", 0.0, 100.0);
        ContaPoupanca contaPoupancaUm = new ContaPoupanca("888686-9", "005774", 100.0);

        ContaDAO contaDaoMemoria = new ContaDAOMemoria();
        ContaService contaService = new ContaService(contaDaoMemoria);

        try {
            contaService.salvar(contaCorrenteUm);
            contaService.debitarSaldo("005774", "888686-7", 60.0);

            Conta contaAtualizada = contaService.buscar("888686-7");
            System.out.println("Novo saldo: " + contaAtualizada.getSaldo());
        } catch (FalhaTransacaoException e) {
            e.printStackTrace();
        } catch (SaldoInsuficienteParaSaqueException e) {
            e.printStackTrace();
        } catch (RegistroNaoEncontradoException e) {
            e.printStackTrace();
        } catch (ContaJaExisteException e) {
            e.printStackTrace();
        }
    }
}
