package Persistencia;

import Model.Entidade;

public abstract class Persistencia {

    public abstract void incluir (Entidade entidade);

    public abstract void excluir (Entidade entidade);

    public abstract void alterar (Entidade entidade);

    public abstract void buscar (Entidade entidade, String nome);

    public abstract void buscar (Entidade entidade, int id);
}
