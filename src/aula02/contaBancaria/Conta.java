package aula02.contaBancaria;

import java.util.ArrayList;
import java.util.Date;

// modificador de acesso - class - NomeDaClasse
public class Conta {

    // public static final String RENDIMENTO = "100";

    // Atributos (caracteristicas)
    // modificador de acesso - tipo do atributo - nomeDoPadrao
    // protected String numero;
    public String numero;
    public String agencia;
    private Double saldo;
    private ArrayList<Transacao> transacoes;

    // Construtores
    // modificador de acesso - NomeDaClasse - parametros
    public Conta(String numero, String agencia, Double saldo) { // Construtor 1
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.transacoes = new ArrayList<Transacao>();
    }

    // modificador de acesso - NomeDaClasse - parametros
    public Conta(String numero, String agencia) { // Construtor 1
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<Transacao>();
    }

    // Métodos (Ações)
    // modificador de acesso - tipo de retorno - NomeDaClasse - parametros
    public void debitarSaldo(Double saque) {
        if (podeSacar(saque)) {
            saldo -= saque;
            Transacao transacao = new Transacao(saque, Transacao.DEBITO);
            transacoes.add(transacao);
        } else {
            System.out.println("Não há saldo suficiente!!!");
        }
    }

    public void creditarSaldo(Double valor) {
        if(saldo > 0) {
            saldo += valor;
            Transacao transacao = new Transacao(valor, Transacao.CREDITO);
            transacoes.add(transacao);
        } else {
            System.out.println("Valor inválido!!!");
        }
    }

    private boolean podeSacar(Double saque) {
        return saldo != null && saldo > 0 && saldo >= saque;
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
    
}
