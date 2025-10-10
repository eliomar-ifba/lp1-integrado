package aula160509heranca;

import java.util.UUID;

public class Estadio {
    private UUID id;
    private String nome;

    public Estadio(UUID id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Estadio() {
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
