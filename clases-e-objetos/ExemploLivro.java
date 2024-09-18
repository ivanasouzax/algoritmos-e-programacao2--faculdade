// Crie uma classe chamada Livro com os atributos título, autor e número de páginas. 

class Livro {

    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
    public class ExemploLivro {

        public static void main (String [] args){

            Livro l1 = new Livro ( "A vida de uma pobre estudante", "Ivana Souza" , 450);
            System.out.println ("Titulo: " + l1.getTitulo());
            System.out.println ("Autor: " + l1.getAutor()) ;
            System.out.println ("Numero de páginas: " + l1.getPaginas());

        }
    }
