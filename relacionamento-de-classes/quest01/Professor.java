public class Professor{
    private String nome; 
    private String idProfessor; 
    private Departamento departamento; 

    public Professor(String nome, String idProfessor){
        this.nome = nome;
        this.idProfessor = idProfessor;
    }

    public String getNome(){
        return nome;
    }

    public String getId(){
        return idProfessor;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public void atribuirDepartamento(Departamento departamento){
        if (this.departamento != null){
            this.departamento.removerProfessores(this);
        }
        this.departamento = departamento;
        departamento.adicionarProfessor(this);
    }
}
