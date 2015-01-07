package model;

public class Cargo {
    private int codigo;
     private String descricao;

    public Cargo(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Cargo() {
    }
 
     
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
}
