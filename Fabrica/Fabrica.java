package Fabrica;

import Controlador.Controlador;
import Model.Entidade;
import Persistencia.Persistencia;
import Visao.Menu;

public abstract class Fabrica {

    public abstract Controlador packControlador ();

    public abstract Entidade packModel ();

    public abstract Persistencia packPersistencia ();

    public abstract Menu packVisao ();

    public static Fabrica getFactory (String nome){

        if(nome.equals("Produto")){
            return new FabricaProd();
        }else {
            return new FabricaVenda();
        }
        
    }
    
}
