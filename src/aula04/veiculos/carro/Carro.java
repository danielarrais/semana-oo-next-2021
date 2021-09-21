package aula04.veiculos.carro;

import aula04.veiculos.Veiculo;
import aula04.veiculos.carro.enums.TipoCambio;

public class Carro extends Veiculo {
    private Integer quantidadePortas;
    private Integer quantidadeLugares;
    private TipoCambio tipoCambio;
    private Integer potencia;

    public Carro(
        String marca, 
        String cor, 
        String placa, 
        Integer ano, 
        Integer velocidadeMaxima, 
        Integer quantidadePortas, 
        Integer quantidadeLugares, 
        TipoCambio tipoCambio, 
        Integer potencia
    ) {
        super(marca, cor, placa, ano, velocidadeMaxima);
        this.quantidadePortas = quantidadePortas;
        this.quantidadeLugares = quantidadeLugares;
        this.tipoCambio = tipoCambio;
        this.potencia = potencia;
    }

    public void abrirVidro(Integer vidro) {
        System.out.println("Abriu o vidro " + vidro);
    }

    public void fecharVidro(Integer vidro) {
        System.out.println("Fechou o vidro " + vidro);
    }

    public Integer getQuantidadePortas() {
        return this.quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Integer getQuantidadeLugares() {
        return this.quantidadeLugares;
    }

    public void setQuantidadeLugares(Integer quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public TipoCambio getTipoCambio() {
        return this.tipoCambio;
    }

    public void setTipoCambio(TipoCambio tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Integer getPotencia() {
        return this.potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    

}
