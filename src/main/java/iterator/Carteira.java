package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Carteira implements Iterable<Apolice> {

    private List<Apolice> apolices = new ArrayList<Apolice>();

    public Carteira(Apolice... apolices) {
        this.apolices = Arrays.asList(apolices);
    }

    @Override
    public Iterator<Apolice> iterator() {
        return apolices.iterator();
    }

}
