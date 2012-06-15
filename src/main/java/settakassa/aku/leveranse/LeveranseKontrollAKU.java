package settakassa.aku.leveranse;

import settakassa.aku.domene.OppgaveAku;
import settakassa.felles.leveranse.Innsenderkontroll;
import settakassa.saldorente.leveranse.GenererKvittering;
import settakassa.saldorente.leveranse.Kvalitetskontroll;
import settakassa.saldorente.leveranse.Leveransekontroll;

public class LeveranseKontrollAKU extends Leveransekontroll<OppgaveAku> {

    public LeveranseKontrollAKU() {
        super(OppgaveAku.class);
        // TODO: Likte ikke denne...
        makroExecutable.clear();
        makroExecutable.add(new OppgavegiverkontrollAKU());
        makroExecutable.add(new Innsenderkontroll());
        makroExecutable.add(new OppgavekontrollAKU());
        makroExecutable.add(new Kvalitetskontroll());
        makroExecutable.add(new GenererKvittering());
    }

}
