package settakassa.aku.domene;

import settakassa.domene.Oppgave;
import settakassa.domene.OppgaveId;

public class OppgaveAku extends Oppgave {

    @Override
    public String getIdentifikatorer() {
        // I forbindelse med oppgaveeier identifisering
        return null;
    }

    @Override
    public OppgaveId getOppgaveId() {
        return new OppgaveId(id.getVerdi());
    }

    @Override
    public void innholdskontroll() {
    }

}
