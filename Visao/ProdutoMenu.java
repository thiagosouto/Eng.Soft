package Visao;

import java.util.*;
import Model.Entidade;
import Model.Produto;

public class ProdutoMenu extends Menu{

    public void prodMenu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("--Produtos--");
        System.out.println("\n1- Incluir");
        System.out.println("\n2- Excluir");
        System.out.println("\n3- Alterar");
        System.out.println("\n4- Buscar pelo ID");
        System.out.println("\n5- Buscar pelo Nome");
        System.out.println("\n6- Voltar");

        int operador = 0;
        int id = 1;

        operador = ler.nextInt();

        while(operador != 6){
            switch(operador){
                case 1:
                Controlador.incluir();
                break;

                case 2:
                Controlador.excluir();
                break;

                case 3:
                Controlador.alterar();
                break;

                case 4:
                System.out.println("\nInforme o id: ");
                int id = ler.nextInt();
                Controlador.busca(id);
                break;

                case 5:
                System.out.println("\nInforme o nome: ");
                String nome = ler.nextLine();
                Controlador.busca(nome);
                break;

                case 6:
                operardor = 6;
                break;

                default:
                break;
            }
        }
        
    }

}
