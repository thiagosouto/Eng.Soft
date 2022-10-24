package Controlador;

import java.util.ArrayList;

import Fabrica.FabricaProd;
import Model.Entidade;
import Model.Produto;
import Persistencia.ProdutoPers;

public class ProdutoCont extends Controlador {

    @Override
    public void incluir(){
        Scanner ler = new Scanner(System.in);
        String nome = "Produto";
        Fabrica fabrica = getFactory(nome);
        Produto produto = FabricaProd.packModel();

        System.out.println("\nNome do produto: ");
        String nome = ler.nextLine();
        protudo.setNome(nome);

        System.out.println("\nInforme o ID: ");        
        int id= ler.nextInt();
        produto.setId(id);
                
        System.out.println("\nInforme a quantidade: ");
        int quant = ler.nextInt();
        produto.setQuantidade(quant);

        System.out.println("\nInforme o valor: ");
        float valor = ler.nextFloat();
        produto.setValor(valor);
    }
    
    @Override
    public Entidade busca(Entidade entidade, Integer id){
        ProdutoPers produto = ProdutoPers.getUniqueInstance();

        boolean busca = true;

        while(busca){
            for(Entidade obj : list){
                if(obj.getId().equals(id)){
                    busca = false;
                    return obj;
                }
            }
            if(busca){
                System.out.println("\nNão encontrado.");
                return null;
            }
        }
        return null;
    }

    @Override
    public Entidade busca(Entidade entidade, String nome){
        ProdutoPers protudo = ProdutoPers.getUniqueInstance();

        boolean busca = true;

        while(busca){
            for(Entidade obj : list){
                if(obj.getNome().equals(nome)){
                    busca = false;
                    return obj;
                }
            }
            if(busca){
                System.out.println("\nNão encontrado.");
                return null;
            }
        }
        return null;
    }

}
