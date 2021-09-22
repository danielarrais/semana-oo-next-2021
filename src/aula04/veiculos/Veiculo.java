package aula04.veiculos;

public abstract class Veiculo {
    private String marca;
    private String cor;
    private String placa;
    private Integer ano;
    private Integer velocidadeAtual;
    private Integer velocidadeMaxima;
    private Boolean ligado;

    public Veiculo(
        String marca, 
        String cor, 
        String placa, 
        Integer ano,
        Integer velocidadeMaxima
    ) {
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.ligado = false;
    }

    public void acelerar(Integer velocidade) {
        if(velocidade <= velocidadeMaxima) {
            this.velocidadeAtual = velocidade;
        } else {
            this.velocidadeAtual = velocidadeMaxima;
        }
        
        System.out.println("Velocidade atual agora é de " + getVelocidadeAtual() + " KM/h");
    }

    public void frear() {
        this.velocidadeAtual = 0;
        System.out.println("Freiou e a velocidade atual é de " + getVelocidadeAtual() + " KM/h");
    }

    public void comando(String comando) {
        if(comando == "LIGAR") {
            this.ligado = true;
        } else if(comando == "DESLIGAR") {
            this.ligado = false;
        }
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Ligou");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Desligou");
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Boolean isLigado() {
        return this.ligado;
    }

    public Boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

}
