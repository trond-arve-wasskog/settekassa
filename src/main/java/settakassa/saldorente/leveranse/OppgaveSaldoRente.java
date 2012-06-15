package settakassa.saldorente.leveranse;

import settakassa.domene.Oppgave;
import settakassa.domene.OppgaveId;

public class OppgaveSaldoRente extends Oppgave {

    @Override
    public String getIdentifikatorer() {
        return null;
    }

    @Override
    public void innholdskontroll() {
    }

    @Override
    public OppgaveId getOppgaveId() {
        // her returneres oppgaveId som er spesifikk for SaldoRente
        return new OppgaveId(id.getVerdi());
    }

}
