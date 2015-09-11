
package Controller;

import java.util.ArrayList;

public class GerenciadorFila {
    
    ArrayList<String> pessoas;
    private int quant = 0;
    
    public GerenciadorFila()
    {
        pessoas = new ArrayList<>();
        
    }
    
    public void adicionarPessoa(String nome)
    {
        pessoas.add(nome);
        this.quant++;
    }
    
    public void removerPessoa()
    {
        pessoas.remove(0);
        this.quant--;
    }

    public int getQuant() {
        return quant;
    }
    public void conferirPessoas()
    {
        for (int i=0; i < this.quant; i++)
        {
            System.out.println(pessoas.get(i));
        }
    }
    
    
}
