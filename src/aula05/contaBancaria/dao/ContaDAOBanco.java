package aula05.contaBancaria.dao;

import java.util.ArrayList;

import aula05.contaBancaria.Conta;

public class ContaDAOBanco implements ContaDAO{

    @Override
    public void salvar(Conta conta) {
        System.out.println("Salvou a conta " + conta + " no Oracle");
    }

    @Override
    public void excluir(Conta conta) {
        System.out.println("Excluiu a conta " + conta + " do Oracle");
    }

    @Override
    public Conta buscar(String numero) {
        System.out.println("Salvou a conta de numero " + numero + " no Oracle");
        return null;
    }

    @Override
    public void atualizar(Conta conta) {
        System.out.println("Atualizou a conta de numero " + conta + " no Oracle");
    }

    @Override
    public ArrayList<Conta> listar() {
        System.out.println("Listou as contas armazenadas no Oracle");
        return null;
    }

    @Override
    public ArrayList<Conta> listarContasDoBanco(Integer numeroBanco, String nomeBanco) {
        System.out.println("Recuperou as contas do banco " + numeroBanco + " do Oracle");
        return null;
    }
    
}
