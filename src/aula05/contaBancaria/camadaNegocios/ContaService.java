package aula05.contaBancaria.camadaNegocios;

import aula05.contaBancaria.camadaModel.Transacao;
import aula05.contaBancaria.camadaDados.ContaDAO;
import aula05.contaBancaria.camadaModel.Conta;
import aula05.contaBancaria.exceptions.ContaJaExisteException;
import aula05.contaBancaria.exceptions.FalhaTransacaoException;
import aula05.contaBancaria.exceptions.SaldoInsuficienteParaSaqueException;

public class ContaService {
    private ContaDAO contaDAO;

    public ContaService(ContaDAO contaDAO) {
        if (contaDAO == null) {
            throw new IllegalArgumentException("contaDAO não pode ser nulo");
        }

        this.contaDAO = contaDAO;
    }

    public void salvar(Conta conta) throws ContaJaExisteException {
        if(contaDAO.existe(conta.getNumero())) {
            throw new ContaJaExisteException(conta.getNumero());
        }

        this.contaDAO.salvar(conta);
    }

    public void excluir(Conta conta) {
        contaDAO.excluir(conta);
    };
    
    public Conta buscar(String numero) {
        return contaDAO.buscar(numero);
    };

    // Métodos (Ações)
    // modificador de acesso - tipo de retorno - NomeDaClasse - parametros
    public void debitarSaldo(String agencia, String numeroConta, Double saque) throws FalhaTransacaoException, SaldoInsuficienteParaSaqueException {
        Conta conta = contaDAO.buscar(numeroConta);
        
        if (conta.podeSacar(saque)) {
            conta.setSaldo(conta.getSaldo() - saque);
            registrarTransacao(conta, saque, Transacao.DEBITO);

            contaDAO.atualizar(conta);
        } else {
            throw new SaldoInsuficienteParaSaqueException(conta.getSaldo());
        }
    }

    private void registrarTransacao(Conta conta, Double valor, String tipoTransacao) throws FalhaTransacaoException {
        Transacao transacao = new Transacao(valor, tipoTransacao);
        conta.getTransacoes().add(transacao);
    }

    // void atualizar(Conta conta);
    // List<Conta> listar();
    // List<Conta> listarContasDoBanco(Integer numeroBanco, String nomeBanco);
}
