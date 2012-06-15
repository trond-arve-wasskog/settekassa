package settakassa.service;

import settakassa.core.EntityId;
import settakassa.domene.Fil;
import settakassa.domene.Innsending;

public class InnsendingService {

    public Innsending hentNesteInnsending(String oppgavetype) {
        // leser innsending fra mottak og trekker ut leveransene
        Innsending innsending = new Innsending(oppgavetype);
        innsending.filer.add(new Fil(oppgavetype, new EntityId<Integer>(1)));
        return innsending;
    }

}
