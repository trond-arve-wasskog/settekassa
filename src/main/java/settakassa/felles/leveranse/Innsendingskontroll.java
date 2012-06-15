package settakassa.felles.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.domene.Innsending;

public class Innsendingskontroll extends MakroExecutable<Innsending> {

    public Innsendingskontroll() {
        add(new IdentifisereInnsender());
        add(new Filkontroll());
    }

}
