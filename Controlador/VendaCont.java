package Controlador;

import java.util.ArrayList;

import Fabrica.FabricaVenda;
import Model.Entidade;
import Model.Venda;
import Persistencia.VendaPers;

public class VendaCont extends Controlador{

    @Override
    public void incluir(){
        Scanner ler = new Scanner(System.in);
        String nome = "Venda";
        Fabrica fabrica = getFactory(nome);
        Venda venda = FabricaVenda.packModel();

        System.out.println("\nInsira o nome: ");
        String nome = ler.nextLine();
        nome = Venda.setNome();

        System.out.println("\nInsira a Data: ");
        Date data = ler.nextLine();
        data = Venda.setDate();
    }

    @Override
    public busca (Integer id){
        VendaPers venda = VendaPers.getUniqueInstance();

        ArrayList<Entidade> list = venda.getList();

        boolean busca = true;

        while(busca){
            for(Entidade obj :list){
                if(obj.getId().equals(id)){
                    busca = false;
                    return obj;
                }
                if(busca){
                    System.out.println("\nNão encontrado.");
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public busca (String nome){
        VendaPers venda = VendaPers.getUniqueInstance();

        ArrayList<Entidade> list = venda.getList();

        boolean busca = true;

        while(busca){
            for(Entidade obj :list){
                if(obj.getNome().equals(nome)){
                    busca = false;
                    return obj;
                }
                if(busca){
                    System.out.println("\nNão encontrado.");
                    return null;
                }
            }
        }
        return null;
    }    
    
}
