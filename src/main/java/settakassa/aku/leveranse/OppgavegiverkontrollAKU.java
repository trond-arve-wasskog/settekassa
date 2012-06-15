package settakassa.aku.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.domene.LeveranseId;
import settakassa.felles.leveranse.OppgavegiverGyldighetskontroll;

public class OppgavegiverkontrollAKU extends MakroExecutable<LeveranseId> {
    public OppgavegiverkontrollAKU() {
        add(new IdentifisereOppgavegiverAKU());
        add(new OppgavegiverGyldighetskontroll());
    }

}
