package filadepessoas;

import Controller.GerenciadorFila;
import java.util.Scanner;
import view.Interfaces;
import model.Pessoa;

public class FilaDePessoas {

    
    public static void main(String[] args) {
        GerenciadorFila gerenciador = new GerenciadorFila();
        Interfaces inter = new Interfaces();
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        String continua;
        do
        {
            
            inter.menuPrincipal(gerenciador.getQuant());
            opcao = entrada.nextInt();
            switch(opcao)
            {
                case 1:
                    System.out.print("Nome da pessoa: ");
                    String pessoa = entrada.next();
                    gerenciador.adicionarPessoa(pessoa);
                    System.out.println("Pessoa adicionada");
                    continua = entrada.next();
                    break;
                case 2:
                    gerenciador.removerPessoa();
                    System.out.println("A fila andou");
                    continua = entrada.next();
                    break;
                case 3:
                    gerenciador.conferirPessoas();
                    continua = entrada.next();
                    break;
                    
                case 4: 
                    break;
            }
        }while(opcao != 4);
        
    }
    
}
