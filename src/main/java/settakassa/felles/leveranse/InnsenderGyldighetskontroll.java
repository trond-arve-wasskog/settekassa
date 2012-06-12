package settakassa.felles.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;

public class InnsenderGyldighetskontroll implements Executable {
    public void execute(EntityId id) {
        System.out.println(String.format("Gyldighetskontroll for leveranse med id %s", id));
    }

}
