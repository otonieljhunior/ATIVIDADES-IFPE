import java.util.ArrayList;

public abstract class EmendaParlamentar {
    private int id;
    private String tipo;
    private String autor;
    private String descricao;
    private ArrayList<Documento> listaDocumentos;

    public EmendaParlamentar(int id, String tipo, String autor, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.autor = autor;
        this.descricao = descricao;
        this.listaDocumentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Documento> getDocumentos() {
        return listaDocumentos;
    }

    public void addDocumento(Documento doc) {
        this.listaDocumentos.add(doc);
    }

    public float calcularValorTotalPorFase(String fase) {
        float total = 0;
        for (Documento d : listaDocumentos) {
            if (d.getFase().equalsIgnoreCase(fase)) {
                total += d.getValor();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "EmendaParlamentar [id=" + id + ", tipo=" + tipo + ", autor=" + autor + ", descricao=" + descricao + "]";
    }
}
