package Visao;

import java.util.*;

public class PrincipalMenu extends Menu{

    public void mostrarMenu(){
        Scanner ler = new Scanner(System.in);
        int operador = 5;
        while(operador != 0){
            System.out.println("Menu Principal\n");
            System.out.println("1- Produto\n");
            System.out.println("2- Venda\n");
            System.out.println("0- Sair\n");

            operador = ler.nextInt();

            switch(operador){
                case 1:
                String nome = "Produto";
                Fabrica Fabrica = getFactory(nome);
                Produto produto = FabricaProd.packModel();
                ProdutoMenu();
                break;

                case 2:
                String nome = "Venda";
                Fabrica.getFactory(nome);
                Produto produto = FabricaVenda.packModel();
                VendaMenu();
                break;

                case 0:
                operador = 0;
                break;

                default:
                break;

            }

        }
    }
    
}
