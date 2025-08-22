package aula1508encapulamento;

public class Pessoa {
    private String nome;
    private int idade;
    
    // códigos boiler plate = repetitivos padrões 
    public String getNome() {
       return nome;
    }
    public void setNome(String nome) {
       this.nome = nome;
    }
    public int getIdade() {
       return idade;
    }
    public void setIdade(int idade) {
      if(idade < 0){
         System.out.println("Valor inválido!");
        
      }else{
         this.idade = idade;
      }
    }

   
    

}
