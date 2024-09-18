import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos; 

    public Universidade(String nome){
        this.nome = nome;
        this.departamentos = new ArrayList<Departamento>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    public void removerDepartamento(Departamento departamento){
        departamentos.remove(departamento);
    }

    public void listarDepartamentos(){
        for (Departamento departamento : departamentos){
            System.out.println("Departamento" + departamento.getNome() + ", codigo:" + departamento.getCodigo());
            departamento.listarProfessores();
        }
    }
}
