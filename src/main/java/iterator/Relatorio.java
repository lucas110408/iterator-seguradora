package iterator;

import java.util.Iterator;

public class Relatorio {

    public static Integer contarApolicesAtivasCarteira(Carteira carteira) {
        int quantidade = 0;
        for (Apolice apolice : carteira) {
            if (apolice.isAtiva()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalApolicesCarteira(Carteira carteira) {
        int quantidade = 0;
        for (Iterator a = carteira.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
