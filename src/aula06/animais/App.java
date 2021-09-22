package aula06.animais;

public class App {
    public static void main(String[] args) {
        
        // Double peso, Integer idade, Integer quantidadeMembros, String corPelo
        Mamifero mamifero = new Mamifero(8.0, 2, 50, "Preto e Branco");
        Cachorro apolo = new Cachorro(8.0, 2, 50, "Preto e Branco");
        Tartaruga jonhSnow = new Tartaruga(50.0, 80, 50, "Marron");

        apolo.locomover();
        apolo.emitirSom();
        apolo.alimentar();
        apolo.reagir(false);
        apolo.reagir("Que cachorro bonitinho");
        apolo.reagir("Que cachorro feio");

        System.out.println("===============");

        mamifero.locomover();
        mamifero.emitirSom();
        mamifero.alimentar();

        System.out.println("===============");

        jonhSnow.locomover();
        jonhSnow.emitirSom();
        jonhSnow.alimentar();
    }
}
