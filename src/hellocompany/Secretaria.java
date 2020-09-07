package hellocompany;

public class Secretaria extends Funcionario {

    public Secretaria()
    {
        this(0, 0, "", "");
    }
    
    public Secretaria(double salario, int ramal, String nome, String documento)
    {
        super(salario, ramal, nome, documento);
    }
    
    @Override
    public void exibeDados()
    {
        System.out.print("Papel da pessoa: Secretária.\n");
        super.exibeDados();
    }
}