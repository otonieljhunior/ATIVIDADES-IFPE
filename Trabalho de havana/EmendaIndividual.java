public class EmendaIndividual extends EmendaParlamentar {
    private String modalidade;

    public EmendaIndividual(int id, String autor, String descricao, String modalidade) {
        super(id, "Individual", autor, descricao);
        this.modalidade = modalidade;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return super.toString() + " EmendaIndividual [modalidade=" + modalidade + "]";
    }
}
