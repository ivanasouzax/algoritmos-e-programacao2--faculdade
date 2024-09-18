//Crie uma classe chamada Aluno com os atributos nome, matrícula e 3 notas. 
//Implemente um construtor para inicializar esses atributos e um método para calcular a média das notas do aluno.

class Aluno {
    private String nome;
    private int matricula;
    private double nota1, nota2, nota3;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double CalcularNota() {
        return (nota1 + nota2 + nota3) / 3;
    }
}

public class ExemploAluno{

    public static void main (String [] args){

        Aluno a1 = new Aluno ("Ivana ", 20231570, 9.7, 9.8, 10);

        System.out.printf(" A media das notas é = " + a1.CalcularNota());
    }
}