public class ChamadoHelpDesk {

    private String matricula;
    private String descricao;
    private String situacao;

    public ChamadoHelpDesk(String matricula, String descricao) {
        this.matricula = matricula;
        this.descricao = descricao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirChamado() {
        this.situacao = "Chamado Aberto";
    }

    public void fecharChamado() {
        this.situacao = "Chamado Fechado";
    }
}
