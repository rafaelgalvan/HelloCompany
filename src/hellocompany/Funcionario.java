package hellocompany;

public abstract class Funcionario extends Pessoa {

    protected double salario;
    protected int ramal;

    public Funcionario()
    {
        this(0, 0, "", "");
    }

    public Funcionario(double salario, int ramal, String nome, String documento)
    {
        super(nome, documento);
        this.salario = salario;
        this.ramal = ramal;
    }
    
    public double calculaSalarioAnual()
    {
        // Salário dos 12 meses + décimo terceiro.
        double salarioAnual = (this.salario * 12) + this.salario;
        return salarioAnual;
    }        
    
    @Override
    public void exibeDados()
    {
        System.out.print("Nome do(a) funcionário(a): " + this.nome + "\n");
        System.out.print("Documento(a) do funcionário(a): " + this.documento + "\n\n");
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public int getRamal()
    {
        return ramal;
    }

    public void setRamal(int ramal)
    {
        this.ramal = ramal;
    }
}