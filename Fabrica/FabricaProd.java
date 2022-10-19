package Fabrica;

import Controlador.Controlador;
import Controlador.ProdutoCont;
import Model.Entidade;
import Model.Produto;
import Persistencia.Persistencia;
import Persistencia.ProdutoPers;
import Visao.Menu;
import Visao.ProdutoMenu;

public class FabricaProd extends Fabrica {

    public Entidade packModel (){

        return new Produto();
    }

    public Controlador packControlador (){

        return new ProdutoCont();
                
    }

    public Persistencia packPersistencia (){

        return ProdutoPers.getInstance();
    }

    public Menu packVisao (){

        return new ProdutoMenu();
    }
}
