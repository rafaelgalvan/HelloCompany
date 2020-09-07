package hellocompany;

import java.text.NumberFormat;
import java.util.Locale;

public class HelloCompany {

    public static void main(String[] args)
    {
        Locale.setDefault(new Locale("pt", "BR"));
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        // Cadastro do  presidente
        Presidente pres = new Presidente(5000.00, 1, "Asdrubal Leôncio Correa", "11100");
        System.out.print("Presidente " + pres.getNome() + " cadastrado com sucesso!\n\n");
        
        //Cadastro das Secretárias
        Secretaria[] sec = new Secretaria[2];
        sec[0] = new Secretaria(2000.00, 2, "Fátima da Silva", "11111");
        sec[1] = new Secretaria(2000.00, 3, "Ana Maria", "11122");
        
        for (short i = 0; i < sec.length; i++) {
            System.out.print("Secretaria " + sec[i].getNome() + " cadastrada com sucesso!\n\n");
        }
        
        // Cadastro dos Vendedores
        Vendedor[] vd = new Vendedor[3];
        vd[0] = new Vendedor(300.00, 2500.00, 4, "João Pedro", "11133");
        vd[1] = new Vendedor(350.00, 2500.00, 5, "Vanessa da Mata", "11144");
        vd[2] = new Vendedor(250.00, 2500.00, 6, "Carlos José", "11155");
        for (short i = 0; i < vd.length; i++) {
            System.out.print("Vendedor(a) " + vd[i].getNome() + " cadastrado(a) com sucesso!\n\n");
        }
        
        // Cadastro dos Clientes
        Cliente[] cli = new Cliente[4];
        cli[0] = new Cliente("marcos", "senha11", "Marcos Frota", "22211");
        cli[1] = new Cliente("joana", "senha22", "Joana de Gusmão", "22222");
        cli[2] = new Cliente("elisa", "senha33", "Elisa Roberta", "22233");
        cli[3] = new Cliente("lucas", "teste", "Lucas Silva", "22244");
        
        for (short i = 0; i < cli.length; i++) {
            System.out.print("Cliente " + cli[i].getNome() + " cadastrado(a) com sucesso!\n\n");
        }
        
        System.out.print("==============================================\n\n");
        
        // Cadastro das comissões dos vendedores
        vd[0].setComissao(300.00);
        vd[1].setComissao(350.00);
        vd[2].setComissao(250.00);
        
        for (short i = 0; i < vd.length; i++) {
            System.out.print("A comissão do(a) vendedor(a) " 
                                    + vd[i].getNome() + " foi de: " 
                                    + nf.format(vd[i].getComissao()) + ".\n");
        }
        
        System.out.print("\n==============================================\n\n");
        
        // Cálculo do salário do Asdrubal e da Ana
        System.out.print("O salário anual do Presidente " + pres.getNome() 
                + " é: " + nf.format(pres.calculaSalarioAnual()) + ".\n");
        System.out.print("O salário anual da Secretária " + sec[1].getNome() 
                + " é: " + nf.format(sec[1].calculaSalarioAnual()) + ".\n\n");
        
        System.out.print("==============================================\n\n");
        
        /*O usuário Lucas esqueceu a senha dele. 
         *Verifique se a senha dele é "123456", "segredo" ou "teste".
         */
        System.out.print("Prezado " + cli[3].getNome() 
                + ", abaixo estão os resultados da verificação da sua senha.\n\n");
        
        System.out.print(cli[3].verificarSenha("123456") 
                ? "A senha '123456' está correta! Por favor, faça seu login.\n" 
                : "A senha '123456' está incorreta! Tente novamente.\n");
        
        System.out.print(cli[3].verificarSenha("segredo") 
                ? "A senha 'segredo' está correta! Por favor, faça seu login.\n" 
                : "A senha 'segredo' está incorreta! Tente novamente.\n");
        
        System.out.print(cli[3].verificarSenha("teste") 
                ? "A senha 'teste' está correta! Por favor, faça seu login.\n\n" 
                : "A senha 'teste' está incorreta! Tente novamente.\n\n");
        
        System.out.print("==============================================\n\n");
        
        // Exibe os dados do Presidente
        pres.exibeDados();
        
        // Exibe os dados das Secretárias
        for (short i = 0; i < sec.length; i++) {
            sec[i].exibeDados();
        }
        
        // Exibe os dados dos vendedores
        for (short i = 0; i < vd.length; i++) {
            vd[i].exibeDados();
        }
        
        // Exibe os dados dos clientes
        for (short i = 0; i < cli.length; i++) {
            cli[i].exibeDados();
        }
    } 
}