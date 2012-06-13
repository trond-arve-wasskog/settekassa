package settakassa.saldorente.leveranse;

import settakassa.core.EntityId;
import settakassa.domene.Oppgave;
import settakassa.felles.fil.LastOppLeveranse;

public class LastOppLeveranseSaldoRente extends LastOppLeveranse {

    @Override
    protected Oppgave lagNyOppgave() {
        return new OppgaveSaldoRente(new EntityId<Integer>(20));
    }

}
