import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    Atendimento atendimento;
    ChamadoHelpDesk chamado;

    @BeforeEach
    void setUp() {
        atendimento = new Atendimento();
        chamado = new ChamadoHelpDesk("215468315", "Falha no sistema");
    }

    @Test
    void deveAbrirChamadoHelpDesk() {
        Tarefa abrirChamado = new AbrirChamadoHelpDeskTarefa(chamado);
        atendimento.executarTarefa(abrirChamado);

        assertEquals("Chamado Aberto", chamado.getSituacao());
    }

    @Test
    void deveFecharChamadoHelpDesk() {
        Tarefa fecharChamado = new FecharChamadoHelpDeskTarefa(chamado);
        atendimento.executarTarefa(fecharChamado);

        assertEquals("Chamado Fechado", chamado.getSituacao());
    }

    @Test
    void deveCancelarFechamentoChamadoHelpDesk() {
        Tarefa abrirChamado = new AbrirChamadoHelpDeskTarefa(chamado);
        Tarefa fecharChamado = new FecharChamadoHelpDeskTarefa(chamado);

        atendimento.executarTarefa(abrirChamado);
        atendimento.executarTarefa(fecharChamado);

        atendimento.cancelarUltimaTarefa();

        assertEquals("Chamado Aberto", chamado.getSituacao());
    }
}