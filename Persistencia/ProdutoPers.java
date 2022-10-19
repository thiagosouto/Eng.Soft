package Persistencia;

import Model.Entidade;


public class ProdutoPers extends Persistencia {

    private static ProdutoPers uniqueInstance;

    private  ProdutoPers(){
    }

    public static ProdutoPers getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new ProdutoPers(); 

        return uniqueInstance;
    }

    public static void setInstance(ProdutoPers uniqueInstance) {
        ProdutoPers.uniqueInstance = uniqueInstance;
    }

    public void incluir (Entidade entidade){

    } 

    public void excluir (Entidade entidade){
        
    } 

    public void alterar (Entidade entidade){
        
    } 

    public void buscar (Entidade entidade, String nome){
        
    } 

    public void buscar (Entidade entidade, int id){
        
    } 
}
