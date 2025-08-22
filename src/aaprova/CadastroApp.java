package aaprova;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {

        Transacao tran1 = new Transacao(001, "Saque", 8000000.00, LocalDateTime.now(),
                "Errooo Dinheiro na conta Insuficiente");
        Transacao tran2 = new Transacao(002, "Saque", 9999999.00, LocalDateTime.now(),
                "Erro Dinheiro na conta Insuficiente");
        Transacao tran3 = new Transacao(003, "Depósito", 2.50, LocalDateTime.now(), "Depósito Concluído");

        List<Transacao> listaTransacoes = new ArrayList<>();
        listaTransacoes.add(tran1);
        listaTransacoes.add(tran2);
        listaTransacoes.add(tran3);

        ContaBancaria contaBancaria = new ContaBancaria(0001, "João Visionario Pidão", "452003043493", "0001", 3.00,
                5.00, "Corrente", listaTransacoes);

        System.out.println("\n---Conta Bancaria---");
        System.out.println("ID: " + contaBancaria.id);
        System.out.println("Nome do Títular: " + contaBancaria.titular);
        System.out.println("Número: " + contaBancaria.numero);
        System.out.println("Agência: " + contaBancaria.agencia);
        System.out.println("Saldo: " + contaBancaria.saldo);
        System.out.println("Limite: " + contaBancaria.limite);
        System.out.println("Tipo de Conta: " + contaBancaria.tipo);

        for (Transacao t : contaBancaria.transacoes) {
            System.out.println("\n---Transacao---");
            System.out.println("ID: " + t.id);
            System.out.println("Tipo: " + t.tipo);
            System.out.println("Valor: " + t.valor);
            System.out.println("Horário: " + t.dataHora);
            System.out.println("Status: " + t.status);

        }

    }

}
