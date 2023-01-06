public class FecharChamadoHelpDeskTarefa implements Tarefa{

    private ChamadoHelpDesk chamado;

    public FecharChamadoHelpDeskTarefa(ChamadoHelpDesk chamado) {
        this.chamado = chamado;
    }

    @Override
    public void executar() {
        this.chamado.fecharChamado();
    }

    @Override
    public void cancelar() {
        this.chamado.abrirChamado();
    }
}
