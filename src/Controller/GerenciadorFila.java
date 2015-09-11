
package Controller;

import java.util.ArrayList;
import model.Pessoa;

public class GerenciadorFila {
    
    ArrayList<Pessoa> pessoas;
    private int quant = 0;
    
    public GerenciadorFila()
    {
        pessoas = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome)
    {
        Pessoa pessoa = new Pessoa(nome);
        pessoas.add(pessoa);
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
            System.out.println(pessoas.get(i).getNome());
        }
    }
    
    
}
