package aula031010heranca;

import java.util.UUID;

public class Teste {
    public static void main(String[] args) {
        //VANTAGENS / POSSIBILIDADES DA HERANÇA!!!

        //abstração??
            // não é possível instancia uma classe abstrata
                //Obra obra = new Obra();

        //polimorfismo
            // possibilita generalização, ou seja, 
            // compatibilidade entre filhos e a mãe
        // Obra obraEbook = new Ebook();
        // Obra obraLivro = new Livro();

        Ebook ebook = new Ebook();
        ebook.setId(UUID.randomUUID());
        ebook.setIsbn("445645645");
        ebook.setTitulo("Triunfo dos nerds");
        ebook.setUrlMarcaDagua("https:\\localhost:8080\figura.png");
        ebook.setValor(45);

        Livro livro = new Livro();
        livro.setId(UUID.randomUUID());
        livro.setIsbn("123123123");
        livro.setTitulo("Senhor dos anéis");
        livro.setTiragem(1000);
        livro.setValor(50);

        venderObra(ebook);
        venderObra(livro);

    }

    /**
     * sdfsdfsdfsdfsfdsd
     */
    public static void venderObra(Obra obra){
        System.out.println("ID: " + obra.getId());
        System.out.println("Título: " + obra.getTitulo());

        if(obra instanceof Livro){
            System.out.println("Vendendo Livro....");
            Livro livroTemp = (Livro) obra;
            System.out.println("Tiragem: " + livroTemp.getTiragem());
            
        }else if(obra instanceof Ebook){
            System.out.println("Vendendo Ebook...");
            Ebook ebookTemp = (Ebook) obra;
            System.out.println("URL: " + ebookTemp.getUrlMarcaDagua());
        }
    }


}
