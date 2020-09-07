package hellocompany;

public class Presidente extends Funcionario {

    public Presidente()
    {
        this(0, 0, "", "");
    }

    public Presidente(double salario, int ramal, String nome, String documento)
    {
        super(salario, ramal, nome, documento);
    }
    
    @Override
    public void exibeDados()
    {
        System.out.print("Papel da pessoa: Presidente.\n");
        super.exibeDados(); 
    }
    
}
