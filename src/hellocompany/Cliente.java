package hellocompany;

public class Cliente extends Pessoa {

    private String usuario;
    private String senha;
    
    public Cliente()
    {
        this("", "", "", "");
    }

    public Cliente(String usuario, String senha, String nome, String documento)
    {
        super(nome, documento);
        this.usuario = usuario;
        this.senha = senha;
    }
    
    // Verifica se a senha informada é a mesma que a senha armazenada
    public boolean verificarSenha(String s)
    {
        return s.equals(this.senha);
    }
    
    @Override
    public void exibeDados()
    {
        System.out.print("Papel da pessoa: Cliente.\n");
        System.out.print("Nome do(a) cliente: " + this.nome + ".\n");
        System.out.print("Documento do(a) cliente: " + this.documento + ".\n\n");
    }

    public String getUsuario()
    {
        return usuario;
    }

    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }   
}