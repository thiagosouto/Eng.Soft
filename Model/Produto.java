package Model;

public class Produto extends Entidade{

    private int quantidade;
    private String nome;
    private float valor;
    
    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }
    
    public float getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nNome: " + this.nome + "\nQuantidade: " + this.quantidade + "\nValor: " + this.valor ;
    }

    
}
