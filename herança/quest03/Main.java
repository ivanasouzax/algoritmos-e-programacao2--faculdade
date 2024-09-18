/*
  Crie uma classe Pessoa com atributos como nome e data de nascimento. 
 Crie subclasses como Aluno e Professor que adicionam atributos específicos, 
 como matrícula para Aluno e titulação para Professor.
 */

 abstract class Pessoa{
    private String nome; 
    private String dataNascimento;

    public Pessoa(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNascimento());
    }
 }

 class Aluno extends Pessoa{
    private String matricula;

    public Aluno (String nome, String dataNascimento, String matricula){
        super(nome, dataNascimento);
        this.matricula = matricula; 
    }

    public String getMatricula(){
        return matricula; 
    }

    public void setMatricula(String matricula){
        this.matricula = matricula; 
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Matricula: " + getMatricula());
    }
 }

 class Professor extends Pessoa{
    private String titulacao;

    public Professor (String nome, String dataNascimento, String titulacao){
        super(nome, dataNascimento);
        this.titulacao = titulacao; 
    }

    public String getTitulacao(){
        return titulacao; 
    }

    public void setMatricula(String titulacao){
        this.titulacao = titulacao; 
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Titulacao: " + getTitulacao());
    }
 }

public class Main{
    public static void main (String []args){

        Aluno aluno1 = new Aluno("João", "24/06/2004", "202410560"); 
        Professor professor1 = new Professor("Ivana", "20/10/2003", "Mestrado");

        aluno1.mostrarInfo();
        System.out.println(); 
        professor1.mostrarInfo();
    }
}