package settakassa.saldorente.leveranse;

import settakassa.core.EntityId;
import settakassa.domene.Oppgave;

public class OppgaveSaldoRente extends Oppgave {

    public OppgaveSaldoRente(EntityId<Integer> id) {
        super(id);
    }

    @Override
    public String getIdentifikatorer() {
        return null;
    }

}
