package aula05.contaBancaria.dao;

import java.util.ArrayList;
import java.util.List;

import aula05.contaBancaria.Banco;
import aula05.contaBancaria.Conta;

public interface ContaDAO {
    void salvar(Conta conta);
    void excluir(Conta conta);
    Conta buscar(String numero);
    void atualizar(Conta conta);
    List<Conta> listar();
    List<Conta> listarContasDoBanco(Integer numeroBanco, String nomeBanco);
}
