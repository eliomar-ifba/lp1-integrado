package aula4;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        //convenção 
        String nomeAluno;

       // pacotes
       // classes - maiúsculo
       // variáveis
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor para exibir a tabuada: ");
        int valor = teclado.nextInt();

        
        //inputs da repetição:
        //valor inicial
        //condição de parada
        //incremento
        
        int i = 1;
        while(i <= 10){
            System.out.println(i + " X " + valor + " = " + (i*valor));
            i = i + 1;
        }
    }
}
