package aula160509heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cadastro {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.setId(UUID.randomUUID());
        jogador1.setCpf("222.333.211-99");
        jogador1.setNome("Eliomar Campos");
        jogador1.setNumero("8");
        jogador1.setPosicao("Volante");
        
        Jogador jogador2 = new Jogador();
        jogador2.setId(UUID.randomUUID());
        jogador2.setCpf("111.222.888-88");
        jogador2.setNome("Rafaela Wanderley");
        jogador2.setNumero("9");
        jogador2.setPosicao("Atacante");

        ArrayList<Jogador> listaDeJogadores = new ArrayList<>();
        listaDeJogadores.add(jogador1);

        ArrayList<Jogador> listaDeJogadores2 = new ArrayList<>();
        listaDeJogadores2.add(jogador2);

        Time timeMandante = new Time();
        timeMandante.setId(UUID.randomUUID());
        timeMandante.setNome("Flamengo");
        timeMandante.setJogadores(listaDeJogadores);

        Time timeVisitante = new Time();
        timeVisitante.setId(UUID.randomUUID());
        timeVisitante.setNome("Vasco");
        timeVisitante.setJogadores(listaDeJogadores2);

        Arbitro arbitro = new Arbitro();
        arbitro.setId(UUID.randomUUID());
        arbitro.setNome("Daronco");
        arbitro.setFifa(false);
        arbitro.setCodigo("2424234234");

      


        System.out.println("ID Jogador: " + jogador1.getId());

    }
}
