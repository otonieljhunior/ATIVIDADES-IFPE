public class EmendaRelator extends EmendaParlamentar {
    private String relator;
    private String autorEmenda;
    private String beneficiarioFinal;

    public EmendaRelator(int id, String autor, String descricao, String relator, String autorEmenda, String beneficiarioFinal) {
        super(id, "Relator", autor, descricao);
        this.relator = relator;
        this.autorEmenda = autorEmenda;
        this.beneficiarioFinal = beneficiarioFinal;
    }

    public String getRelator() {
        return relator;
    }

    public void setRelator(String relator) {
        this.relator = relator;
    }

    public String getAutorEmenda() {
        return autorEmenda;
    }

    public void setAutorEmenda(String autorEmenda) {
        this.autorEmenda = autorEmenda;
    }

    public String getBeneficiarioFinal() {
        return beneficiarioFinal;
    }

    public void setBeneficiarioFinal(String beneficiarioFinal) {
        this.beneficiarioFinal = beneficiarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " EmendaRelator [relator=" + relator + ", beneficiarioFinal=" + beneficiarioFinal + "]";
    }
}
