package aula05.contaBancaria.camadaDados;

import java.util.ArrayList;
import java.util.List;

import aula05.contaBancaria.camadaModel.Banco;
import aula05.contaBancaria.camadaModel.Conta;
import aula05.contaBancaria.exceptions.RegistroNaoEncontradoException;

public interface ContaDAO {
    void salvar(Conta conta);
    void excluir(Conta conta);
    Conta buscar(String numero) throws RegistroNaoEncontradoException;
    void atualizar(Conta conta);
    boolean existe(String numero);
    List<Conta> listar();
    List<Conta> listarContasDoBanco(Integer numeroBanco, String nomeBanco);
}
