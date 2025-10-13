package aula031010heranca;

import java.util.UUID;

public class Ebook extends Obra{
    private String urlMarcaDagua;
    
    public Ebook(UUID id, String titulo, String isbn, double valor, String urlMarcaDagua) {
        super(id, titulo, isbn, valor);
        this.urlMarcaDagua = urlMarcaDagua;
    }

    public Ebook() {
    }

    public String getUrlMarcaDagua() {
        return urlMarcaDagua;
    }

    public void setUrlMarcaDagua(String urlMarcaDagua) {
        this.urlMarcaDagua = urlMarcaDagua;
    }

    @Override
    public boolean aplicarDesconto(double porcentagem) 
    {
        if(porcentagem > 0.7){
            return false; //sai da função e não continua
        }
        double desconto = super.getValor() * porcentagem;
        super.setValor(super.getValor() - desconto);
        return true;
    }
    


}
