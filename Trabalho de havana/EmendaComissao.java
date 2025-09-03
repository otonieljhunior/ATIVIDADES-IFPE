public class EmendaComissao extends EmendaParlamentar {
    private String linkComissao;
    private String[] listaMembros;
    private String linkRelatorio;
    private String parlamentarSugeridor;

    public EmendaComissao(int id, String autor, String descricao, String linkComissao, String[] listaMembros, String linkRelatorio, String parlamentarSugeridor) {
        super(id, "Comissao", autor, descricao);
        this.linkComissao = linkComissao;
        this.listaMembros = listaMembros;
        this.linkRelatorio = linkRelatorio;
        this.parlamentarSugeridor = parlamentarSugeridor;
    }

    public String getLinkComissao() {
        return linkComissao;
    }

    public void setLinkComissao(String linkComissao) {
        this.linkComissao = linkComissao;
    }

    public String[] getListaMembros() {
        return listaMembros;
    }

    public void setListaMembros(String[] listaMembros) {
        this.listaMembros = listaMembros;
    }

    public String getLinkRelatorio() {
        return linkRelatorio;
    }

    public void setLinkRelatorio(String linkRelatorio) {
        this.linkRelatorio = linkRelatorio;
    }

    public String getParlamentarSugeridor() {
        return parlamentarSugeridor;
    }

    public void setParlamentarSugeridor(String parlamentarSugeridor) {
        this.parlamentarSugeridor = parlamentarSugeridor;
    }

    @Override
    public String toString() {
        return super.toString() + " EmendaComissao [linkComissao=" + linkComissao + ", parlamentarSugeridor=" + parlamentarSugeridor + "]";
    }
}
