package aula5;

public class App {
    public static void main(String[] args) {
        //invocando os métodos construtores
        //para criação dos objetos
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.id = 10;
        aluno1.nome = "Jonh Doe";
        aluno1.matricula = "20250001";  
        aluno1.idade = 40;
        
        aluno2.id = 11;
        aluno2.nome = "Maria Santos";
        aluno2.matricula = "20250002";  
        aluno2.idade = 25;
        
        aluno3.id = 12;
        aluno3.nome = "José Campos";
        aluno3.matricula = "20250003";  
        aluno3.idade = 20;

        Aluno aluno4 = aluno3;
        Aluno aluno5 = aluno3;

        //imprimir dados
        aluno1.imprimirDados(1);
        aluno2.imprimirDados(2);
        aluno3.imprimirDados(3);
        

        
        

    }
}
