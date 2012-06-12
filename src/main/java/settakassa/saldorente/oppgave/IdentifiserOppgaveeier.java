package settakassa.saldorente.oppgave;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class IdentifiserOppgaveeier implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Identifisere oppgaveeier for oppgave med id %s", id));
    }

}
