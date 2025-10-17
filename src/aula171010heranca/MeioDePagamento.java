package aula171010heranca;

public abstract class MeioDePagamento {
    protected double valor;

    public MeioDePagamento(double valor){
        this.valor = valor;
    }

    public abstract boolean processarPagamento();

    public void exibirDetalhes(){
        System.out.printf("Valor da transação: R$ %.2f", valor);
    }

}
