package aula10;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    int id;
    LocalDateTime data;
    String status;
    double precoTotal;
    List<Produto> produtos; 

}
