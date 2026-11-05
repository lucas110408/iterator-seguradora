package iterator;

public class Apolice {

    private String numero;
    private boolean ativa;

    public Apolice(String numero, boolean ativa) {
        this.numero = numero;
        this.ativa = ativa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
