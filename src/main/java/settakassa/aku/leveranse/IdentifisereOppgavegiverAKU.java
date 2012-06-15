package settakassa.aku.leveranse;

import settakassa.core.Executable;
import settakassa.domene.LeveranseId;

public class IdentifisereOppgavegiverAKU implements Executable<LeveranseId> {

    public void execute(LeveranseId leveranseId) {
        // hente partsnummer på innsendingen og sjekke at dette finnes i partsregisteret
        // og sette dette på oppgavegivers partsnummer
    }

}
