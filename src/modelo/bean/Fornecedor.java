package modelo.bean;
/**
 *
 * @author adrya
 */
public class Fornecedor {
    private int id;
    private String nome;
    private String cpf;
    private String cnpj;
    private String rgIr;
    private String obs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRgIr() {
        return rgIr;
    }

    public void setRgIr(String rgIr) {
        this.rgIr = rgIr;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
  
}
