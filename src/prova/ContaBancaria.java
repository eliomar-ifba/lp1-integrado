package prova;

import java.util.List;

public class ContaBancaria {
    public ContaBancaria(int id, String titular, String numero, String agencia, double saldo, double limite,
            String tipo, List<Transacao> transacoes) {
        this.id = id;
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
        this.transacoes = transacoes;
    }
   
    int id;
    String titular;
    String numero;
    String agencia;
    double saldo;
    double limite;
    String tipo;
    List<Transacao> transacoes;




    public ContaBancaria() {
    }

}
