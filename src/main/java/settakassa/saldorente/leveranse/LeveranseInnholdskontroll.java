package settakassa.saldorente.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class LeveranseInnholdskontroll implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Innholdskontroll for leveranse med id %s", id));
    }

}
