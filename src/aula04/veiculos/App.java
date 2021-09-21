package aula04.veiculos;

import aula04.veiculos.carro.Caminhonete;
import aula04.veiculos.carro.Carro;
import aula04.veiculos.carro.enums.TipoCambio;
import aula04.veiculos.carro.enums.TipoTracao;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Carro ====================");

        Carro carroVermelho = new Carro(
            "Toyota", 
            "Vermelha", 
            "OXG-8080",
            2021,
            250,
            4, 4,
            TipoCambio.AUTOMATICO,
            300
        );

        // ações herdadas de veiculo
        carroVermelho.ligar();
        carroVermelho.acelerar(100);
        carroVermelho.frear();
        carroVermelho.desligar();

        // ações próprias de carro
        carroVermelho.abrirVidro(4);
        carroVermelho.fecharVidro(4);

        System.out.println("");
        System.out.println("Caminhonete ====================");

        Caminhonete caminhoneteAzul = new Caminhonete(
            "Ranger", 
            "Vermelha", 
            "OXG-8080",
            2021,
            250,
            4, 4,
            TipoCambio.AUTOMATICO,
            300,
            1000.0,
            "DUPLA",
            TipoTracao.QUATRO_POR_QUATRO
        );

        // ações herdadas de veiculo
        caminhoneteAzul.ligar();
        caminhoneteAzul.acelerar(100);
        caminhoneteAzul.frear();
        caminhoneteAzul.desligar();

        // ações próprias de carro
        caminhoneteAzul.abrirVidro(4);
        caminhoneteAzul.fecharVidro(4);

        System.out.println("");
        System.out.println("Moto ====================");

        // Integer cilindradas, String tipo, Boolean eletrica, Boolean flex
        Moto motoVerde = new Moto(
            "Honda", 
            "Verde", 
            "OXG-9898",
            2021, 
            120,
            160,
            "STREET",
            false,
            true
        );
        
        // ações herdadas de veiculo
        motoVerde.ligar();
        motoVerde.acelerar(120);
        motoVerde.frear();
        motoVerde.desligar();

        System.out.println("Tipo de tracao: " + caminhoneteAzul.getTipoTracao());
        System.out.println("Tipo de tracao: " + caminhoneteAzul.getTipoTracao().getDescricao());
    }
}
