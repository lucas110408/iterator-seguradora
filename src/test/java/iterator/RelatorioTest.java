package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarApolicesAtivasCarteira() {
        Carteira carteira = new Carteira(
                new Apolice("2026-1", true),
                new Apolice("2026-2", false),
                new Apolice("2026-3", true),
                new Apolice("2026-4", false),
                new Apolice("2026-5", true)
        );
        assertEquals(3, Relatorio.contarApolicesAtivasCarteira(carteira));
    }

    @Test
    void deveContarTotalApolicesCarteira() {
        Carteira carteira = new Carteira(
                new Apolice("2026-1", true),
                new Apolice("2026-2", false),
                new Apolice("2026-3", true),
                new Apolice("2026-4", false),
                new Apolice("2026-5", true)
        );
        assertEquals(5, Relatorio.contarTotalApolicesCarteira(carteira));
    }

}
