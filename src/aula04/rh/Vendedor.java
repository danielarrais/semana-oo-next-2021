package aula04.rh;

public class Vendedor extends Empregado {
    private Double percentualComissao;

    public Vendedor(String nome, String cpf, String nis, Double salario, Double percentualComissao) {
        super(nome, cpf, nis, salario);
        this.percentualComissao = percentualComissao;
    }

    public Double calcularSalario() {
        return getSalario() * (1 + (getPercentualComissao() / 100));
    }

    public Double getPercentualComissao() {
        return this.percentualComissao;
    }

    public void setPercentualComissao(Double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public String toString() {
        Double salarioComComissao = calcularSalario();

        return super.toString() + 
        "Salario com comissao: " + salarioComComissao + "\n" +
        "Percentual de comissao: " + getPercentualComissao() + "\n" ;
    }
}
