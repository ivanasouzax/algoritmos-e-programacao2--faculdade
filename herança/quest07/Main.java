/*
   Crie uma classe Livro com atributos como titulo e autor. 
   Crie subclasses LivroFisico e Ebook que adicionam atributos específicos como numeroDePaginas e tamanhoArquivo.
 */

abstract class Livro{
    public String titulo; 
    public String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo; 
        this.autor = autor; 
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo; 
    }

    public void setAutor(String autor){
        this.autor = autor; 
    }
}

class LivroFisico extends Livro{
    public int numeroDePaginas;
    public double tamanhoArquivo;

    public LivroFisico(String titulo, String autor, int numeroDePaginas, double tamanhoArquivo){
        super(titulo, autor); 
        this.numeroDePaginas = numeroDePaginas; 
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    public double getTamanhoArquivo(){
        return tamanhoArquivo;
    }

    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setTamanhoArquivo(double tamanhoArquivo){
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Numero de paginas: " + numeroDePaginas + "\n" + "Tamanho do arquivo: " + tamanhoArquivo; 
    }
}

class Ebook extends Livro{
    public int numeroDePaginas;
    public double tamanhoArquivo;

    public Ebook(String titulo, String autor, int numeroDePaginas, double tamanhoArquivo){
        super(titulo, autor); 
        this.numeroDePaginas = numeroDePaginas; 
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    public double getTamanhoArquivo(){
        return tamanhoArquivo;
    }

    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setTamanhoArquivo(double tamanhoArquivo){
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Numero de paginas: " + numeroDePaginas + "\n" + "Tamanho do arquivo: " + tamanhoArquivo; 
    }
}

public class Main{
    public static void main (String [] args){
        LivroFisico livro1 = new LivroFisico("A busca do diario perdido", "Collen Hover", 50, 600);
        Ebook ebook1 = new Ebook("A luz", "Jose", 50 , 480);
        System.out.println(livro1);
        System.out.println(ebook1);
    }
}