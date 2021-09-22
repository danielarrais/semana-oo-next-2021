package aula05.contaBancaria.dao;

import java.util.ArrayList;

import aula05.contaBancaria.Banco;
import aula05.contaBancaria.Conta;

public interface ContaDAO {
    void salvar(Conta conta);
    void excluir(Conta conta);
    Conta buscar(String numero);
    void atualizar(Conta conta);
    ArrayList<Conta> listar();
    ArrayList<Conta> listarContasDoBanco(Integer numeroBanco, String nomeBanco);
}
