package aula05.contaBancaria.camadaDados;

import java.util.ArrayList;
import java.util.List;

import aula05.contaBancaria.camadaModel.Conta;
import aula05.contaBancaria.exceptions.NumeroNulloException;
import aula05.contaBancaria.exceptions.RegistroNaoEncontradoException;

public class ContaDAOMemoria implements ContaDAO {

    private List<Conta> contas;

    public ContaDAOMemoria() {
        contas = new ArrayList<Conta>();
    }

    @Override
    public void salvar(Conta conta) {
        contas.add(conta);
    }

    @Override
    public void excluir(Conta conta) {
        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if (contaAtual.numero.equals(conta.numero)) {
                contas.remove(i);
            }
        }
    }

    @Override
    public Conta buscar(String numero) throws RegistroNaoEncontradoException {
        Conta contaEncontrada = null;

        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            try {
                if (numero.equals(contaAtual.numero)) {
                    contaEncontrada = contas.get(i);
                }
            } catch (NullPointerException e) {
                throw new NumeroNulloException("Você precisa informar um número valido", e);
            }
        }

        if (contaEncontrada == null) {
            throw new RegistroNaoEncontradoException("A conta de número " + numero + " não foi encontrada");
        }

        return contaEncontrada;
    }

    @Override
    public void atualizar(Conta conta) {
        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if (contaAtual.numero.equals(conta.numero)) {
                contas.remove(i);
                contas.add(conta);
                return;
            }
        }
    }

    @Override
    public List<Conta> listar() {
        return contas;
    }

    @Override
    public List<Conta> listarContasDoBanco(Integer numeroBanco, String nomeBanco) {
        return contas;
    }

}
