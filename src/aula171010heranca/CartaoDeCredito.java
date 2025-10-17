package aula171010heranca;

public class CartaoDeCredito extends MeioDePagamento {
    private String numeroCartao;
    private int parcelas;

    public CartaoDeCredito(double valor, String numeroCartao,
            int parcelas) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public boolean processarPagamento() {
        System.out.println("\n Processando Pag Crédito");
        super.exibirDetalhes();
        System.out.println("Final: " + this.numeroCartao.substring(this.numeroCartao.length() - 4));
        System.out.println("Parcelas: " + this.parcelas + "x");

        if (this.valor > 0 && this.parcelas > 0) {
            System.out.println("Transação autorizada!");
            return true;
        } else {
            System.out.println("Transação negada!");
            return false;
        }

    }

}
