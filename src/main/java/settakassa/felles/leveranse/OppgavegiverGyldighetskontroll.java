package settakassa.felles.leveranse;

import settakassa.core.Executable;
import settakassa.domene.LeveranseId;

public class OppgavegiverGyldighetskontroll implements Executable<LeveranseId> {
    public void execute(LeveranseId id) {
        System.out.println(String.format("Gyldighetskontroll oppgavegiver for leveranse med id %s", id));
    }

}
