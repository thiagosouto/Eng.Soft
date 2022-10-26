package Main;

import Persistencia.ProdutoPers;
import Persistencia.VendaPers;
import Persistencia.Persistencia;
import Visao.PrincipalMenu;

public class MVC(){
    public static void main(String[] args){
        ProdutoPers produto = ProdutoPers.getUniqueInstance();
        produto.setList(Persistencia.PersistenciaCarrega("Produdo.txt"));

        VendaPers venda = VendaPers.getUniqueInstance();
        venda.setList(Persistencia.PersistenciaCarrega("Venda.txt"));

        PrincipalMenu menu = new PrincipalMenu();
        menu.mostrarMenu();
    }
}