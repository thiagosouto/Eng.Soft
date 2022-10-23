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
        String nome = "Produto";
        Fabrica fabrica = getFactory(nome);
        Produto produto = FabricaProd.packModel();

        System.out.println("\nNome do produto: ");
        String nome = ler.nextLine();
        protudo.setNome(nome);
                
        produto.setId(id);
        id++;
                
        System.out.println("\nInforme a quantidade: ");
        int quant = ler.nextInt();
        produto.setQuantidade(quant);

        System.out.println("\nInforme o valor: ");
        float valor = ler.nextFloat();
        produto.setValor(valor);
    }

    public static void alterar(){
        String nome = "Produto";
        Fabrica fabrica = getFactory(nome);
        Produto produto = FabricaProd.packModel();
    }

    public static void excluir(){
        String nome = "Produto";
        Fabrica fabrica = getFactory(nome);
        Produto produto = FabricaProd.packModel();
    }

    public static void buscaID(){
        String nome = "Produto";
        Fabrica fabrica = getFactory(nome);
        Produto produto = FabricaProd.packModel();

        System.out.println("Informe o ID: ");
        int idBusca = ler.nextInt();
        int comparador;

        boolean busca = true;
        while(executando){
            comparador = produto.getId();
            if(comparador == id){
                System.out.println(produto.toString());
            }

            if(comparador == NULL){
                executando= false;
            }
        }

    }

    public static void buscaNome(){
        String nome = "Produto";
        Fabrica fabrica = getFactory(nome);
        Produto produto = FabricaProd.packModel();

        System.out.println("Informe o Nome: ");
        String nomeBusca = ler.nextLine();
        String comparador;

        boolean busca = true;
        while(executando){
            comparador = produto.getNome();
            if(comparador == nomeBusca){
                System.out.println(produto.toString()); 
            }

            if(comparador == NULL){
                executando= false;
            }
        }
    }

}
