package aula05.contaBancaria.dao;

import java.util.ArrayList;

import aula05.contaBancaria.Banco;
import aula05.contaBancaria.Conta;

public class ContaDAOMemoria implements ContaDAO {

    private ArrayList<Conta> contas;

    public ContaDAOMemoria() {
        contas = new ArrayList<Conta>();
    }

    @Override
    public void salvar(Conta conta) {
        Conta contaAtual = buscar(conta.numero);

        if(contaAtual != null) {
            atualizar(conta);
        } else {
            contas.add(conta);
        }
    }

    @Override
    public void excluir(Conta conta) {
        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if(contaAtual.numero.equals(conta.numero)) {
                contas.remove(i);
            }
        }
    }

    @Override
    public Conta buscar(String numero) {
        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if(contaAtual.numero.equals(numero)) {
                return contas.get(i);
            }
        }
        
        return null;
    }

    @Override
    public void atualizar(Conta conta) {
        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if(contaAtual.numero.equals(conta.numero)) {
                contas.remove(i);
                contas.add(conta);
                return;
            }
        }
    }

    @Override
    public ArrayList<Conta> listar() {
        return contas;
    }

    @Override
    public ArrayList<Conta> listarContasDoBanco(Integer numeroBanco, String nomeBanco) {
        return contas;
    }
    
}
