package settakassa.aku.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.felles.leveranse.Innsenderkontroll;
import settakassa.saldorente.leveranse.Leveransekontroll;

public class KontrollAKU extends MakroExecutable {

    public KontrollAKU() {
        add(new Innsenderkontroll());
        add(new OppgavegiverkontrollAKU());
        add(new OppgavekontrollAKU());
        add(new Leveransekontroll());
    }

}
