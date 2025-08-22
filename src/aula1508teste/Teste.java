package aula1508teste;

import aula1508encapulamento.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(15);
        p.setNome("Othon Campos");

        System.out.println("Nome: " +p.getNome() );
        System.out.println("Idade: " +p.getIdade() );

    }
}
