package Funcionario;

public class Funcionario {

    private String nome;

    private String departamento;

    private double salario;


    public Funcionario(String nome, String departamento, double salario){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDepartamento(){
        return  this.departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public double getSalario(){
        return  this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
        double aumento = this.salario * (percentual / 100);
        this.salario += aumento;
        System.out.print("Seu novo salário é: R$" + this.salario);
    }
}

