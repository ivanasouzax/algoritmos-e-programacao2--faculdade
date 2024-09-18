/*
  Crie uma classe Funcionario com atributos como nome, salario e métodos como calcularSalario().  
  Crie subclasses `Gerente`, `Desenvolvedor` e `Analista` que adicionam atributos específicos
   e redefinem o método `calcularSalario()` para incluir bônus ou comissões.

 */

abstract class Funcionario{
    private String nome; 
    private double salario; 

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public void setSalario(double salario){
        this.salario = salario; 
    }

    public double calcularSalario(){
        return getSalario(); 
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: " + calcularSalario();
    }
}

class Gerente extends Funcionario { 
    private double bonus; 

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus; 
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus; 
    }

    @Override
    public double calcularSalario(){
        return getSalario() + bonus; 
    }

}
class Desenvolvedor extends Funcionario { 
    private double comissao; 

    public Desenvolvedor (String nome, double salario, double comissao){
        super(nome, salario);
        this.comissao = comissao; 
    }

    public double getComissao(){
        return comissao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao; 
    }

    @Override
    public double calcularSalario(){
        return getSalario() + comissao; 
    }

}
class Analista extends Funcionario { 
    private double comissao; 

    public Analista (String nome, double salario, double comissao){
        super(nome, salario);
        this.comissao = comissao; 
    }

    public double getComissao(){
        return comissao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao; 
    }

    @Override
    public double calcularSalario(){
        return getSalario() + comissao; 
    }

}

public class Main{
    public static void main (String [] args){
        Gerente gerente = new Gerente("João", 1500, 350);
        Desenvolvedor dev = new Desenvolvedor("Jhonson", 5000, 1500);
        Analista analista = new Analista("Ivana", 3500, 250);
        System.out.println((gerente));
        System.out.println ((analista)); 
        System.out.println((dev));

    }

}
