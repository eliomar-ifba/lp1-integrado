package aaprova;

import java.time.LocalDateTime;

public class Transacao {
    public Transacao(int id, String tipo, double valor, LocalDateTime dataHora, String status) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = dataHora;
        this.status = status;
    }


    int id;
    String tipo;
    double valor;
    LocalDateTime dataHora;
    String status;


    public Transacao() {
    }

}
