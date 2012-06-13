package settakassa.aku.leveranse;

import settakassa.aku.domene.OppgaveAku;
import settakassa.core.EntityId;
import settakassa.domene.Oppgave;
import settakassa.felles.fil.LastOppLeveranse;

public class LastOppLeveranseAku extends LastOppLeveranse {

    @Override
    protected Oppgave lagNyOppgave() {
        return new OppgaveAku(new EntityId<Integer>(10));
    }

}
