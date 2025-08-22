package aula1508encapulamento;

public class Teste2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(-1);
        p.setNome("Eliomar Campos");

        System.out.println("Nome: " +p.getNome() );
        System.out.println("Idade: " +p.getIdade() );
    }
}
