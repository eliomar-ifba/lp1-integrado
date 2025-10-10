package aula031010heranca;

import java.util.UUID;

public class Livro extends Obra{
    private int tiragem;
    
    public Livro() {   
        super();  
    }
    public Livro(UUID id, String titulo, String isbn, double valor, int tiragem) {
        super(id, titulo, isbn, valor);
        this.tiragem = tiragem;
    }
    
    public int getTiragem() {
        return tiragem;
    }
    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    
}
