package Visao;

import java.util.*;

public class VendaMenu extends Menu{

    public void vendaMenu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("--Venda--");
        System.out.println("\n1- Incluir");
        System.out.println("\n2- Excluir");
        System.out.println("\n3- Alterar");
        System.out.println("\n4- Buscar pelo ID");
        System.out.println("\n5- Buscar pelo Nome");
        System.out.println("\n6- Voltar");

        int operador = 0;

        operador = ler.nextInt();

        while(operador != 6){
            switch(operador){
                case 1:
                incluir();
                break;

                case 2:
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;

                case 6:
                operardor = 6;
                break;

                default:
                break;
            }
        }
        
    }

    public static void incluir(){
        String nome = "Venda";
        Fabrica fabrica = getFactory(nome);
        Venda venda = FabricaVenda.packModel();

        System.out.println("Informe o nome do Cliente: ");
        String cliente = ler.nextLine();
        venda = venda.setCliente(cliente);

        System.out.println("Informe a Data: ");
        Date data = ler.nextLine();
        venda = venda.setDate(data);
    }
    
}
