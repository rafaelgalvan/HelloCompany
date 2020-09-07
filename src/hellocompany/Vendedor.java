package hellocompany;

public class Vendedor extends Funcionario {

    private double comissao;

    private Vendedor ()
    {
        this(0, 0, 0, "", "");
    }
    public Vendedor(double comissao, double salario, int ramal, String nome, String documento)
    {
        super(salario, ramal, nome, documento);
        this.comissao = comissao;
    }
    
    // Soma o salário com a comissão
    public double salarioMesComComissao()
    {
        double salarioMes = this.salario + this.comissao;
        return salarioMes;
    }
    
    @Override
    public void exibeDados()
    {
        System.out.print("Papel da pessoa: Vendedor.\n");
        super.exibeDados();
    }

    public double getComissao()
    {
        return comissao;
    }

    public void setComissao(double comissao)
    {
        this.comissao = comissao;
    }
}
