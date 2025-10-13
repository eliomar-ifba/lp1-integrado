package aula031010heranca;

import java.util.UUID;

public abstract class Obra {
    private UUID id;
    private String titulo;
    private String isbn;
    private double valor;
    
    public Obra(UUID id, String titulo, String isbn, double valor) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.valor = valor;
    }
    public Obra() {
        
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract boolean aplicarDesconto(double porcentagem);


}
