import java.util.ArrayList;

public class Departamento{
    private String nome;
    private String codigo;
    private ArrayList<Professor>professores;

    public Departamento(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
        this.professores = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    public void removerProfessores(Professor professor){
        professores.remove(professor);
    }
    public void listarProfessores() {
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome() + ", ID: " + professor.getId());
        }
    }
}