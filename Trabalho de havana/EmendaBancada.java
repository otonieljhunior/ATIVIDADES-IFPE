public class EmendaBancada extends EmendaParlamentar {
    private String[] listaParlamentares;
    private String linkAta;
    private String parlamentarSugeridor;

    public EmendaBancada(int id, String autor, String descricao, String[] listaParlamentares, String linkAta, String parlamentarSugeridor) {
        super(id, "Bancada", autor, descricao);
        this.listaParlamentares = listaParlamentares;
        this.linkAta = linkAta;
        this.parlamentarSugeridor = parlamentarSugeridor;
    }

    public String[] getListaParlamentares() {
        return listaParlamentares;
    }

    public void setListaParlamentares(String[] listaParlamentares) {
        this.listaParlamentares = listaParlamentares;
    }

    public String getLinkAta() {
        return linkAta;
    }

    public void setLinkAta(String linkAta) {
        this.linkAta = linkAta;
    }

    public String getParlamentarSugeridor() {
        return parlamentarSugeridor;
    }

    public void setParlamentarSugeridor(String parlamentarSugeridor) {
        this.parlamentarSugeridor = parlamentarSugeridor;
    }

    @Override
    public String toString() {
        return super.toString() + " EmendaBancada [linkAta=" + linkAta + ", parlamentarSugeridor=" + parlamentarSugeridor + "]";
    }
}
