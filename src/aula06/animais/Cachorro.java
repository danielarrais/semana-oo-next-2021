package aula06.animais;

public class Cachorro extends Mamifero {
    public Cachorro(Double peso, Integer idade, Integer quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros, corPelo);
    }


    @Override
    public void emitirSom() {
        System.out.println("au au au au");
    }

    @Override
    public void alimentar() {
        System.out.println("Comeu ração");
    }

    public void reagir(Boolean isDono) {
        if(isDono) {
            System.out.println("Ficou feliz e balançou o rabo");
        } else {
            System.out.println("Latiu e botou pra correr");
        }
    }

    public void reagir(String frase) {
        if(frase.equals("Que cachorro bonitinho") || frase.equals("Eu tava com muita saudade")) {
            System.out.println("Ficou feliz e balançou o rabo");
        }

        System.out.println("Latiu e botou pra correr");
    }
}
