package settakassa.aku.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class IdentifisereOppgavegiverAKU implements Executable {

    public void execute(EntityId id) {
        // hente partsnummer på innsendingen og sjekke at dette finnes i partsregisteret
        // og sette dette på oppgavegivers partsnummer
    }

}
