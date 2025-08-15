package aula10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto pro1 = new Produto();
        Produto pro2 = new Produto();
        Produto pro3 = new Produto();
        Pedido pedido = new Pedido();

        pro1.id = 10;
        pro1.nome = "Feijão";
        pro1.preco = 7.99;
        
        pro2.id = 11;
        pro2.nome = "Arroz";
        pro2.preco = 5.49;
        
        pro3.id = 12;
        pro3.nome = "Ovo Jumbo";
        pro3.preco = 22.99;

        //trabalhando com lista
        List<Produto> cestinha = new ArrayList<>();
        cestinha.add(pro3);
        cestinha.add(pro1);
        cestinha.add(pro2);

        //cadastrando pedido
        pedido.id = 1;
        pedido.status = "Em andamento";
        pedido.precoTotal = 37.99;
        pedido.data = LocalDateTime.now();
        pedido.produtos = cestinha;

        //imprimindo
        System.out.println("*** NOTA FISCAL ***");
        System.out.println("ID: " + pedido.id);
        System.out.println("Data: " + pedido.data);
        System.out.println("Status: " + pedido.status );

        //iterar (percorrer) a lista com for each
        for(Produto p : pedido.produtos){
            System.out.println("ID: " + p.id);
            System.out.println("Produto: " + p.nome );
            System.out.println("Valor: " + p.preco );
        }


        
        






    }
}
