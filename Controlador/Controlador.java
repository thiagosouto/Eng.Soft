package Controlador;

import Model.Entidade;
import Persistencia.Persistencia;
import Persistencia.ProdutoPers;
import Persistencia.VendaPers;

public class Controlador {

    public Entidade busca(Entidade entidade, Integer id){
        return null;
    }

    public Entidade busca(Entidade entidade, String nome){
        return null;
    }

    public static void sairPrograma(){
        ProdutoPers produto = ProdutoPers.getUniqueInstance();
        VendaPers venda = VendaPers.getUniqueInstance();

        Persistencia.PersistenciaSalva(produto.getList(), "Produto.txt");
        Persistencia.PersistenciaSalva(venda.getList(), "Venda.txt");
        
    }
    
}
