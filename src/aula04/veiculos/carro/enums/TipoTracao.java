package aula04.veiculos.carro.enums;

public enum TipoTracao {
    SIMPLES(1, "Simples"), 
    QUATRO_POR_QUATRO(2, "Quatro por quatro");

    TipoTracao(Integer valor, String descricao) {
        this.descricao = descricao;
        this.valor = valor;
    }

    private Integer valor;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
}
