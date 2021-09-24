package aula05.contaBancaria;

import java.util.ArrayList;

import aula05.contaBancaria.exceptions.FalhaTransacaoException;
import aula05.contaBancaria.exceptions.SaldoInsuficienteParaSaqueException;

// modificador de acesso - class - NomeDaClasse
public abstract class Conta {

    // public static final String RENDIMENTO = "100";

    // Atributos (caracteristicas)
    // modificador de acesso - tipo do atributo - nomeDoPadrao
    // protected String numero;
    public String numero;
    public String agencia;
    private Double saldo;
    private ArrayList<Transacao> transacoes;

    // modificador de acesso - NomeDaClasse - parametros
    public Conta(String numero, String agencia) { // Construtor 1
        this(numero, agencia, 0.0);
    }

    // Construtores
    // modificador de acesso - NomeDaClasse - parametros
    public Conta(String numero, String agencia, Double saldo) { // Construtor 1
        this.numero = numero;
        this.agencia = agencia;
        this.transacoes = new ArrayList<Transacao>();
        setSaldo(saldo);
    }

    // Métodos (Ações)
    // modificador de acesso - tipo de retorno - NomeDaClasse - parametros
    public void debitarSaldo(Double saque) throws SaldoInsuficienteParaSaqueException, FalhaTransacaoException {
        if (podeSacar(saque)) {
            saldo -= saque;
            registrarTransacao(saque, Transacao.DEBITO);
        } else {
            throw new SaldoInsuficienteParaSaqueException(saldo);
        }
    }

    public void creditarSaldo(Double valor) throws FalhaTransacaoException {
        if(saldo != null) {
            saldo += valor;
            registrarTransacao(valor, Transacao.CREDITO);
        } else {
            System.out.println("Valor inválido!!!");
        }
    }

    abstract protected boolean podeSacar(Double saque);

    private void registrarTransacao(Double valor, String tipoTransacao) throws FalhaTransacaoException {
        Transacao transacao = new Transacao(valor, tipoTransacao);
        transacoes.add(transacao);

        throw new FalhaTransacaoException(tipoTransacao);
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    public ArrayList<Transacao> getTransacoes() {
        return this.transacoes;
    }

    protected void setSaldo(Double saldo) {
        if(saldo != null) {
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", agencia='" + agencia + "'" +
            ", saldo='" + getSaldo() + "'" +
            ", transacoes='" + getTransacoes() + "'" +
            "}";
    }

}
