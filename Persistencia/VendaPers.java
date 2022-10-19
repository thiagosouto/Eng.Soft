package Persistencia;

import Model.Entidade;

public class VendaPers extends Persistencia {

    private static VendaPers uniqueInstance;

    private  VendaPers(){


    }

    public static VendaPers getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new VendaPers(); 

        return uniqueInstance;
    }

    public static void setInstance(VendaPers uniqueInstance) {
        VendaPers.uniqueInstance = uniqueInstance;
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
