package aula04.rh;

public class Rh {
    public static void main(String[] args) {

        // String nome, String cpf, String nis, Double salario
        Empregado empregadoComum = new Empregado(
            "Daniel Arrais",
            "45454574390",
            "54645645",
            5000.0
        );
        System.out.println("Informações: \n" + empregadoComum);

        Gerente gerenteSetorEletrodomestico = new Gerente(
            "Daniel Arrais",
            "45454574390",
            "54645645",
            5000.0, 
            "Setor Eletrodomésticos"
        );
        System.out.println("Informações gerente: \n" + gerenteSetorEletrodomestico);

        Vendedor vendedorEletroDomesticos = new Vendedor(
            "Daniel Arrais",
            "45454574390",
            "54645645",
            5000.0, 
            4.0
        );
        System.out.println("Informações vendedor: \n" + vendedorEletroDomesticos);
    }
}
