package modelo.bean;
public class Produto {
    private int id;
    private int qtd;
    private int cdb; 
    private String descricao;
    private double valorC;
    private double valorV;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getCdb() {
        return cdb;
    }

    public void setCdb(int cdb) {
        this.cdb = cdb;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorC() {
        return valorC;
    }

    public void setValorC(double valorC) {
        this.valorC = valorC;
    }

    public double getValorV() {
        return valorV;
    }

    public void setValorV(double valorV) {
        this.valorV = valorV;

}

}
