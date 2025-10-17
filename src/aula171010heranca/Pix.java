package aula171010heranca;

import java.util.UUID;

public class Pix extends MeioDePagamento{
    private String chaveAleatoria;


    public Pix(double valor) {
       super(valor);
       this.chaveAleatoria = UUID.randomUUID().toString();
    }

    @Override
    public boolean processarPagamento() {
        System.out.println("\nProcessando Pix");
        super.exibirDetalhes();
        System.out.println("Chave Aleatória: " + this.chaveAleatoria);
        return true;
    }
    
}
