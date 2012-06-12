package settakassa.saldorente.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class LeveranseKvalitetskontroll implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Kvalitetskontroll for leveranse med id %s", id));
    }

}
