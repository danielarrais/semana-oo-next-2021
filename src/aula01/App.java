package aula01;

import java.util.ArrayList;

import aula01.contaBancaria.Conta;
import aula01.exercicio03.Agenda;
import aula01.exercicio03.Contato;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(Conta.rendimento);
    
        Conta contaNuDoLucasC1 = new Conta("456456-7", "0001");
        Conta contaNuDoLucasC2 = new Conta("456456-7", "0001", 10000000.0);
        Conta contaBBDoLucas = new Conta("456456-7", "0001", 100.0);

        
        System.out.println(contaNuDoLucasC1.getSaldo());
        System.out.println(contaNuDoLucasC1.numero);

        contaNuDoLucasC2.debitarSaldo(1000.0);
        System.out.println(contaNuDoLucasC2.getSaldo());


        // // Saque
        // System.out.println("Saldo antes do saque: " + contaDoLucas.getSaldo());
        // contaDoLucas.debitarSaldo(1500.0);
        // System.out.println("Saldo depois do saque: " + contaDoLucas.getSaldo());

        // System.out.println("------------------");

        // System.out.println("Saldo antes do saque: " + contaBBDoLucas.getSaldo());
        // contaBBDoLucas.debitarSaldo(1500.0);
        // System.out.println("Saldo depois do saque: " + contaBBDoLucas.getSaldo());

        // Contato contatoDaniel = new Contato("Daniel Arrais", "546456456", "567567567");
        // Contato contatoJoao = new Contato("João Arrais", "546456456", "567567567");

        // ArrayList<Contato> contatos = new ArrayList<Contato>();
        // contatos.add(contatoJoao);
        // contatos.add(contatoDaniel);

        // for (int i = 0; i < contatos.size(); i++) {
        // System.out.println(contatos.get(i).getNome());
        // }

        // Agenda agendaGoogle = new Agenda("dasdasd@gmail.com", contatos);

        // for (int i = 0; i < agendaGoogle.getContatos().size(); i++) {
        //     System.out.println(contatos.get(i).getNome());
        // }

        // System.out.println("Total de contatos: " + agendaGoogle.totalContatos());

        // Contato contatoMaria = new Contato("Maria Arrais", "546456456", "567567567");
        // agendaGoogle.addContato(contatoMaria);
        // System.out.println("Total de contatos: " + agendaGoogle.totalContatos());

        // Contato contatoParaRemover = new Contato("Maria Arrais", "546456456", "567567567");
        // agendaGoogle.removeContato(contatoParaRemover);
        // System.out.println("Total de contatos: " + agendaGoogle.totalContatos());

    }
}
