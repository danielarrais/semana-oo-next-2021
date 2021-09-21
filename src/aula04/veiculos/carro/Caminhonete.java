package aula04.veiculos.carro;

import aula04.veiculos.carro.enums.TipoCambio;
import aula04.veiculos.carro.enums.TipoTracao;

public class Caminhonete extends Carro {
    private Double cargaMaxima;
    private String tipoCabine;
    private TipoTracao tipoTracao;

    public Caminhonete(
        String marca, 
        String cor, 
        String placa, 
        Integer ano, 
        Integer velocidadeMaxima, 
        Integer quantidadePortas,
        Integer quantidadeLugares, 
        TipoCambio tipoCambio, 
        Integer potencia,
        Double cargaMaxima, 
        String tipoCabine, 
        TipoTracao tipoTracao
    ) {
        super(marca, cor, placa, ano, velocidadeMaxima, quantidadePortas, quantidadeLugares, tipoCambio, potencia);
        this.cargaMaxima = cargaMaxima;
        this.tipoCabine = tipoCabine;
        this.tipoTracao = tipoTracao;
    }

    public Double getCargaMaxima() {
        return this.cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public String getTipoCabine() {
        return this.tipoCabine;
    }

    public void setTipoCabine(String tipoCabine) {
        this.tipoCabine = tipoCabine;
    }

    public TipoTracao getTipoTracao() {
        return this.tipoTracao;
    }

    public void setTipoTracao(TipoTracao tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

}
