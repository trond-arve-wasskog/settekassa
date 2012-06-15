package settakassa.felles.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.domene.LeveranseId;

public class Oppgavegiverkontroll extends MakroExecutable<LeveranseId> {
    public Oppgavegiverkontroll() {
        add(new IdentifisereOppgavegiver());
        add(new OppgavegiverGyldighetskontroll());
    }

}
