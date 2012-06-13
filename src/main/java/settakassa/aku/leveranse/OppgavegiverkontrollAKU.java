package settakassa.aku.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.felles.leveranse.OppgavegiverGyldighetskontroll;

public class OppgavegiverkontrollAKU extends MakroExecutable {
    public OppgavegiverkontrollAKU() {
        add(new IdentifisereOppgavegiverAKU());
        add(new OppgavegiverGyldighetskontroll());
    }

}
