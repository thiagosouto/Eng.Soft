package Model;

public class Entidade {

    private int id;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "\nID: " + this.id;
    }

}
