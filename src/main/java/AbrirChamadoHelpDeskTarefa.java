public class AbrirChamadoHelpDeskTarefa implements Tarefa{

    private ChamadoHelpDesk chamado;

    public AbrirChamadoHelpDeskTarefa(ChamadoHelpDesk chamado) {
        this.chamado = chamado;
    }

    @Override
    public void executar() {
        this.chamado.abrirChamado();
    }

    @Override
    public void cancelar() {
        this.chamado.fecharChamado();
    }
}
