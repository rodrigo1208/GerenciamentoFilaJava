
package view;


public class Interfaces {
    public void menuPrincipal(int valor)
    {
        System.out.println("    " + valor + " Na fila                       ");
        System.out.println("    1 - Adicionar pessoa ao final  ");
        System.out.println("    2 - Chamar proximo    ");
        System.out.println("    3 - Confererir pessoas da fila");
        System.out.println("    4 - Sair              ");
        System.out.print("--> ");
    }
    public void limpaTela()
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("");
        }
    }
}
