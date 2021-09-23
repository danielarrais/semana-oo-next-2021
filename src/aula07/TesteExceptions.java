package aula07;

public class TesteExceptions {
    public static void main(String[] args) {
        System.out.println("inicio do main.");
        metodol();
        System.out.println("fim do main.");
    }

    static void metodol() {
        System.out.println("inicio do metodol");
        metodo2();
        System.out.println("fim do metodol");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você tentou acessar uma posição do array que não existe!");
        }
        System.out.println("fim do metodo2");
    }
}
