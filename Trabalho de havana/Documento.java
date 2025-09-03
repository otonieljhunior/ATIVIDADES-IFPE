public class Documento {
    private String data;
    private String fase;
    private float valor;

    public Documento(String data, String fase, float valor) {
        this.data = data;
        this.fase = fase;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Documento [data=" + data + ", fase=" + fase + ", valor=" + valor + "]";
    }
}
