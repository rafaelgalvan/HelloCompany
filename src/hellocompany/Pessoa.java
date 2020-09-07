package hellocompany;

public abstract class Pessoa {
    protected String nome;
    protected String documento;
    
    public Pessoa () 
    {
        this("", "");
    }
    
    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }
    
    public abstract void exibeDados();

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDocumento()
    {
        return documento;
    }

    public void setDocumento(String documento)
    {
        this.documento = documento;
    }
}