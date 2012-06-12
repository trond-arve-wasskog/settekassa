package settakassa.felles.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class OppgavegiverGyldighetskontroll implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Gyldighetskontroll oppgavegiver for leveranse med id %s", id));
    }

}
