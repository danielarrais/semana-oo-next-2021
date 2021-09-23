package aula05.contaBancaria;

import java.util.ArrayList;

import aula05.contaBancaria.exceptions.SaldoInsuficienteParaSaqueException;

public class Banco {
    private String nome;
    private Integer codigo;
    private ArrayList<Conta> contas;

    public Banco(Integer codigo, String nome, ArrayList<aula05.contaBancaria.Conta> listaContas) {
        this.nome = nome;
        this.codigo = codigo;
        this.contas = listaContas;
    }
    
    public void tranferir(
        String contaOrigem, 
        String contaDestino,
        Double valor
    ) throws SaldoInsuficienteParaSaqueException {
        Conta destino = null;
        Conta origem = null;

        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if(contaAtual.numero.equals(contaOrigem)) {
                origem = contaAtual;
            }

            if(contaAtual.numero.equals(contaDestino)) {
                destino = contaAtual;
            }
        }

        if(destino == null || origem == null) {
            System.out.println("Alguma das contas não existem");
            return;
        }

        origem.debitarSaldo(valor);
        destino.creditarSaldo(valor);
    }

    public void tranferir(
        String contaOrigem, 
        String codigoBanco,
        String contaDestino,
        String agenciaDestino,
        String cpf, 
        String nomeTitular,
        Double valor
    ) throws SaldoInsuficienteParaSaqueException {
        Conta origem = null;

        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if(contaAtual.numero.equals(contaOrigem)) {
                origem = contaAtual;
            }
        }

        if(origem == null) {
            System.out.println("A conta não existe");
            return;
        }

        origem.debitarSaldo(valor);
        System.out.println("O valor foi tranferido para outra conta em outro banco");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Conta> getContas() {
        return this.contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

}
