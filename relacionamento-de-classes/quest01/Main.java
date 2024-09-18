public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade Exemplo");

        Departamento departamento1 = new Departamento("Departamento de Matemática", "MAT");
        Departamento departamento2 = new Departamento("Departamento de Física", "FIS");

        Professor professor1 = new Professor("Dr. João", "123");
        Professor professor2 = new Professor("Dr. Maria", "456");

        professor1.atribuirDepartamento(departamento1);
        professor2.atribuirDepartamento(departamento1);

        universidade.adicionarDepartamento(departamento1);
        universidade.adicionarDepartamento(departamento2);

        System.out.println("Departamentos na " + universidade.getNome() + ":");
        universidade.listarDepartamentos();

        professor2.atribuirDepartamento(departamento2);

        System.out.println("Departamentos na " + universidade.getNome() + " após transferência:");
        universidade.listarDepartamentos();
    }
}
