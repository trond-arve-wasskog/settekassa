package settakassa.saldorente.leveranse;

import settakassa.core.Executable;
import settakassa.domene.LeveranseId;

public class Innholdskontroll implements Executable<LeveranseId> {
    public void execute(LeveranseId id) {
        System.out.println(String.format("Innholdskontroll for leveranse med id %s", id));
    }

}
