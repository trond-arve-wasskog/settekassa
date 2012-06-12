package settakassa.saldorente.oppgave;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class OppgaveSannsynlighetskontroll implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Sannsynlighetskontroll for oppgave med id %s", id));
    }

}
