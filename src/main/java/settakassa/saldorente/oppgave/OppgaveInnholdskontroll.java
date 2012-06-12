package settakassa.saldorente.oppgave;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class OppgaveInnholdskontroll implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Innholdskontroll for oppgave med id %s", id));
    }

}
