package aula5;

public class App2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Goku");
        Aluno aluno2 = new Aluno(10, "Eliomar", "23424", 37);
        aluno2.nome = "Madimbu";
    
        Aluno aluno3 = new Aluno();

        aluno1.imprimirDados();
        aluno2.imprimirDados();
        aluno3.imprimirDados();
    }
}
