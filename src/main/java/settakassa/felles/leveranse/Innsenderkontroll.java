package settakassa.felles.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.domene.LeveranseId;

public class Innsenderkontroll extends MakroExecutable<LeveranseId> {
    public Innsenderkontroll() {
        add(new InnsenderGyldighetskontroll());
    }
}
