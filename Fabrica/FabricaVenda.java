package Fabrica;

import Controlador.Controlador;
import Controlador.VendaCont;
import Model.Entidade;
import Model.Venda;
import Persistencia.Persistencia;
import Persistencia.VendaPers;
import Visao.Menu;
import Visao.VendaMenu;

public class FabricaVenda extends Fabrica {

    public Entidade packModel (){

        return new Venda();
    }

    public Controlador packControlador (){

        return new VendaCont();
                
    }

    public Persistencia packPersistencia (){

        return VendaPers.getInstance();
    }

    public Menu packVisao (){

        return new VendaMenu();
    }

}