package devandroid.kevin.empresa;

public class Empresa {

    private String nomeVendador;
    private String id;
    private String produto;
    private String empresa;
    private String Cargo;

    public  Empresa(){}
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getNomeVendador() {
        return nomeVendador;
    }

    public void setNomeVendador(String nomeVendador) {
        this.nomeVendador = nomeVendador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nomeVendador='" + nomeVendador + '\'' +
                ", id='" + id + '\'' +
                ", produto='" + produto + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}

