package settakassa.saldorente.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.domene.LeveranseId;

public class Kvalitetskontroll extends MakroExecutable<LeveranseId> {

    public Kvalitetskontroll() {
        add(new Innholdskontroll());
        add(new Sannsynlighetskontroll());
        // Kvalitetsvurdering som eget steg...
    }

}
