package Model;
import java.util.*;

public class Venda extends Entidade{
    
    private Date data;
    private String cliente;
    


    public String getCliente() {
        return cliente;
    }
    
    public Date getDate() {
        return data;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setDate(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDate: " + this.data + "\nCliente: " + this.cliente;
    }


}
